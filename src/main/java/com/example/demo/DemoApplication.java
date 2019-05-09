package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        //白鹰模型
        WhiteEagle whiteEagle = new WhiteEagle();
        whiteEagle.move();

        //黑鹰模型
        BlackEagle blackEagle = new BlackEagle();
        blackEagle.move();
    }

}
