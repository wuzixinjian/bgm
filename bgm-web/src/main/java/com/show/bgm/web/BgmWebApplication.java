package com.show.bgm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.show.bgm")
public class BgmWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BgmWebApplication.class, args);
    }

}
