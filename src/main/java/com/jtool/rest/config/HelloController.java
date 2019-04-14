package com.jtool.rest.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

/**
 * Spring Boot Thymeleaf Setting Sample
 * https://memorynotfound.com/spring-boot-thymeleaf-configuration-example/
 */
@Controller
@RequestMapping("hello")
@Slf4j
public class HelloController implements Serializable {
//    private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

    @Value("${messages.hello:default-value}")
    private String message = "Hello World";

    @GetMapping
    public String hello(Model model){
        log.info("Spring Boot Thymeleaf Configuration Example");
        model.addAttribute("message", message);
        return "hello";
    }

//    @GetMapping
//    public String hello() {
//        return "hello";
//    }
}
