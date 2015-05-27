package com.cocmaster.firstBlood.controller.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cocmaster.firstBlood_register.ISayHiService;


@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private ISayHiService sayHiService;
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public @ResponseBody String sayHello(@RequestParam("name") String name) {
		return sayHiService.sayHi(name);
	}
	
	@RequestMapping(value = "/hi2", method = RequestMethod.GET)
	public @ResponseBody String sayHello2() {
		return "hi22222";
	}
}
