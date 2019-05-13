package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceProviderService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHiFromProvider(String name) {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/hi?name="+name,String.class);
    }

}
