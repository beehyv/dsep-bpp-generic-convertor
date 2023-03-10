package com.beehyv.dsep.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RestApi {
    private String url;
    private String method;
    private String catalogDescriptor;
    private String providerDescriptor;
    private LinkedHashMap<String, Attribute> attributes = new LinkedHashMap<>();

    public RestApi(String url, String method, LinkedHashMap<String, Attribute> attributes) {
        this.url = url;
        this.method = method;
        this.attributes = attributes;
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public LinkedHashMap<String, Attribute> getAttributes() {
        return attributes;
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
}
