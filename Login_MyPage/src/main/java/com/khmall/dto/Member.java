package com.khmall.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString //나중에 문제생겼을 때 = 값이 제대로 안 넘어올때 왜 안넘어오는가! 확인하는 String
public class Member {
	private int member_id;
	private String member_name;
	private int member_age;
	private String member_phone;
}
