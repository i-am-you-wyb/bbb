package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeConfigController {

    @Value(value = "${server.port}")
    private String port;
    @Value(value = "${foo}")
    private String foo;

    @GetMapping("/index")
    public String index(){
        return this.foo+"-"+this.port;
    }
}
