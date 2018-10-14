package com.cache.java9pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    MobileService mobileService;

    @GetMapping("/mobile/{id}")
    public   Mobile findMobileDetailById(@PathVariable String id)
    {
       return mobileService.getMobileDetailByID(id);
    }
}
