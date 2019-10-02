package com.ibm.activity.springbootActivity.domain;

public class PhoneDomain {

    private String id;
    private String personId;
    private String brand;
    private String model;

    public PhoneDomain() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString (){
        return "PhoneId: " + id + " PersonId: " + personId
                + " Brand: " + brand + " Model: " +model;
    }


}
