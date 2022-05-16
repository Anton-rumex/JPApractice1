package com.work1.app1.webber;

public class Menu {

    private String id;
    private String name;
    private String description;

    public Menu() {

    }

    public Menu(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
