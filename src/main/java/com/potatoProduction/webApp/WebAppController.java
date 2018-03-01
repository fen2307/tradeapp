package com.potatoProduction.webApp;

import com.potatoProduction.webApp.Entities.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class WebAppController {

    @RequestMapping("/")
    public String index() {
        return "yo koala";
    }

    @RequestMapping(method = RequestMethod.GET, value ="/{id}")
    String getUserById (@PathVariable("id") int id){
        return "abc" + id;
    }
    @RequestMapping(method = RequestMethod.PUT, value ="/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    String putUserById (@RequestBody Employee employee , HttpServletResponse response){
        return "abc";
    }
}