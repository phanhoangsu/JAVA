package com.greenAcademy.example.model;

public class Category implements BaseEnity {

    private String name;
    private int id;

    public Category() {
    }

    public Category(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
//        return "Catergory " + "ID " + getId() + " Name " + getName() + " ";
        return "Category [name=" + name + ", id=" + id + "]";
    }
}
