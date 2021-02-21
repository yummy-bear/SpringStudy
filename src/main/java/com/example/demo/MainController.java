package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		mv.setViewName("index");
		mv.addObject("abc", "Test");
		return mv;
	}
	@RequestMapping("/test1")
	public ModelAndView test(ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}
}
