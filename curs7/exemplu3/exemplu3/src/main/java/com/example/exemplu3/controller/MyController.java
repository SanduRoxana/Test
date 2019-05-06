package com.example.exemplu3.controller;

import com.example.exemplu3.entities.Person;
import com.example.exemplu3.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping(path = "/getPeople")
    public List<Person> getPeople() {
        return myService.getPeople();
    }
}
