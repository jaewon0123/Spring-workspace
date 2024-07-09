package com.khtest.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsItemMapper {

	int getGoodsItem(String item_name);
}
