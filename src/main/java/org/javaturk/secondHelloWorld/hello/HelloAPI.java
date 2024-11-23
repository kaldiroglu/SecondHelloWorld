package org.javaturk.secondHelloWorld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloAPI {


    @GetMapping
    public String saySalaam() {
        return "Salaam :)";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World :)";
    }
}
