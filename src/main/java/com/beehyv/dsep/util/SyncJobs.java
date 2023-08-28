package com.beehyv.dsep.util;

import com.beehyv.dsep.model.Error;
import com.beehyv.dsep.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
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

    private static RestApi readRestApiJson(String path, String key) throws IOException {
        InputStream inputStream = SyncJobs.class.getResourceAsStream(path);
        String jsonString = IOUtils.toString(inputStream, "UTF-8");
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONObject apiJson = jsonObject.getJSONObject(key);

        String url = (String) apiJson.get("url");
        String method = (String) apiJson.get("requestMethod");
        RestApi restApi = new RestApi(url, method);
        if (apiJson.has("catalogDescriptor")) {
            String catalogDescriptor = (String) apiJson.get("catalogDescriptor");
            restApi.setCatalogDescriptor(catalogDescriptor);
        }
        if (apiJson.has("wstoken")) {
            String wsToken = (String) apiJson.get("wstoken");
            restApi.setWsToken(wsToken);
        }
        if (apiJson.has("wsfunction")) {
            String wsFunction = (String) apiJson.get("wsfunction");
            restApi.setWsFunction(wsFunction);
        }
        if (apiJson.has("moodlewsrestformat")) {
            String moodleWsRestFormat = (String) apiJson.get("moodlewsrestformat");
            restApi.setMoodleWsRestFormat(moodleWsRestFormat);
        }
        return restApi;
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

    public static SearchPost200ResponseMessage getAllJobs(SearchPost200ResponseMessage msg) {
        try {
            RestApi restApi = readRestApiJson("/restApi.json", "search");
            String result = getRecords(restApi.getUrl(), restApi.getMethod());
            addCatalogDescriptor(msg, restApi.getCatalogDescriptor());
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
        SearchPost200ResponseMessage newMsg = JoltUtil.getEntity("/moodleSearchCourseJoltSpec.json", SearchPost200ResponseMessage.class, jsonResult);
        msg.setItems(newMsg.getItems());
    }

    public static SearchPost200ResponseMessage getSelectedCourse(SelectPostRequest request) {
        SearchPost200ResponseMessage msg = null;
        try {
            RestApi restApi = readRestApiJson("/restApi.json", "select");
            String url = restApi.getUrl() + "&field=id&value=" + request.getMessage().getOrder().getProvider().getItems().get(0).getId();
            String result = getRecords(url, restApi.getMethod());
            msg = new SearchPost200ResponseMessage();
            setItems(msg, result);
        } catch (IOException e) {
            Error error = new Error();
            error.setMessage(e.getMessage());
        }
        return msg;
    }

    public static SearchPost200ResponseMessage selfEnrolCourse(SelectPostRequest request) {
        SearchPost200ResponseMessage msg = null;
        try {
            RestApi restApi = readRestApiJson("/restApi.json", "confirm");
            if (request.getMessage().getOrder().getProvider().getItems().size() == 1) {
                String url = restApi.getUrl() + "&courseid=" + request.getMessage().getOrder().getProvider().getItems().get(0).getId();
                String result = getRecords(url, restApi.getMethod());
                msg = setEnrolmentStatus(result);
            }

        } catch (IOException e) {
            Error error = new Error();
            error.setMessage(e.getMessage());
        }
        return msg;
    }

    private static SearchPost200ResponseMessage setEnrolmentStatus(String result) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> jsonResult = objectMapper.readValue(result, Map.class);
        SearchPost200ResponseMessage newMsg = JoltUtil.getEntity("/moodleSelfEnrolJoltSpec.json", SearchPost200ResponseMessage.class, jsonResult);
        return newMsg;
    }

    public static SearchPost200ResponseMessage manualCourseEnrol(SelectPostRequestMessage request) {
        SearchPost200ResponseMessage msg = new SearchPost200ResponseMessage();
        try {
            RestApi restApi = readRestApiJson("/restApi.json", "initConfirm");
            String result = courseEnrolAction(restApi, request);
            if (result.equals("null")) {
                msg.setConfirmation("ENROLLED");
            } else {
                msg.setConfirmation("CANCELLED");
            }
        } catch (IOException e) {
            Error error = new Error();
            error.setMessage(e.getMessage());
        }
        return msg;
    }

    public static SearchPost200ResponseMessage manualCourseUnEnrol(CancelPostRequestMessage request) {
        SearchPost200ResponseMessage msg = new SearchPost200ResponseMessage();
        try {
            RestApi restApi = readRestApiJson("/restApi.json", "cancel");
            String result = courseUnEnrolAction(restApi, request);
            if (result.equals("null")) {
                msg.setConfirmation("UNENROLLED");
            } else {
                msg.setConfirmation("CANCELLED");
            }
        } catch (IOException e) {
            Error error = new Error();
            error.setMessage(e.getMessage());
        }
        return msg;
    }

    public static String courseEnrolAction(RestApi restApi, SelectPostRequestMessage request) throws IOException {
        Item item = request.getOrder().getProvider().getItems().get(0);

        String roleId = item.getCategoryId();
        String courseId = item.getParentItemId();
        String userId = item.getId();
        String data = "wstoken=" + URLEncoder.encode(restApi.getWsToken(), "UTF-8") +
                "&wsfunction=" + URLEncoder.encode(restApi.getWsFunction(), "UTF-8") +
                "&enrolments[0][userid]=" + URLEncoder.encode(userId, "UTF-8") +
                "&enrolments[0][courseid]=" + URLEncoder.encode(courseId, "UTF-8") +
                "&moodlewsrestformat=" + URLEncoder.encode(restApi.getMoodleWsRestFormat(), "UTF-8");
        data = data + (roleId != null ? "&enrolments[0][roleid]=" + URLEncoder.encode(roleId, "UTF-8") : "");

        URL urlObj = new URL(restApi.getUrl());
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoOutput(true);

        connection.getOutputStream().write(data.getBytes("UTF-8"));

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();
        return response.toString();
    }

    public static String courseUnEnrolAction(RestApi restApi, CancelPostRequestMessage request) throws IOException {
        String courseId = request.getOrderId().getId().toString();
        String userId = request.getCancellationReasonId().getId().toString();
        String data = "wstoken=" + URLEncoder.encode(restApi.getWsToken(), "UTF-8") +
                "&wsfunction=" + URLEncoder.encode(restApi.getWsFunction(), "UTF-8") +
                "&enrolments[0][userid]=" + URLEncoder.encode(userId, "UTF-8") +
                "&enrolments[0][courseid]=" + URLEncoder.encode(courseId, "UTF-8") +
                "&moodlewsrestformat=" + URLEncoder.encode(restApi.getMoodleWsRestFormat(), "UTF-8");

        URL urlObj = new URL(restApi.getUrl());
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoOutput(true);

        connection.getOutputStream().write(data.getBytes("UTF-8"));

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();
        return response.toString();
    }
}
