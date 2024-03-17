package com.javatech.azure.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDevApplication {

    @GetMapping("/message")
    public String message(){
        return "Congrats ! Ypur app deployed on azure successfully ";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDevApplication.class, args);
    }

}
