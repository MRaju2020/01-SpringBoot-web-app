package com.msit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParamController {
	
	//Single Pathparameter
//	@GetMapping(value="/greet/{name}")
//	public String greetMsg(@PathVariable("name") String name,Model model) { 
//		String msgTxt = "Hello "+name+", Welcome to Raju IT";
//		model.addAttribute("msg", msgTxt);
//		return "index";
//	}
	
	
//	//two Pathparameters
//	@GetMapping(value="/greet/{name}/{role}")
//	public String greetMsg(@PathVariable("name") String name,@PathVariable("role") String role, Model model) { 
//		String msgTxt = "Hello "+name+"("+role+"), Welcome to Raju IT";
//		model.addAttribute("msg", msgTxt);
//		return "index";
//	}
	
	
	//Pathparameters in middle of URL
		@GetMapping(value="/greet/{name}/{role}/display")
		public String greetMsg(@PathVariable("name") String name,@PathVariable("role") String role, Model model) { 
			String msgTxt = "Hello "+name+"("+role+"), Welcome to Raju IT";
			model.addAttribute("msg", msgTxt);
			return "index";
		}

}
