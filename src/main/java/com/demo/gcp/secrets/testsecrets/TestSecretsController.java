package com.demo.gcp.secrets.testsecrets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecretsController {

    @Value("${test.greeting}")
    public String GREETING;

    @GetMapping("/")
    public void testSecrets(){
        System.out.println(GREETING);
    }
}
