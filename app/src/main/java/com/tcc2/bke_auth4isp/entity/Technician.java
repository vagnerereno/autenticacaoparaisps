package com.tcc2.bke_auth4isp.entity;

public class Technician extends Person {

    // @TODO criar ArrayList de ISPs
    boolean certified;

    public Technician(String nome, long cpf, long rg, long telefone, String isp, String url_photo) {
        super(nome, cpf, rg, telefone, isp, url_photo);
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }
}
