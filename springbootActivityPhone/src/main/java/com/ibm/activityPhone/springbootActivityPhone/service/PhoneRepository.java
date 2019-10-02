package com.ibm.activityPhone.springbootActivityPhone.service;

import com.ibm.activityPhone.springbootActivityPhone.domain.PhoneDomain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhoneRepository extends CrudRepository<PhoneDomain, String> {

    List<PhoneDomain> findByPersonId(String personId);
}
