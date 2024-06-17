package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Goods;

@Mapper
public interface GoodsMapper {
	void insertGoods(Goods goods);
}
