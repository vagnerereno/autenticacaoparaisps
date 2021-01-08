package com.tcc2.bke_auth4isp.entity;

import java.util.Date;

public class Call {
    Client client;
    Technician technician;
    Manager manager;
    ISP isp;
    Date date;

    public Call(Client client, Technician technician, Manager manager, ISP isp, Date date) {
        this.client = client;
        this.technician = technician;
        this.manager = manager;
        this.isp = isp;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ISP getIsp() {
        return isp;
    }

    public void setIsp(ISP isp) {
        this.isp = isp;
    }
}
