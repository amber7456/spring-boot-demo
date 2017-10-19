package com.demo.myproject.controller;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
	
	protected static Logger logger=LoggerFactory.getLogger(Example.class);  
	
	@RequestMapping("/")
    String home() {
		logger.debug("访问hello");
        return "Hello World!";
    }
	
	@RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
		logger.debug("访问helloName,Name={}",myName);
        return "Hello "+myName+"!!!";
    }
}