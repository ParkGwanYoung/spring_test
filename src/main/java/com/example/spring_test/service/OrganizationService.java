package com.example.spring_test.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    public Object actionMethod(){
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID","293029301202");
        resultObject.put("MEMBER_PASSWORD","77777777777");
        resultObject.put("MEMBER_EMAIL","6443434654");
        return resultObject;
    }
}