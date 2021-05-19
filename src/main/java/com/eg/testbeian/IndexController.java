package com.eg.testbeian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        String serverName = request.getServerName();
        if (serverName.equals("java8.icu")) {
            return "java8.icu";
        } else if (serverName.equals("itube.work")) {
            return "itube.work";
        } else {
            return "java8.icu";
        }
    }

}
