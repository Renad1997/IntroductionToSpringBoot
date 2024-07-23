package com.example.day1springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping("/hey")
public String message1(){
    return "Hello from Spring Boot!";
}

@GetMapping("/name")
public String myName(){
        return "My name is:Renad Mohammed Almana";
}
@GetMapping("/age")
public String myAge(){
        return "My age is:27";
}
@GetMapping("/check/status")
public String subject(){
        return "Everything Ok";
}
@GetMapping("/health")
public String healthy(){
        return "Server health is up and running";
}

@GetMapping("/names")
    public String namesArray(){
        ArrayList<String> names =new ArrayList<>();
        names.add("Renad");
        names.add("Sara");
        names.add("maha");
        names.add("jana");
       return names.toString();
    }



}
