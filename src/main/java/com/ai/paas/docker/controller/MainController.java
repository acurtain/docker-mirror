package com.ai.paas.docker.controller;

import com.ai.paas.docker.db.DockerHostDB;
import com.ai.paas.docker.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by astraea on 2015/4/2.
 */
@Controller
public class MainController {


    @Autowired
    private DockerHostDB dockerHostDB;

    private static final String getAllContainer = "/containers/json?all=1";

    @RequestMapping("/main")
    public ModelAndView toMainPage() {
        ModelAndView view = new ModelAndView("main");
        return view;
    }

    @ResponseBody
    @RequestMapping("/container/all")
    public String searchContainer() throws IOException {
        String containers = HttpUtil.doGet(dockerHostDB.getDockerHost() + getAllContainer);
        return containers;
    }
}
