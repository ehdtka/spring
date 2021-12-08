package com.ds.repository;

import java.util.List;

import com.ds.domain.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> memberList();
	
	public int login(MemberVO memberVO);
}
