package com.ibm.activityPhone.springbootActivityPhone.controller;

import com.ibm.activityPhone.springbootActivityPhone.domain.PhoneDomain;
import com.ibm.activityPhone.springbootActivityPhone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @RequestMapping(value = "/phones", method = RequestMethod.GET)
    public List<PhoneDomain> getAllPhone() {
        return phoneService.getAllPhone();
    }

    @RequestMapping(value = "/getPhone/{personId}", method = RequestMethod.GET)
    public List<PhoneDomain> getPhone(@PathVariable String personId) {
        return phoneService.getPhone(personId);
    }

    @RequestMapping(value = "/addPhone", method = RequestMethod.POST)
    public void addPhone(@RequestBody PhoneDomain phone){
        phoneService.addPhone(phone);
    }


}
