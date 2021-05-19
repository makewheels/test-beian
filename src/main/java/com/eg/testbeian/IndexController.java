package com.eg.testbeian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/IndexController")
public class IndexController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        System.out.println("request.getServerName() = " + request.getServerName());
        System.out.println("request.getRemoteHost() = " + request.getRemoteHost());
        return null;

    }

}
