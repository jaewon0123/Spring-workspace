package com.khtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khtest.mapper.GoodsItemMapper;

@Service
public class GoodsItemService {
	
	@Autowired
	private GoodsItemMapper goodsItemMapper;
	
	public boolean getGoodsItem(String item_name) {
		
		return (goodsItemMapper.getGoodsItem(item_name) == 1 ? false : true) ;
	}
}
