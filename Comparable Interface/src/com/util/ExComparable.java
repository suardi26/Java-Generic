package com.util;

public class ExComparable implements Comparable<ExComparable>{

    private String name;
    private String address;

    public ExComparable(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int compareTo(ExComparable o) {
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
        return "ExComparable{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
