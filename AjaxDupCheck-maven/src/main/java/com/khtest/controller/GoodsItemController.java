package com.khtest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.khtest.service.GoodsItemService;

@Controller
public class GoodsItemController {

	@Autowired
	private GoodsItemService goodsItemservice;
	
	
	
	@ResponseBody
	@GetMapping("/goodsCheck")
	public Map<String, Object> getGoodsItem(@RequestParam String item_name){
		Map<String, Object> res = new HashMap<>();
		
		boolean isCheck = goodsItemservice.getGoodsItem(item_name);
		
		res.put("isCheck", isCheck);
		return res;
		
	}
	
}
