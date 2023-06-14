package com.unla.proyectoprueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.proyectoprueba.helpers.ViewRouteHelper;




@Controller
@RequestMapping("/")
public class HomeController {
	
	//GET Example: SERVER/index
	@GetMapping("")
	public String index() {
		return "home/index";
	}
	
	/*
	//GET Example: SERVER/hello?name=someName
		@GetMapping("/hello")
		public ModelAndView helloParams1(@RequestParam(name="name", required=false, defaultValue="null") String name) {
			ModelAndView mV = new ModelAndView(ViewRouteHelper.HELLO);
			mV.addObject("name", name);
			return mV;
		}

		//GET Example: SERVER/hello/someName
		@GetMapping("/hello/{name}")
		public ModelAndView helloParams2(@PathVariable("name") String name) {
			ModelAndView mV = new ModelAndView(ViewRouteHelper.HELLO);
			mV.addObject("name", name);
			return mV;
		}


		@GetMapping("/")
		public RedirectView redirectToHomeIndex() {
			return new RedirectView(ViewRouteHelper.ROUTE_INDEX);
		}
		
		*/
		
	
		
	
	

}
