package com.tcc2.bke_auth4isp.entity;

public class Manager extends Person {

    public Manager(String name, String cpf, boolean client, boolean isTechnican, boolean isManager, String password, String username, long rg, String phone, String isp, String url_photo) {
        super(name, cpf, client, isTechnican, isManager, password, username, rg, phone, isp, url_photo);
    }
}
