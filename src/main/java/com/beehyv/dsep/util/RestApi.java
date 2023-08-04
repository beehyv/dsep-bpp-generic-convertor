package com.beehyv.dsep.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RestApi {
    private String url;
    private String method;
    private String catalogDescriptor;
    private String providerDescriptor;
//    private LinkedHashMap<String, Attribute> attributes = new LinkedHashMap<>();

    public RestApi(String url, String method) {
        this.url = url;
        this.method = method;
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
}
