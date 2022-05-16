package com.work1.app1.greet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {

    @RequestMapping("/greet")
    public String say(){
        return "Hello!";
    }
}

/*
* JDBC #1
* JPA #2
*user controls
* user insertion
* user updates
* user
* rest client
* logs for rest apis
* banners for spring boot
*
 */
