package com.company.javaenum;

public enum Days {
    SUN("This is Sunday",12), MON("This is MONDAY",23);

    private String value;
    private int key;

    Days(String values , int key){
        this.value= values;
        this.key= key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
