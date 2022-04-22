package com.eg.testbeian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        String serverName = request.getServerName();
        if (serverName.endsWith("java8.icu")) {
            return "java8.icu";
        } else if (serverName.endsWith("itube.work")) {
            return "itube.work";
        } else if (serverName.endsWith("videoplus.top")) {
            return "videoplus.top";
        } else if (serverName.endsWith("shiftcheck.work")) {
            return "shiftcheck.work";
        } else if (serverName.endsWith("d-dns.asia")) {
            return "d-dns.asia";
        } else {
            return "java8.icu";
        }
    }

}
