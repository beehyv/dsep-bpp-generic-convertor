package com.beehyv.dsep.util;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;


public class SyncJobs {

    public static String getRecords(String url, String method) throws IOException {
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

    public static RestApi readRestApiJson(String path) throws IOException {
        InputStream inputStream = SyncJobs.class.getResourceAsStream(path);
        String jsonString = IOUtils.toString(inputStream, "UTF-8");
        JSONObject jsonObject = new JSONObject(jsonString);
        String url = (String) jsonObject.get("url");
        String method = (String) jsonObject.get("requestMethod");
        String catalogDescriptor = (String) jsonObject.get("catalogDescriptor");
        String providerDescriptor = (String) jsonObject.get("providerDescriptor");

        JSONArray attributes = (JSONArray) jsonObject.get("attributes");
        RestApi restApi =  new RestApi(url, method, createAttributesMap(attributes));
        restApi.setCatalogDescriptor(catalogDescriptor);
        restApi.setProviderDescriptor(providerDescriptor);
        return restApi;
    }

    private static LinkedHashMap<String, Attribute> createAttributesMap(JSONArray attributes) {
        LinkedHashMap<String, Attribute> attributesMap = new LinkedHashMap<>();
        LinkedHashMap<String, Attribute> childrensMap = new LinkedHashMap<>();
        for(Object attribute : attributes) {
            String becknField = (String) ((JSONObject) attribute).get("becknField");
            String apiField = (String) ((JSONObject) attribute).get("apiField");
            String type = (String) ((JSONObject) attribute).get("type");
            if(((JSONObject) attribute).has("children")) {
                JSONArray children = (JSONArray) ((JSONObject) attribute).get("children");
                 childrensMap = createAttributesMap(children);
            }
            attributesMap.put(becknField, new Attribute(apiField, type,childrensMap));
        }
        return attributesMap;
    }

    public static JSONObject addCatalogDescriptor(JSONObject message,String descriptor_name) {
        message.append("catalog", createDescriptor(descriptor_name));
        return message;
    }

    public static JSONArray addProviders(JSONObject message,  String id, String descriptor_name, RestApi restApi, String result) {
        JSONArray providers = new JSONArray();
        JSONObject provider = new JSONObject();
        provider.put("id", id);
        createDescriptor(provider, descriptor_name);
        providers.put(provider);
        JSONObject categories = new JSONObject();
        JSONArray categoriesArray = new JSONArray();
        categories.put("categories", categoriesArray);
        providers.put(categories);
        message.put("providers", providers);
        return  providers;
    }

    public static JSONObject createDescriptor(JSONObject descriptor, String descriptor_name) {
        JSONObject name = new JSONObject();
        name.put("name", descriptor_name);
        descriptor.put("descriptor", name);
        return descriptor;
    }

    public static JSONObject createDescriptor(String descriptor_name) {
        JSONObject descriptor = new JSONObject();
        JSONObject name = new JSONObject();
        name.put("name", descriptor_name);
        descriptor.put("descriptor", name);
        return descriptor;
    }

    private static void fetchAllParams(JSONObject message, RestApi restApi, String result, String type) {
        JSONObject resultant =  new JSONObject(result);
        for(String originalAttribute : restApi.getAttributes().keySet()) {
            Attribute attribute = restApi.getAttributes().get(originalAttribute);
            if(attribute.getType().equals("array") && originalAttribute.equals(type)) {
                message.put(originalAttribute, createChildren(attribute, resultant));
            }
        }
    }


    private static JSONArray createChildren(Attribute attribute, JSONObject resultant) {
        JSONArray output = new JSONArray();
        JSONArray childrenArray = (JSONArray) resultant.get(attribute.getField());
        for(Object child : childrenArray) {
            JSONObject arrayItem = new JSONObject();
            for(String key : attribute.getChildren().keySet()) {
                        if(key.contains(".")) {
                            JSONObject part2 = new JSONObject();
                            part2.put(key.split("\\.")[1], ((JSONObject) child).get(attribute.getChildren().get(key).getField()));
                            arrayItem.put(key.split("\\.")[0], part2);
                        } else {
                            arrayItem.put(key, ((JSONObject) child).get(attribute.getChildren().get(key).getField()));
                        }
            }
            output.put(arrayItem);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        RestApi restApi = readRestApiJson("/restApi.json");
        String result =  getRecords(restApi.getUrl(), restApi.getMethod());

        JSONObject message = new JSONObject();
        addCatalogDescriptor(message,restApi.getCatalogDescriptor());
        addProviders(message,  UUID.randomUUID().toString(), restApi.getProviderDescriptor(), restApi, result);
        fetchAllParams(message, restApi, result, "items");
    }
}
