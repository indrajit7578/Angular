package com.firstweb.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String sayHello() {
		return "login";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String showMessage(@RequestParam(value="name") String name1,@RequestParam(value="password") String pass,ModelMap model) {
		
		if(name1.equalsIgnoreCase("indra") && pass.equalsIgnoreCase("indra")) {
			model.put("userName_", name1);
			model.put("message","Nothing");
			return "userpage";
		}
		model.put("errorMessage", "Inavalid Login Credentials");
		return "login";
	}
}
