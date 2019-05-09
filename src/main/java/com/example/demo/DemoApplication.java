package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        //白鹰模型
        EagleModel eagleModel = new WhiteEagle();
        eagleModel.move();

        //黑鹰模型
        eagleModel = new BlackEagle();
        eagleModel.move();
    }

}
