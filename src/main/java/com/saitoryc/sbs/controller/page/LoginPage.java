package com.saitoryc.sbs.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by saitoryc on 2016/04/20.
 */
@Controller
@RequestMapping("/login")
public class LoginPage {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get() {
        return "login";
    }
}
