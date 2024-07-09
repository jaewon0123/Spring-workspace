package com.khtest.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.khtest.dto.Member;

@Mapper
public interface MemberMapper {

	void setMemberId(Member member);
}
