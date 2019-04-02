package com.jkb.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

//注册每个前台界面，使其能在服务器端加载
/*    @RequestMapping("/hello")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/hello.html");
        return mv;

    }*/

    //请求/login直接调用
    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login.html");
        return mv;
    }
    @RequestMapping(value = "/util")
    public ModelAndView util(){
        ModelAndView mv = new ModelAndView("/util.html");
        return mv;
    }


    @RequestMapping("/class_judge")
    public ModelAndView class_judge(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/class_judge.html");
        return mv;
    }

}
