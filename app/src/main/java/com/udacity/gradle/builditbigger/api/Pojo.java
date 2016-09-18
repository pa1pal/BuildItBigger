package com.udacity.gradle.builditbigger.api;

/** The object model for the data we are sending through endpoints */
public class Pojo {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}