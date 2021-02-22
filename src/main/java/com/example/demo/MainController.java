package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView indexGET(ModelAndView mv) {
		mv.addObject("name", "名前がここに入ります");
		mv.addObject("age", "年齢がここに入ります");
		mv.addObject("height", "身長がここに入ります");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView indexPOST(ModelAndView mv, @RequestParam("nameVal")String name, 
	@RequestParam("ageVal")String age, @RequestParam("heightVal")String height) {
	  mv.addObject("name", name);
	  mv.addObject("age", age);
	  mv.addObject("height", height);
	  mv.setViewName("index");
	  return mv;
	}

}
