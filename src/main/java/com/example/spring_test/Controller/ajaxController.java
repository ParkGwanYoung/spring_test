package com.example.spring_test.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class ajaxController {

    @RequestMapping(value = "/api/ajax2", method = RequestMethod.POST)
    public Object getParmWithAjax(@RequestParam Map<String, Object> paramMap) {
        return paramMap;
    }
}