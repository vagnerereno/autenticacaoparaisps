package com.tcc2.bke_auth4isp.entity;

public class Technician extends Person {

    // @TODO criar ArrayList de ISPs
    boolean certified;

    public Technician(String nome, long cpf, long rg, long telefone) {
        super(nome, cpf, rg, telefone);
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }
}
