package com.brotherhood.com.sphynx.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/adminPanel")
public class IndexController {
    @GetMapping
    public static ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }
}
