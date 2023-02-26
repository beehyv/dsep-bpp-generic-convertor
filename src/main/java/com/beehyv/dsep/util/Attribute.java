package com.beehyv.dsep.util;

import java.util.LinkedHashMap;
import java.util.List;

public class Attribute {

    private String field;
    private String type;
    private LinkedHashMap<String, Attribute> children = new LinkedHashMap<>();

    public Attribute(String field, String type, LinkedHashMap<String, Attribute> children) {
        this.field = field;
        this.type = type;
        this.children = children;
    }

    public String getField() {
        return field;
    }

    public String getType() {
        return type;
    }

    public LinkedHashMap<String, Attribute> getChildren() {
        return children;
    }
}
