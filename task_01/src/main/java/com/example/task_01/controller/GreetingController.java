package com.example.task_01.controller;


import com.example.task_01.models.NameAndTimeOfDay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(defaultValue = "") String name){
//        return String.format("Good Afternoon %s!", name);
//    }

    @GetMapping
    public NameAndTimeOfDay newNameAndTimeOfDay() {
        NameAndTimeOfDay nameAndTimeOfDay = new NameAndTimeOfDay();
        return new NameAndTimeOfDay("Huso", "Good Mornning");
    }







}
