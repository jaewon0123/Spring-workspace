package com.khtest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.khtest.dto.GoodsItem;
/*
MapperScan은 여기서 사용하는 것이 아니라 
com.khtest 안에 있는 @SpringBootApplication 위 아래 상관없이
@MapperScan(com.khtest.mapper) 넣어줌
*/
@Mapper 
public interface GoodsItemMapper {
	//Integer existsByName(String itemName); -> resultMap을 사용하지 않을 때 사용
	GoodsItem existsByName(@Param("itemName") String itemName); // resultMap을 사용해서 count(*)값을 넘길 때 사용
}
