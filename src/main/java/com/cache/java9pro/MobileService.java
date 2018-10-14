package com.cache.java9pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MobileService {

    @Autowired
    MobileDAO  mobileDAO;

    @Cacheable(value="mobile", key="#id")
    public Mobile getMobileDetailByID(String id)
    {
        Mobile mobile=null;
        try {
            System.out.println("Getting from database");
            Thread.sleep(5000);
            mobile = mobileDAO.getMobileInfo(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return mobile;
    }
}
