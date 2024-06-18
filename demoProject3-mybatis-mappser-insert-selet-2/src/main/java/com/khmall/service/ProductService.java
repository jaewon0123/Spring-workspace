package com.khmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.Goods;
import com.khmall.mapper.ProductMapper;

@Service
public class ProductService {
	@Autowired
	private ProductMapper productMapper;

	public void insertProduct(Goods Goods) {
		productMapper.insertProduct(Goods);
	}

	public List<Goods> getAllProduct(){
		return productMapper.getAllProduct();
	}
}
