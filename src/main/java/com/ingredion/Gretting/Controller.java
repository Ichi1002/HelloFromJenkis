package com.ingredion.Gretting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Environment env;
    @GetMapping("/greet")
    public String getGreeting() {
        String portValue = env.getProperty("server.port");
        String returnValue = "Something unexpected happened, no greeting for you";
        if(portValue!= null || !portValue.isEmpty()) {
            returnValue = new StringBuilder().append("Hello from port: ").append(portValue).append("n").toString();
        }
        return returnValue;
    }
}
