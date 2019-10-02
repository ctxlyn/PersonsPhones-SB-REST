package com.ibm.activity.springbootActivity.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonDomain {

    @Id
    private String id;
    private String name;


    public PersonDomain() {
    }

    public PersonDomain(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString (){
        return "PersonId: " + id + " PersonName: " + name;
    }

}
