package com.proj.community;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/")
    // http://localhost:8887/hello?name=Frank
    // @hello(RequestParam(name = "name") String name, Model model)
    public String hello( String name, Model model) {
        model.addAttribute("name",name);
        return "index";
    }
}
