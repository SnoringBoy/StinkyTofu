package com.example.kota.myapplication;

public class item {
    private long id;
    private double price;
    private String name;

    public void setPrice(double new_price){
        price = new_price;
    }

    public double getPrice(){
        return price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String new_Name){
        name = new_Name;

    }

    public String getName(){

        return name;
    }
}

