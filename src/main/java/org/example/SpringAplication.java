package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringAplication {
    public static void main(String[] args) {
        System.out.println("This write Alex");
        SpringApplication.run(SpringAplication.class,args);
    }
}
