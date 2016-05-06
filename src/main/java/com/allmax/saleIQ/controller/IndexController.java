package com.allmax.saleIQ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ilia on 06.05.16.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "/WEB-INF/jsp/index.jsp";
    }

}
