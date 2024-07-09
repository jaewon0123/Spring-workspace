package com.khtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khtest.dto.Member;
import com.khtest.mapper.MemberMapper;

@Service
public class MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	public void setMemberId(Member member) {
		memberMapper.setMemberId(member);
	}
}
