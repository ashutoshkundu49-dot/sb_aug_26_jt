package com.jt;

import org.springframework.stereotype.Component;

// @Component
// public class Engine {

//     public void stratEngine(){
// System.out.println("engine is started");
//     }

//     public void stopEngine(){
//       System.out.println("engine is stopeed");
//     }
// }

public interface Engine {
     void startEngne();
     void stopEngine();
        
}
