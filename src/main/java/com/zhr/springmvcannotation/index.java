package com.zhr.springmvcannotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class index {
    @RequestMapping("/")
    public String ndex() {
        return "index";
    }
}
