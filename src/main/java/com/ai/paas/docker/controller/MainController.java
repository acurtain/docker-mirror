package com.ai.paas.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by astraea on 2015/4/2.
 */
@Controller
public class MainController {

    @RequestMapping("/main")
    public ModelAndView toMainPage(){
        ModelAndView view = new ModelAndView("main");
        return view;
    }
}
