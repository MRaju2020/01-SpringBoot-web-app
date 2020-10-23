package com.msit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
//	@RequestMapping("/welcome")
//	public ModelAndView displayWelcomeMsg(){
//		ModelAndView mav = new ModelAndView();
//		System.out.println("This is display function");
//		mav.addObject("msg", "Welcome to MS IT...");
//		mav.setViewName("index");
//		
//		return mav;
//	}
	
	//with @RequestParam
	
//	@RequestMapping("/welcome")
//	public ModelAndView displayWelcomeMsg(@RequestParam("name") String name){
//		ModelAndView mav = new ModelAndView();
//		
//		String msgText = "Hello "+name+", Welcome to Raju IT...!!";
//		
//		mav.addObject("msg", msgText);
//		mav.setViewName("index");
//		
//		return mav;
//	}
	
	//default @RequestParam
	
	@RequestMapping("/welcome")
	public ModelAndView displayWelcomeMsg(@RequestParam(value = "name", required = false, defaultValue = "John") String name){
		ModelAndView mav = new ModelAndView();
		
		String msgText = "Hello "+name+", Welcome to Raju IT...!!";
		
		mav.addObject("msg", msgText);
		mav.setViewName("index");
		
		return mav;
	}
	@RequestMapping("/greet")
	public ModelAndView displayGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Morning...");
		mav.setViewName("index");
		return mav;
	}
	

}
