package com.comp.compdock.controller;

import com.comp.compdock.entity.Consumers;
import com.comp.compdock.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Controller {
    @Autowired
    ConsumerRepository crepo;
    @PostMapping("/save")
    public void save(@RequestBody Consumers cons){
        crepo.save(cons);
        System.out.println("saved ...");
    }
    @GetMapping("/users")
    public List<Consumers> getUsers(){
        return crepo.findAll();
    }
}
