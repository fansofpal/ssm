package com.soecode.lyf.web;

import com.soecode.lyf.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * user:hudawei1
 * date:2018/2/5
 * time:18:25
 */
@Controller
@RequestMapping("/")
public class BaseController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private String base(Model model) {
        return "welcome";
    }
}
