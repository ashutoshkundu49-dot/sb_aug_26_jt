package com.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    // private Engine engine=new Engine();

    //Di
   //1.Field bASED 
    // @Autowired
    // private Engine engine;

    //2.Setter method based injection
    //   private Engine engine;

    //   @Autowired
    //   public void setEngine(Engine engine){
    //     // System.out.println("parameter engine"+engine);
    //     // System.out.println("variable engine"+this.engine);
    //     this.engine=engine;
    //   }

      //3.Constructor based injection
      private Engine engine;

      @Autowired
      public Car(@Qualifier("diselEngine")Engine engine){
        this.engine=engine;
      }

    //   public Car(){
    //     System.out.println("this is non param constructor");
    //   }


    public void startCar(){
        // Engine engine=new Engine();
        engine.startEngne();
        System.out.println("car is started");
    }

    public void stopCar(){
        //  Engine engine=new Engine();
        engine.stopEngine();
        System.out.println("car is stopping");
    }
}
