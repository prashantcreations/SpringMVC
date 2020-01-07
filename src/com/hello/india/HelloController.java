package com.hello.india;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String helloIndia(Locale locale, Model model) {
		model.addAttribute("message","hello India");
		return "helloindia";
	}
	
	

}
