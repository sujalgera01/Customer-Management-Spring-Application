package com.sujal.springcms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {

    @GetMapping(value = "/")
    public String home(){
        return "App is running "+ new Date();
    }
}
