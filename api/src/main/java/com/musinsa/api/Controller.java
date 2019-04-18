package com.musinsa.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller {

    @GetMapping("/test")
    public HashMap<String, String> getA(){

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("test", "test");


        return hashMap;
    }

}
