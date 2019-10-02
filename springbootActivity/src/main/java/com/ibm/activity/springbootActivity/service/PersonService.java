package com.ibm.activity.springbootActivity.service;


import com.ibm.activity.springbootActivity.domain.PersonDomain;
import com.ibm.activity.springbootActivity.domain.PhoneDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {



    @Autowired
    private PersonRepository personRepository;

    public List<PersonDomain> getAllPerson() {
        List<PersonDomain> persons = new ArrayList<>(); //iterable
        personRepository.findAll()//iterating all the persons on the database
        .forEach(persons::add); //method reference
        return persons;
    }

    public List<String> getPerson(String id) {
        List<String> a = new ArrayList<>();
        a.add(personRepository.findById(id).get().toString());
        RestTemplate restTemplate = new RestTemplate();
        PhoneDomain[] p = restTemplate.getForObject("http://localhost:8053/getPhone/" + id, PhoneDomain[].class);

        System.out.println(p);
        for (PhoneDomain toStringCaller : p) {
            a.add(toStringCaller.toString());
        }

        return a;
    }

    public void addPerson(PersonDomain person) {
        personRepository.save(person);
    }
}
