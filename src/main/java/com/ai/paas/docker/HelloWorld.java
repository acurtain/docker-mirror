package com.ai.paas.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by astraea on 2015/3/31.
 */
@Controller
public class HelloWorld {

    @RequestMapping("/test/helloworld")
    public ModelAndView helloWorld() {
        ModelAndView view = new ModelAndView("helloWorld");
        return view;
    }
}
