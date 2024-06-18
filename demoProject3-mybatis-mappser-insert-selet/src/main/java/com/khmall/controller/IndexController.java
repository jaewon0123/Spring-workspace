package com.khmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
/*index html로 주소를 이동할 때 사용하는 GetMapping 작성*/
	
	@GetMapping("/productRegister")
	public String productRegister(Model model) {
		
		return "productRegister";
	}
}
