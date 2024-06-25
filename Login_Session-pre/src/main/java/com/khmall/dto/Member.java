package com.khmall.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private int member_id;
	private String member_name;
	private int member_age;
	private String member_phone;
}
