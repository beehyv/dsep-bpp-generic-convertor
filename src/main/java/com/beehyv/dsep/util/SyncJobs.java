package com.beehyv.dsep.util;

import com.beehyv.dsep.model.Error;
import com.beehyv.dsep.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.List;
import java.util.Map;


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
        System.out.println("Output of Post Request" + response.toString());

        return response.toString();
    }

    private static String getRecordsWithoutKey(String url, String method) {
        return "{\"total\":16,\"jobs\":[{\"id\":91,\"fullname\":\"English and Aptitude Test\",\"displayname\":\"English and Aptitude Test\",\"shortname\":\"English and Aptitude Test\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10002,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":90,\"fullname\":\"US Placement Test\",\"displayname\":\"US Placement Test\",\"shortname\":\"US PT\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10003,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":89,\"fullname\":\"Placement Test IIIT Kancheepuram\",\"displayname\":\"Placement Test IIIT Kancheepuram\",\"shortname\":\"PT IIIT Kancheepuram\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10004,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[{\"id\":4653,\"fullname\":\"Ankit Bichar\"},{\"id\":4654,\"fullname\":\"Rajat g\"},{\"id\":4652,\"fullname\":\"Akash Jannu\"},{\"id\":4656,\"fullname\":\"Sai Krishna\"},{\"id\":4655,\"fullname\":\"Rajnish Kumar\"},{\"id\":4657,\"fullname\":\"Suresh Soren\"}],\"enrollmentmethods\":[\"manual\"]},{\"id\":88,\"fullname\":\"Placement Test IIIT Sricity\",\"displayname\":\"Placement Test IIIT Sricity\",\"shortname\":\"PT IIIT Sricity\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10005,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[{\"id\":4653,\"fullname\":\"Ankit Bichar\"},{\"id\":4654,\"fullname\":\"Rajat g\"},{\"id\":4652,\"fullname\":\"Akash Jannu\"},{\"id\":4656,\"fullname\":\"Sai Krishna\"},{\"id\":4655,\"fullname\":\"Rajnish Kumar\"},{\"id\":4657,\"fullname\":\"Suresh Soren\"}],\"enrollmentmethods\":[\"manual\"]},{\"id\":87,\"fullname\":\"Placement Test IIT Bhubaneswar 2022\",\"displayname\":\"Placement Test IIT Bhubaneswar 2022\",\"shortname\":\"PT IIT Bhubaneswar 2022\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10006,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":86,\"fullname\":\"Internal Aptitude Test\",\"displayname\":\"Internal Aptitude Test\",\"shortname\":\"Internal Aptitude Test\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10007,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":52,\"fullname\":\"ANGULAR SCREENING TEST\",\"displayname\":\"ANGULAR SCREENING TEST\",\"shortname\":\"ANGULAR SCREENING TEST\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10029,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":56,\"fullname\":\"React Screening Test\",\"displayname\":\"React Screening Test\",\"shortname\":\"React Screening Test\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10030,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":62,\"fullname\":\"Accounting Recruitment\",\"displayname\":\"Accounting Recruitment\",\"shortname\":\"Accounting Recruitment\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10036,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":59,\"fullname\":\"Sr QA TEST [Old]\",\"displayname\":\"Sr QA TEST [Old]\",\"shortname\":\"SR QA TEST [Old]\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10037,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":58,\"fullname\":\"QA TEST\",\"displayname\":\"QA TEST\",\"shortname\":\"QA TEST\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10038,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":57,\"fullname\":\" Examus Ind Integration Test\",\"displayname\":\" Examus Ind Integration Test\",\"shortname\":\"E I S IT\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10040,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":49,\"fullname\":\"Angular Test\",\"displayname\":\"Angular Test\",\"shortname\":\"Angular Test\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10041,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":48,\"fullname\":\"Java Test\",\"displayname\":\"Java Test\",\"shortname\":\"Java Test\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10042,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":44,\"fullname\":\"Accounting Recruitment [OLD]\",\"displayname\":\"Accounting Recruitment [OLD]\",\"shortname\":\"A RT \",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10046,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]},{\"id\":50,\"fullname\":\"React Test\",\"displayname\":\"React Test\",\"shortname\":\"React Test\",\"categoryid\":3,\"categoryname\":\"Recruitment 2022\",\"sortorder\":10047,\"summary\":\"\",\"summaryformat\":1,\"summaryfiles\":[],\"overviewfiles\":[],\"contacts\":[],\"enrollmentmethods\":[\"manual\"]}],\"warnings\":[]}";
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
                    if (key.equals("descriptor.name")) {
                        Descriptor descriptor = new Descriptor();
                        descriptor.setName((String) ((JSONObject) child).get(attribute.getChildren().get(key).getField()));
                        item.setDescriptor(descriptor);
                    }
                } else {
                    switch (key) {
                        case "id":
                            item.setId(String.valueOf(((JSONObject) child).get(attribute.getChildren().get(key).getField())));
                            break;
                        case "parent_item_id":
                            item.setParentItemId(String.valueOf(((JSONObject) child).get(attribute.getChildren().get(key).getField())));
                            break;
                        case "category_id":
                            item.setCategoryId(String.valueOf(((JSONObject) child).get(attribute.getChildren().get(key).getField())));
                            break;
                    }

                }
            }
            items.add(item);
        }
        return items;
    }

    public static SearchPost200ResponseMessage getAllJobs(SearchPost200ResponseMessage msg) {
        try {
            RestApi restApi = readRestApiJson("/restApi.json");
            String result = getRecordsWithoutKey(restApi.getUrl(), restApi.getMethod());
            addCatalogDescriptor(msg, restApi.getCatalogDescriptor());
//            fetchAllParams(msg, restApi, result);
            setItems(msg, result);

        } catch (IOException e) {
            Error error = new Error();
            error.setMessage(e.getMessage());
        }
        return msg;
    }

    private static void setItems(SearchPost200ResponseMessage msg, String result) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> jsonResult = objectMapper.readValue(result, Map.class);
        SearchPost200ResponseMessage newMsg = JoltUtil.getEntity("/moodleJoltSpec.json", SearchPost200ResponseMessage.class, jsonResult);
        msg.setItems(newMsg.getItems());
    }


}
