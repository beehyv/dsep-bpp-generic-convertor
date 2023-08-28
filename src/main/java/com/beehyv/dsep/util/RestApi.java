package com.beehyv.dsep.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RestApi {
    private String url;
    private String method;
    private String catalogDescriptor;
    private String providerDescriptor;
    private String wsToken;
    private String wsFunction;
    private String moodleWsRestFormat;
//    private LinkedHashMap<String, Attribute> attributes = new LinkedHashMap<>();

    public RestApi(String url, String method) {
        this.url = url;
        this.method = method;
    }

    public RestApi(String url, String method, String wsToken, String wsFunction, String moodleWsRestFormat) {
        this.url = url;
        this.method = method;
        this.wsToken = wsToken;
        this.wsFunction = wsFunction;
        this.moodleWsRestFormat = moodleWsRestFormat;
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }


    public String getCatalogDescriptor() {
        return catalogDescriptor;
    }

    public void setCatalogDescriptor(String catalogDescriptor) {
        this.catalogDescriptor = catalogDescriptor;
    }

    public String getProviderDescriptor() {
        return providerDescriptor;
    }

    public void setProviderDescriptor(String providerDescriptor) {
        this.providerDescriptor = providerDescriptor;
    }

    public String getWsToken() {
        return wsToken;
    }

    public void setWsToken(String wsToken) {
        this.wsToken = wsToken;
    }

    public String getWsFunction() {
        return wsFunction;
    }

    public void setWsFunction(String wsFunction) {
        this.wsFunction = wsFunction;
    }

    public String getMoodleWsRestFormat() {
        return moodleWsRestFormat;
    }

    public void setMoodleWsRestFormat(String moodleWsRestFormat) {
        this.moodleWsRestFormat = moodleWsRestFormat;
    }
}
