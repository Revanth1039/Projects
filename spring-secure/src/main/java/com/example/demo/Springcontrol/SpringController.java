package com.example.demo.Springcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	
	
	@RequestMapping("/get")
	public String  home() {
		return "home.jsp";
	}
	

}
