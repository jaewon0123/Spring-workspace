package com.khtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khtest.mapper.GoodsMapper;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	public boolean getGoods(String item_name) {
		Integer count = goodsMapper.getGoods(item_name);
		// null이 아니다 0 또는 1이상 count가 0보다 클 때 반환
		return count != null && count > 0;
	}
}
