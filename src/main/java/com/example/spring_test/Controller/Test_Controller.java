package com.example.spring_test.Controller;

import java.util.HashMap;
import java.util.Map;

import com.example.spring_test.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController


public class Test_controller {
    @Autowired
    OrganizationService OrganizationService;
    
 @RequestMapping(value = "/ws/controller")
 public Object actionMethod() {

    
    Object resultObject = new Object();
    resultObject = OrganizationService.actionMethod();
    return resultObject;
 }
}