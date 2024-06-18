package com.khmall.dto;

public class Goods {
	private int goods_id;
	private String goods_name;
	private int goods_price;
	private int goods_quantity;

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public void setGoods_price(int goods_price) {
		this.goods_price = goods_price;
	}

	public void setGoods_quantity(int goods_quantity) {
		this.goods_quantity = goods_quantity;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public int getGoods_price() {
		return goods_price;
	}

	public int getGoods_quantity() {
		return goods_quantity;
	}

	public Goods() {
	}

}
