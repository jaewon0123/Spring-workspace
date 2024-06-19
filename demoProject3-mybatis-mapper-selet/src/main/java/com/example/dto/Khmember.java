package com.example.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Khmember {
	private int member_id;
	private String username;
	private String password;
	private String email;
}
