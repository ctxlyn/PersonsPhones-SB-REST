package com.ibm.activity.springbootActivity.controller;

import com.ibm.activity.springbootActivity.domain.PersonDomain;
import com.ibm.activity.springbootActivity.domain.PhoneDomain;
import com.ibm.activity.springbootActivity.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class ActivityController {

    private static final Logger log = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    private PersonService personService;

    @RequestMapping("/demoservice/persons")
    public List<PersonDomain> getAllPerson() {
        return personService.getAllPerson();
    }

    @RequestMapping(value = "/demoservice/persons/{id}", method= RequestMethod.GET)
    public List<String> getPerson(@PathVariable String id) {
        return personService.getPerson(id);
    }

    @RequestMapping(value ="/demoservice/addPersons", method= RequestMethod.POST)
    public void addPerson(@RequestBody PersonDomain person) {
      personService.addPerson(person);
    }




//    private RestTemplate getRestTemplate;
//    PhoneDomain phoneDomain = getRestTemplate.getForObject("http://8053/getPhone", PhoneDomain.class);

}
