package com.example.iic_scanner;

public class readcalendar {
    private String id;
   private String Date;

    public readcalendar() {
    }

    public readcalendar(String id, String date) {
        this.id = id;
        Date = date;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
}
