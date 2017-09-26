package com.example.demo;

import feign.Headers;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



public  interface GroupFeign {


    @Headers("Content-Type: application/json")
    @RequestMapping(value = "groups",method = RequestMethod.POST)
    @RequestLine("POST  groups")
    Group createGroup(Group group);

}


