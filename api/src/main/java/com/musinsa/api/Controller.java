package com.musinsa.api;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public HashMap<String, String> getA(){

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("test", "test");

        return hashMap;
    }

    @GetMapping(value = "/cont")
    public void test1(MemberAuthInfo memberIdV1) {
        System.out.println("memberIdV1 : " + memberIdV1);
    }

    @PostMapping(value = "/ser")
    public void test2(@RequestBody MemberAuthInfo memberIdV1) {
        System.out.println("memberIdV1 : " + memberIdV1);
    }

}
