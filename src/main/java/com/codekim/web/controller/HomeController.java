package com.codekim.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class HomeController {
 
	@RequestMapping("/index")
	public String list() {
	   return "root.index";
	   
   }
	
	@RequestMapping("/help")
	public String help() {
	   return "root.help";
	   
   }
}
