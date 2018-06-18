package com.tabletop.design;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage() {
        //TODO need to load basic home data

        return "home";
    }
}
