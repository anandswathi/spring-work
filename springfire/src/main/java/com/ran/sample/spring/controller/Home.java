package com.ran.sample.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class Home {

		@RequestMapping(method = RequestMethod.GET)
		public String hello(ModelMap model) {			
			return "home";
		}				
	}