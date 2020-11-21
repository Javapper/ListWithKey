package com.company;

public class List {
    private final ElementOfList descriptor = new ElementOfList(null, null);

    private ElementOfList currentElement = null;

    boolean isKeyExist = false;

    public boolean add(Object key, Object value) {
        isKeyExist = false;
        currentElement = descriptor;

        while (currentElement.getLink() != null) {
            currentElement =(ElementOfList)currentElement.getLink();
            if (currentElement.getKey().equals(key)) { isKeyExist = true; }
        }

        if (isKeyExist) {
            return false;
        } else {
            ElementOfList element = new ElementOfList(key, value);
            currentElement.setLink(element);
            return true;
        }
    }

    public Object get(Object key) {
        currentElement = descriptor;

        do {
            currentElement =(ElementOfList)currentElement.getLink();
            if (currentElement.getKey().equals(key)) {
                return currentElement.getValue();
            }
        } while (currentElement.getLink() != null);
        return null;
    }
}
