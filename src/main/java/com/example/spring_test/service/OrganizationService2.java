package com.example.spring_test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService2 {
    public Object actionMethod(){
        List<Object> resultObject = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String,Object>();
        Map<String, Object> data02 = new HashMap<String,Object>();
        data01.put("MEMBER_ID","293029301202");
        data01.put("MEMBER_PASSWORD","77777777777");
        data01.put("MEMBER_EMAIL","6443434654");
        data01.put("MEMBER_dududu","1111111111111111");
        
        data02.put("MEMBER_ID","dadaadaadadada");
        data02.put("MEMBER_PASSWORD","111111111111");
        data02.put("MEMBER_EMAIL","@@@@@@@@@@@@@@@@@");
        data02.put("MEMBER_info","fddsdffdsafasd");

        resultObject.add(data01);
        resultObject.add(data02);  
        return resultObject;
    }
}