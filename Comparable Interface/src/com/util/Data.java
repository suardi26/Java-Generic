package com.util;

import java.util.Comparator;

public class Data implements Comparable<Data> {
    private String name;
    private String address;

    public Data(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int compareTo(Data o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
