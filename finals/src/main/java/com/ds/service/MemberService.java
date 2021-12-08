package com.ds.service;

import java.util.List;

import com.ds.domain.MemberVO;

public interface MemberService {
	
	public List<MemberVO> memberList();
	
	public int login(MemberVO memberVO);
}
