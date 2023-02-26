package com.beehyv.dsep.util;

import com.beehyv.dsep.model.Ack;
import com.beehyv.dsep.model.Catalog;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Error;
import com.beehyv.dsep.model.Item;
import com.beehyv.dsep.model.SearchPost200Response;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;


public class SyncJobs {

    private static String getRecords(String url, String method) throws IOException {
        URL urlConnection = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) urlConnection.openConnection();
        conn.setRequestMethod(method);

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }

    private static RestApi readRestApiJson(String path) throws IOException {
        InputStream inputStream = SyncJobs.class.getResourceAsStream(path);
        String jsonString = IOUtils.toString(inputStream, "UTF-8");
        JSONObject jsonObject = new JSONObject(jsonString);
        String url = (String) jsonObject.get("url");
        String method = (String) jsonObject.get("requestMethod");
        String catalogDescriptor = (String) jsonObject.get("catalogDescriptor");

        JSONArray attributes = (JSONArray) jsonObject.get("attributes");
        RestApi restApi = new RestApi(url, method, createAttributesMap(attributes));
        restApi.setCatalogDescriptor(catalogDescriptor);
        return restApi;
    }

    private static LinkedHashMap<String, Attribute> createAttributesMap(JSONArray attributes) {
        LinkedHashMap<String, Attribute> attributesMap = new LinkedHashMap<>();
        LinkedHashMap<String, Attribute> childrensMap = new LinkedHashMap<>();
        for (Object attribute : attributes) {
            String becknField = (String) ((JSONObject) attribute).get("becknField");
            String apiField = (String) ((JSONObject) attribute).get("apiField");
            String type = (String) ((JSONObject) attribute).get("type");
            if (((JSONObject) attribute).has("children")) {
                JSONArray children = (JSONArray) ((JSONObject) attribute).get("children");
                childrensMap = createAttributesMap(children);
            }
            attributesMap.put(becknField, new Attribute(apiField, type, childrensMap));
        }
        return attributesMap;
    }

    public static Catalog addCatalogDescriptor(SearchPost200ResponseMessage msg, String descriptor_name) {
        Catalog catalog = new Catalog();
        catalog.setDescriptor(createDescriptor(descriptor_name));
        msg.setCatalog(catalog);
        return catalog;
    }



    private static Descriptor createDescriptor(String descriptor_name) {
        Descriptor descriptor = new Descriptor();
        descriptor.setName(descriptor_name);
        return descriptor;
    }


    private static void fetchAllParams(SearchPost200ResponseMessage msg, RestApi restApi, String result) {
        JSONObject resultant = new JSONObject(result);
        for (String originalAttribute : restApi.getAttributes().keySet()) {
            Attribute attribute = restApi.getAttributes().get(originalAttribute);
            if (attribute.getType().equals("array") && originalAttribute.equals("items")) {
                List<Item> itemList = new ArrayList<>();
                itemList.addAll(createChildren(attribute, resultant));
                msg.setItems(itemList);
            }
        }
    }


    private static List<Item> createChildren(Attribute attribute, JSONObject resultant) {
        List<Item> items = new ArrayList<>();
        JSONArray childrenArray = (JSONArray) resultant.get(attribute.getField());
        for (Object child : childrenArray) {
            Item item = new Item();
            for (String key : attribute.getChildren().keySet()) {
                if (key.contains(".")) {
                    if(key.split("\\.")[0] == "descriptor" && key.split("\\.")[1] == "name") {
                        Descriptor descriptor = new Descriptor();
                        descriptor.setName((String) ((JSONObject) child).get(attribute.getChildren().get(key).getField()));
                        item.setDescriptor(descriptor);
                    }
                } else {
                    switch (key) {
                        case "id" : item.setId(String.valueOf(((JSONObject) child).get(attribute.getChildren().get(key).getField())));
                             break;
                        case "parent_item_id" : item.setParentItemId(String.valueOf(((JSONObject) child).get(attribute.getChildren().get(key).getField())));
                            break;
                        case "category_id" : item.setCategoryId( String.valueOf(((JSONObject) child).get(attribute.getChildren().get(key).getField())));
                            break;
                    }

                }
            }
            items.add(item);
        }
        return items;
    }

    public static SearchPost200ResponseMessage getAllJobs(SearchPost200ResponseMessage msg)  {
        JSONObject output = new JSONObject();
        try {
            RestApi restApi = readRestApiJson("/restApi.json");
            String result = getRecords(restApi.getUrl(), restApi.getMethod());
            addCatalogDescriptor(msg, restApi.getCatalogDescriptor());
            fetchAllParams(msg, restApi, result);

        }catch (IOException e) {
          Error error = new Error();
          error.setMessage(e.getMessage());
        }

        return msg;
    }


}
