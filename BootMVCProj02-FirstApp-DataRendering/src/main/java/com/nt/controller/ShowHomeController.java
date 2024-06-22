package com.nt.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ShowHomeController {/*
	@RequestMapping("/home")
	public String showHome() {
		return "welcome";
	 	}*/
/*
	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}*/
	
/*	@RequestMapping("/")
	public String showHome(Map<String, Object> map) {
		System.out.println("ShowHomeController.showHome()::Shared memory object name"+map.getClass());
		//keep the data shared in shared memory as the model attributes
		map.put("attr1", "val1");
		map.put("attr2", "val2");
		map.put("attr3", LocalDateTime.now());
		return "welcome";
	}*/
	
/*	@RequestMapping("/")
	public String showHome(Model model) {
		System.out.println("ShowHomeController.showHome()::Shared memory object name"+model.getClass());
		//keep the data shared in shared memory as the model attributes
		model.addAttribute("attr1", "val1");
		model.addAttribute("attr2", "val2");
		model.addAttribute("attr3", LocalDateTime.now());
		return "welcome";
	}*/
	
/*	@RequestMapping("/")
	public String showHome(ModelMap map) {
		System.out.println("ShowHomeController.showHome()::Shared memory object name"+map.getClass());
		//keep the data shared in shared memory as the model attributes
		map.addAttribute("attr1", "val1");
		map.addAttribute("attr2", "Hi Krishna Nand Gupta Today Date and Time::->");
		map.addAttribute("attr3", LocalDateTime.now());
		return "welcome";
	}*/
/*		@RequestMapping("/welcome")
		public Model showHomePage() {
			Model model = new BindingAwareModelMap();
			model.addAttribute("attr1","val1");
			model.addAttribute("attr2","Hello Krishna");
			model.addAttribute("attr3",LocalDateTime.now());
			return model;	
	}*/
/*	@RequestMapping("/welcome")
	public Map<String,Object> welcome() {
		//create shared memory
		Map<String,Object> map=new HashMap();
		map.put("attr1","val1");
		map.put("attr2","Hello World !!");
		map.put("attr3",LocalDateTime.now());
		return map;
	}*/
	
/*	@RequestMapping("/welcome")
	public ModelAndView showHome() {
		//create shared memory
		ModelAndView mav= new ModelAndView();
		mav.addObject("attr1","Spring BOOT");
		mav.addObject("attr2","Hello World !!");
		mav.addObject("attr3",LocalDateTime.now());
		mav.setViewName("welcome");
		return mav;
	}*/
	
/*	@RequestMapping("/welcome")
	public String showHome(Map<String,Object> map) {
		//add model attributes to shared memory
		map.put("attr1", new Date());
		map.put("attr2", List.of(999999L,8888888L,777777L));
		map.put("attr3", Set.of("Krishna","Rohit","Adarsh"));
		return null;
	}*/
	
	@RequestMapping("/")
	public String showHome(HttpServletRequest req) {
		//add model attributes to shared memory
		req.setAttribute("attr1", new Date());
		req.setAttribute("attr2", List.of(999999L,8888888L,777777L));
		req.setAttribute("attr3", Set.of("Krishna","Rohit","Adarsh"));
		System.out.println("ShowHomeController.showHome()"+req.hashCode());
		return "redirect:report";
	}
	@RequestMapping("/report")
	public String showReport(HttpServletRequest req) {
		//add model attributes to shared memory
		System.out.println("ShowReportController.showReport()"+req.hashCode());
		System.out.println("req attribute"+req.getAttribute("attr1"));
		return "welcome";
	}
	/*	 forward
	 	@RequestMapping("/")
		public String showHome(Map<String,Object> map) {
			//add model attributes to shared memory
			map.put("attr1", new Date());
			map.put("attr2", List.of(999999L,8888888L,777777L));
			map.put("attr3", Set.of("Krishna","Rohit","Adarsh"));
			System.out.println("ShowHomeController.showHome()");
			return "forward:report";
		}
		@RequestMapping("/report")
		public String showReport(Map<String,Object> map) {
			//add model attributes to shared memory
			System.out.println("ShowReportController.showReport()");
			return "welcome";
		}
	*/	
}
