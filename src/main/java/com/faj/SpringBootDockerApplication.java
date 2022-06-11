package com.faj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allen on 22/3/13
 */
@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

    @Value("${custom.version}")
    private String customVersion;

    @GetMapping("custom-version")
    public String getCustomVersion() {
        return customVersion;
    }

    @GetMapping("hello")
    public String helloWorld() {
        return "hello world!";
    }

}
