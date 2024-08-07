package com.eg.testbeian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        String serverName = request.getServerName();
        if (serverName.endsWith("oneclick.video")) {
            return "oneclick.video";
        } else if (serverName.endsWith("a4.fit")) {
            return "a4.fit";
        } else if (serverName.endsWith("gpt6.plus")) {
            return "gpt6.plus";
        }
        return "a4.fit";
    }

}
