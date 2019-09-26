package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){return "index";}

    @RequestMapping("/classes")
    public String classes(){return "classes";}

    @RequestMapping("/student")
    public String student(){return "student";}
}
