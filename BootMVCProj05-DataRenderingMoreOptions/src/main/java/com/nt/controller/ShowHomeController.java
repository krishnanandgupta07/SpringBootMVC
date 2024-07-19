package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Tourist;

@Controller
public class ShowHomeController {
	
	/*	@RequestMapping("/home")
		public String sendData(Map<String, Object> map) {
			//put array, collections as the model Attributes
			map.put("favCricketers",new String[] {"MS Dhoni","Virat Kohli","Jasprit Bumrah","Rishabh Pant","Suresh Raina"});
			map.put("nickNames", List.of("Mahi","Cheeku","Boom Boom","SpiderMan"));
			map.put("mobileNumber", Set.of(99999999L,88888888L,77777777L,66666666L));
			map.put("idDetails", Map.of("aadharNo",78956423,"voterId",87946651));
			//return lvn
			return "welcome";
		 	}*/
	
	/*	@GetMapping("/")
		public String showData(Map<String,Object> map) {
			//set model class object as model attributes
			Tourist tourist= new Tourist(1001, "Krishna", 99999999l, "Indore", "Uttar Pradesh", 50000.0);
			map.put("touristInfo", tourist);
			//return lvn
			return "welcome";
		}*/
	
	@GetMapping("/")
	public String showData(Map<String,Object> map) {
		//set Collection of model class object as model attributes
		List<Tourist> list= List.of(new Tourist(1001, "Krishna", 99999999L, "Indore", "Uttar Pradesh", 50000.0),
														new Tourist(1002, "Sunil", 88888888L, "Lucknow", "Uttar Pradesh", 60000.0),
														new Tourist(1003, "Rahul", 99999999l, "Noida", "Ambikapur", 70000.0),
														new Tourist(1004, "Himanshu", 99999999l, "Deli", "Raipur", 80000.0),
														new Tourist(1005, "Priyansu", 99999999l, "Babani", "Satna", 30000.0));
		map.put("touristInfo", list);
		//return lvn
		return "welcome";
	}

}
