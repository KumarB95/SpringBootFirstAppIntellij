package com.firstspringapp;


import Services.person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
//    UC1
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello from Bridgelabz !!!";
    }
//    UC2
    @GetMapping(value="/getMessage")
    public String sayHello(@RequestParam(value = "name" )String name){
        return "Hello " + name + "Welcome To BridgeLabz";
    }
//    UC3
    @GetMapping(value= "/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + " Welcome To BridgeLabz";
    }
//    UC4
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody person person ){
            return "Hello " + person.getName() +" "+person.getLastName() + " Welcome To BeidgeLabz";
    }
//    UC5
    @PutMapping("/hello/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam (value = "lastName") String lastName){
            return "Hello " + firstName + " " + lastName + " Welcome to BridgeLabz";
    }
}
