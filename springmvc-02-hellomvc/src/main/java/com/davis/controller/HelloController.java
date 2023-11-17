package com.davis.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Leondav1s
 * @Date: 11/17/23 2:50 PM
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //service code
        String result="HelloSpringMVC";
        mv.addObject("msg",result);
        //view
        mv.setViewName("test");

        return mv;

    }
}
