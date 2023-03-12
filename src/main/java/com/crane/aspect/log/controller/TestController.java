package com.crane.aspect.log.controller;

import com.crane.aspect.log.common.annotation.Log;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: crane
 * @create: 2023-03-12
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/list")
    @Log
    public String list() {
        return HttpStatus.OK.getReasonPhrase();
    }
}
