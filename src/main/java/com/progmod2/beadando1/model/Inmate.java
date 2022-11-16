package com.progmod2.beadando1.model;

public class Inmate{
    private Integer id;
    private String name;
    private GenderEnum gender;

    /* SETTERS */
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    /* GETTERS */
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GenderEnum getGender() {
        return gender;
    }
}
