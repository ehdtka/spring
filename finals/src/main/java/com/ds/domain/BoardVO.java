package com.ds.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {
	
	 private int bno;
	 private String title; 
	 private String writer;
	 private String content;
}
