package fr.dorianmaliszewski.helloservice.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @Value("${application.instance}")
    private String instance;

    @GetMapping
    public String sayHelloWorld(HttpServletRequest request) {
        return "Hello World from " + request.getLocalAddr();
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

}
