package com.demo.controler;

import com.demo.service.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {

    @Autowired
    ServiceProviderService serviceProviderService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceProviderService.sayHiFromProvider( name );
    }

}
