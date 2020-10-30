package com.xxxxx.demo.server1.controller;

import com.xxxxx.demo.server1.pojo.vo.TestOneVO;
import com.xxxxx.demo.server1.service.inner.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinshiqiang
 */
@RestController
@RequestMapping("test")
public class TestController {

    private final TestOneService testOneService;

    @Autowired
    public TestController(TestOneService testOneService) {
        this.testOneService = testOneService;
    }

    @GetMapping("send")
    public TestOneVO send() {

        return testOneService.testOne();
    }
}
