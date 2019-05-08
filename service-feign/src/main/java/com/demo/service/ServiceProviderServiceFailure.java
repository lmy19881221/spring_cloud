package com.demo.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceProviderServiceFailure implements ServiceProviderService {
    @Override
    public String sayHiFromProvider(String name) {
        return "sorry "+name;
    }
}
