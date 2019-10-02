package com.ibm.activityPhone.springbootActivityPhone.service;


import com.ibm.activityPhone.springbootActivityPhone.domain.PhoneDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    public List<PhoneDomain> getAllPhone() {
        List<PhoneDomain> phones = new ArrayList<>(); //iterable
        phoneRepository.findAll()//iterating all the persons on the database
        .forEach(phones::add); //method reference
        return phones;
    }

    public List<PhoneDomain> getPhone(String personId) {
        List<PhoneDomain> person = new ArrayList<>();
        phoneRepository.findByPersonId(personId).forEach(person::add);
        return person;
    }


//    public PhoneDomain getPhonePerson() {
//        List<PhoneDomain> phonePerson = new ArrayList<>();
//        phoneRepository.findAllById()
//                .forEach(phonePerson::add);
//        return phonePerson;
//    }

    public void addPhone(PhoneDomain phone) {
        phoneRepository.save(phone);
    }
}
