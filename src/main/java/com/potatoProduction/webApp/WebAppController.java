package com.potatoProduction.webApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WebAppController {

    @RequestMapping("/")
    public String index() {
        return "yo koala";
    }

}
