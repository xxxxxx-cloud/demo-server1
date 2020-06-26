package com.xxxxx.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("getDemo1")
    public String getDemo1() {
//        try {
//            Thread.sleep(1000*65);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("................0.0..........");
        return "Hello!";
    }
}
