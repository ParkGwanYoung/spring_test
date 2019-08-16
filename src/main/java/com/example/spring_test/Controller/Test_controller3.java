package com.example.spring_test.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController


public class Test_controller3 {

 @RequestMapping(value = "/api/ajax",method = RequestMethod.POST)
 public Object actionMethod() {
    return "Welcome to Hellow World !!";
 }
}