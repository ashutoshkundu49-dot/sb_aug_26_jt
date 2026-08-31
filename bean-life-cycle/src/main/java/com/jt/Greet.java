package com.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Greet {

    private Greeting greeting;

    public Greet(){
      System.out.println("greet object is constructed");  
    }

    @Autowired
    public void setGreeting(Greeting greeting){
        System.out.println("Greeting is is injected throuhg setter dependency");
      this.greeting=greeting;
    }


    @PostConstruct
    public void init(){
    System.out.println("bean is initialized");
    }

    public void greet(){
        System.out.println("hello everyone");
        // greeting.sayHii();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Greet bean is destroyed");
    }
}
