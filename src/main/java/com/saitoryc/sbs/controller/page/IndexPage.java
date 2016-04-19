package com.saitoryc.sbs.controller.page;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by saitoryc on 2016/04/20.
 */
@Controller
@RequestMapping("")
public class IndexPage {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get() {
        return "index";
    }
}
