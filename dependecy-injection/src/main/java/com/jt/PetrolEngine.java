package com.jt;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("")
@Primary
public class PetrolEngine implements Engine {

    @Override
    public void startEngne() {
        
       System.out.println("petrrol engiine starting");
    }

    @Override
    public void stopEngine() {
       
        System.out.println("petrol engine stopped");
    }
    
}
