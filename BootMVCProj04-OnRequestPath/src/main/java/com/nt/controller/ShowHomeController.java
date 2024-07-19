package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
/*	@RequestMapping("/home")
	public String showHome1() {
		return "welcome";
	 	}

	@RequestMapping("/HOME")
	public String showHome2() {
		return "welcome1";
		}*/
		
/*@RequestMapping({"/home","/home1","/home2","/home3"})
public String showHome1() {
	return "welcome";
 	}*/
	
/*	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	 	}*/
	
	@GetMapping("/all")
	public String showHome1() {
		System.out.println("ShowHomeController.showHome1()");
		return "forward:report";
	 	}
	
	@GetMapping("/report")
	public String showHome2() {
		System.out.println("ShowHomeController.showHome2()");
		return "welcome";
	 	}
}
