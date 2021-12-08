package com.ds.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberVO {
	private String id;
	private String password;
	private String email;
	private String phonenumber;
	private String userGrade;
}
