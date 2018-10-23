package com.tamu.rsvp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arshi on 10/22/2018.
 */
@RestController
public class HelloCOntroller {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
