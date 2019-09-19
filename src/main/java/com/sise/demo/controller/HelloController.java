package com.sise.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author： wgx
 * @Date 2019-09-19-14:18.
 * @Description: com.sise.demo.controller
 * @verson：1.0
 */
@Controller
public class HelloController {

    /**
     * 功能描述:跳转到hello
     */
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false,defaultValue = "world") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }

}
