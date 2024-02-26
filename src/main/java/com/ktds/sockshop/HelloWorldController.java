package com.ktds.sockshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
    public String sayHello() {
        return "Hi. Welcome to MSA apps on the Cloud – v3";
    }
	
	
}
