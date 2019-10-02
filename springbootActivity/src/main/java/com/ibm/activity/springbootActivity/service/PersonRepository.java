package com.ibm.activity.springbootActivity.service;

import com.ibm.activity.springbootActivity.domain.PersonDomain;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonDomain, String> {

}
