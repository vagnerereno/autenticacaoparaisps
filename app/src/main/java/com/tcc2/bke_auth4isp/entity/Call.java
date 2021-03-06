package com.tcc2.bke_auth4isp.entity;

import java.io.Serializable;

public class Call implements Serializable  {

    String date;
    long calls_id;
    String name_techinician;
    String username_techinician;
    String username_client;

    public Call(String date, long calls_id, String name_techinician, String username_techinician, String username_client) {
        this.date = date;
        this.calls_id = calls_id;
        this.name_techinician = name_techinician;
        this.username_techinician = username_techinician;
        this.username_client = username_client;
    }

    public Call (){

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getCalls_id() {
        return calls_id;
    }

    public void setCalls_id(long calls_id) {
        this.calls_id = calls_id;
    }

    public String getName_techinician() {
        return name_techinician;
    }

    public void setName_techinician(String name_techinician) {
        this.name_techinician = name_techinician;
    }

    public String getUsername_techinician() {
        return username_techinician;
    }

    public void setUsername_techinician(String username_techinician) {
        this.username_techinician = username_techinician;
    }

    public String getUsername_client() {
        return username_client;
    }

    public void setUsername_client(String username_client) {
        this.username_client = username_client;
    }
}
