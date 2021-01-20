package com.tcc2.bke_auth4isp.entity;

public class Person {

    private String name;
    private long cpf;
    private long rg;
    private long phone;
    private String isp;
    String url_photo;

    public Person(String name, long cpf, long rg, long phone, String isp, String url_photo) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.isp = isp;
        this.url_photo = url_photo;
    }

    public String getUrl_photo(){
        return url_photo;
    }
    public void setUrl_photo(String url_photo){
        this.url_photo = url_photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getIsp(){
        return isp;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
