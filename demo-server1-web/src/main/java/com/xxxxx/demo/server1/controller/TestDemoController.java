package com.xxxxx.demo.server1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestDemoController {
    
    @Autowired
    private TestDemoService testDemoService;
    @GetMapping("/test")
    public String addBaseTest1Test2Test3(@RequestParam("id")String id) {
       
        return  testDemoService.addBaseTest1Test2Test3(id);
    }
}
