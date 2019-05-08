package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider",fallback = ServiceProviderServiceFailure.class)
public interface ServiceProviderService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromProvider(@RequestParam(value = "name") String name);
}
