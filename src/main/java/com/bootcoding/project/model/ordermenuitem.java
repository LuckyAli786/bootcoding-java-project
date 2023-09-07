package com.bootcoding.project.model;

public class ordermenuitem {
    int id;
    sring deliveryaddress;
    date orderdate;
    double amount;
    string restaurentname;
    long contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public sring getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(sring deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(date orderdate) {
        this.orderdate = orderdate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public string getRestaurentname() {
        return restaurentname;
    }

    public void setRestaurentname(string restaurentname) {
        this.restaurentname = restaurentname;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public string getCustomername() {
        return customername;
    }

    public void setCustomername(string customername) {
        this.customername = customername;
    }

    string customername;



}
