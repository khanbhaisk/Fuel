package com.ask.fule.controller;

import com.ask.fule.entity.Fuel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/fule")
public class FuleController {

    @PostMapping("/hello")
    public String hello(){
       return "hello";
    }

   @PostMapping("/add/fuel")
   public String addFuel(Fuel fuel){

        return "Furl is added";
   }

}
