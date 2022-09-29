package com.example.sqllite;

public class CustomerModel {

    private int id;
    private String name;

    //constructors
    public CustomerModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerModel() {
    }

    //getters setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //toString
    @Override
    public String toString() {
        return name;
    }
}
