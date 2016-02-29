package com.petworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("helloworld")
	public ModelAndView test(){
		ModelAndView mv=new ModelAndView("test");
		mv.addObject("res", "success");
		return mv;
	}
}
