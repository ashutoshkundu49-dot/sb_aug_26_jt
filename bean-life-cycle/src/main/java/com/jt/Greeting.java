package com.jt;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    public Greeting(){
        System.out.println("greeting object is constructed");
    }

    public void sayHii(){
        System.out.println("hiiiiii");
    }
}
