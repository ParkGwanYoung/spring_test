package com.example.spring_test.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class RestOpenWeatherController {
    @RequestMapping(value = "/remote/openweather")
    public Object actionMethod() {
        RestTemplate restTemplate = new RestTemplate();
        Object tempObject = new Object();
        String keyId = "7b6c76b8419abdd3c850e4af4af72e12";
        String targetUri = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=7b6c76b8419abdd3c850e4af4af72e12";
        Object resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}