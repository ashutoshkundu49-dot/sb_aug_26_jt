package com.jt.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Student student(){
        // Student ss=new Student();
        // return ss;

        return new Student();
    }
    
}
