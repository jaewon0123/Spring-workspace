package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Company;

@Mapper
public interface CompanyMapper {
//getallCompany 작성하기 select 모든 목록을 가져올 때는 void 가 아니라 List로 작성
	List<Company> getallCompany();
}
