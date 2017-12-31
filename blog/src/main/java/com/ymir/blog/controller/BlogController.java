package com.ymir.blog.controller;

import com.ymir.controller.BaseController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project：ShowTime
 * Author： iamymir
 * Date：2017/12/31
 */
@Controller
@RequestMapping("blog")
@EnableAutoConfiguration
public class BlogController extends BaseController {

    /**
     * 博客首页
     */
    @RequestMapping("/index")
    public String index(Model model) {

        model.addAttribute("blog", "hello");

        return "blog/index";

    }

}
