package com.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author FaceFeel
 * @Created 2018-05-23 10:52
 **/
@RestController
public class SecurityController {

    private static final Logger log = LoggerFactory.getLogger(SecurityController.class);

    @RequestMapping("/oauth/error")
    public String error(@RequestParam Map<String, String> parameters){
        String url = parameters.get("redirect_uri");
        log.info("重定向: {}", url);
        return "redirect:" + url + "?error=1";
    }

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        Map<String,String> map =new HashMap<>();
        map.put("name", "Allen");
        map.put("link","/login");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("user",map);
        return mv;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login2")
    public String login() {
        return "login";
    }

    @RequestMapping("/home")
    public String home(HttpServletRequest req,HttpServletResponse res) {
        return "hello world";
    }

    @RequestMapping("/hello1")
    public String hello(String name) {
        return "Hello Eureka " + name;
    }
}
