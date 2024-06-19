package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dto.Khmember;
import com.example.service.KhmemberService;

@Controller
public class KhmemberController {
	
	@Autowired
	private KhmemberService khmemberService;
	
	@PostMapping("/register-member")
	public String insertKhmember(Khmember khmember, Model model) {
		khmemberService.insertKhmember(khmember);
		List<Khmember> kList = khmemberService.getallKhmember();
		model.addAttribute("msg", "회원가입이 완료되었습니다.");
		return "khmemberList";
	}
	
	@GetMapping("/khmemberList")
	public String getallKhmember(Model model) {
		
		List<Khmember> kList = khmemberService.getallKhmember();
		
		model.addAttribute("khList", kList);
		return "khmemberList";
	}
	
}
