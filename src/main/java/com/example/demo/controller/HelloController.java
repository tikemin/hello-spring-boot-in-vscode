package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value = {"/hello", "/hello/{msg}"})
    //@ResponseBody
	public String index(@PathVariable(name = "msg", required = false) String msg, Model model)  {
        if(msg == null) {
            msg = "Hello World";
        }
        model.addAttribute("hello_msg", msg);    
		return "hello";
	}
}