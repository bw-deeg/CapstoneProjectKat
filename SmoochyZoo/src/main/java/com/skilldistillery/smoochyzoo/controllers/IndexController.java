package com.skilldistillery.smoochyzoo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController 
{

		
		@GetMapping(path={"/","index.do"})
		public String index() 
		{
			return "index";
		}
		
}