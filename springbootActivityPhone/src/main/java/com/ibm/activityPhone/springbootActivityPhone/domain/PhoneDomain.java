package com.ibm.activityPhone.springbootActivityPhone.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneDomain {

    @Id
    String id;
    String personId;
    String brand;
    String model;

    public PhoneDomain() {
      //  super();
    }

    public PhoneDomain(String id, String personId, String brand, String model) {
        this.id = id;
        this.personId = personId;
        this.brand = brand;
        this.model = model;
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

}
