package com.cache.java9pro;

import org.springframework.stereotype.Component;

@Component
public class MobileDAO {

    public Mobile getMobileInfo(String id) {
        switch (id){
            case "1" : return new Mobile(id,"Samsung","4GB");
            case "2" : return new Mobile(id,"Apple","6GB");
            case "3" : return new Mobile(id,"Motorola","2GB");
            case "4" : return new Mobile(id,"Lenovo","3GB");

        }
        return null;
    }
}
