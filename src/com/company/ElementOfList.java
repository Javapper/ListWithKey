package com.company;

public class ElementOfList {
    private Object value;
    private Object link;
    private Object key;

    public Object getValue() {
        return value;
    }

    public Object getLink() {
        return link;
    }

    public Object getKey() {
        return key;
    }

    public void setLink(Object link) {
        this.link = link;
    }

    public ElementOfList(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}
