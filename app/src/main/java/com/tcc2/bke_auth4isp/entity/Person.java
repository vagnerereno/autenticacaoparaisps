package com.tcc2.bke_auth4isp.entity;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String cpf;
    boolean client;
    boolean technician;
    boolean manager;
    public String password;
    public String username;
    private long rg;
    private String phone;
    private String isp;
    String url_photo;

    public Person(String name, String cpf, boolean client, boolean technician, boolean manager,
                  String password, String username, long rg, String phone, String isp, String url_photo) {
        this.name = name;
        this.cpf = cpf;
        this.client = client;
        this.technician = technician;
        this.manager = manager;
        this.password = password;
        this.username = username;
        this.rg = rg;
        this.phone = phone;
        this.isp = isp;
        this.url_photo = url_photo;
    }

    public Person(){

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isClient() {
        return client;
    }

    public void setIsClient(boolean client) {
        client = client;
    }

    public boolean isTechnician() {
        return technician;
    }

    public void setTechnician(boolean technician) {
        this.technician = technician;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getUrl_photo() {
        return url_photo;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }

}
