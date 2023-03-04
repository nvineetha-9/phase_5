package com.cisco.dockertest;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


	@RestController
	public class Welcomecontroll {
		
		@GetMapping("/")
		public String welcome(Model model) {
			return "hello world!!";
		}

	}


