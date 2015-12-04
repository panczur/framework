package com.pgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@SpringBootApplication
public class DevopsApplication {

    @RequestMapping("/fast")
    public String getFasetResponse() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "<h1>fastResponse 1</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsApplication.class, args);
    }
}
