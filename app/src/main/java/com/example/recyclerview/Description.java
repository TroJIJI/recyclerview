package com.example.recyclerview;

public class Description {
private String title;
private String secondTitle;
private String data;
private String number;

    public Description(String title, String secondTitle, String data, String number) {
        this.title = title;
        this.secondTitle = secondTitle;
        this.data = data;
        this.number = number;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSecondTitle() {
        return secondTitle;
    }

    public void setSecondTitle(String secondTitle) {
        this.secondTitle = secondTitle;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
