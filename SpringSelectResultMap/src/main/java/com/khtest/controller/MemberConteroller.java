package com.khtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.khtest.dto.Member;
import com.khtest.service.MemberService;

@Controller
public class MemberConteroller {

	@Autowired
	private MemberService memberService;
	
	@PostMapping("/member")
	public String setMemberId(Member member, Model model) {
		memberService.setMemberId(member);
		model.addAttribute("msg","회원가입이 완료되었습니다.");
		return "index";
	}
	
	
	
}
