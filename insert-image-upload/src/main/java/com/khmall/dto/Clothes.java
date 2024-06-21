package com.khmall.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Clothes {
	private String name;
	private int price;
	private String category;
	private String image_path;
}
