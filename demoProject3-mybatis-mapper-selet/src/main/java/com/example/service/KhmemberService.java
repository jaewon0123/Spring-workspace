package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Khmember;
import com.example.mapper.KhmemberMapper;

@Service
public class KhmemberService {
	@Autowired
	private KhmemberMapper khmemberMapper;
	
	public void insertKhmember(Khmember khmember) {
		khmemberMapper.insertKhmember(khmember);
	}
	
	public List<Khmember> getallKhmember(){
		return khmemberMapper.getallKhmember();
	}
}
