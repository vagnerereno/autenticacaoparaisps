package com.tcc2.bke_auth4isp.entity;

public class Person {

    private String name;
    private long cpf;
    private long rg;
    private long phone;

    public Person(String name, long cpf, long rg, long phone) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
