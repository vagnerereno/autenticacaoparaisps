package com.tcc2.bke_auth4isp.entity;

public class Technician extends Person {

    boolean certified;

    public Technician(String name, String cpf, String username, long rg, String phone) {
        super(name, cpf, username, rg, phone);
    }

    public Technician (){

    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }
}
