package com.bootcoding.project.model;

public class Order {

    int id;
            string deliveryaddress;

            date orderdate;
            double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(string deliveryaddress) {
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

    public String getRestaurentname() {
        return restaurentname;
    }

    public void setRestaurentname(String restaurentname) {
        this.restaurentname = restaurentname;
    }

    String restaurentname;

}
