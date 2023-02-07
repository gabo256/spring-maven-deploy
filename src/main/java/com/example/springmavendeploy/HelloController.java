package com.example.springmavendeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.mensaje}")
    String msj;

    @GetMapping("/hello")
    public String holaMundo(){
        System.out.println(msj);
        return "Hi";
    }
}
