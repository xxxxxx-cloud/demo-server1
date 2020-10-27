package com.xxxxx.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 金世强
 */
@RestController
public class DemoController {

    @GetMapping("getDemo1")
    public String getDemo1() {
        System.out.println("................0.0..........");
        return "Hello!";
    }
}
