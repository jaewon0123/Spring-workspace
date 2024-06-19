package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Khmember;

@Mapper
public interface KhmemberMapper {
	void insertKhmember(Khmember khmember);
	
	List<Khmember> getallKhmember();
}
