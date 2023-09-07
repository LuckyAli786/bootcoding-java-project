package com.bootcoding.project.model;

public class Menuitem {
    int id;
    string menuitems;
    boolean isVeg;
    double price;
    string flavour;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getMenuitems() {
        return menuitems;
    }

    public void setMenuitems(string menuitems) {
        this.menuitems = menuitems;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public string getFlavour() {
        return flavour;
    }

    public void setFlavour(string flavour) {
        this.flavour = flavour;
    }
}
