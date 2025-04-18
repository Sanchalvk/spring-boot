package net.java.spring_boot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/docker")
    public String diockerdemo(){
        return "docker springboot application";
    }

}
