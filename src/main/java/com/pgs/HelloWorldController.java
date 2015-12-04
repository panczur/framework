/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pgs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kuba
 */
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    private static final String MESSAGE = "Hello!";

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(String name) {
        return MESSAGE;
    }

}