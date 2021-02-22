package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Task1Controller {
	@RequestMapping(value="/fact", method=RequestMethod.GET)
	public ModelAndView task1GET(ModelAndView mv) {
		mv.addObject("num", "階乗の計算をします");
		mv.setViewName("task1");
		return mv;
	}
	
	@RequestMapping(value="/fact", method=RequestMethod.POST)
	public ModelAndView task1POST(ModelAndView mv, @RequestParam("numVal") int num) {
		int factorial = 1;
		for(int i = 0; num > i; i++) {
			factorial *= num - i ;
		}
	  mv.addObject("num", num + "の階乗は" + factorial + "です");
	  mv.setViewName("task1");
	  return mv;
	}

}