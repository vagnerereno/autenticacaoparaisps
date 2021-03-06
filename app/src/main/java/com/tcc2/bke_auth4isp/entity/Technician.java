package com.tcc2.bke_auth4isp.entity;

public class Technician extends Person {

    boolean certified;

    String url_photo;

    public Technician(String name, String cpf, String username, long rg, String phone) {
        super(name, cpf, username, rg, phone);
    }

    public Technician (){}



    public String getUrl_photo() {
        return url_photo;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

}
