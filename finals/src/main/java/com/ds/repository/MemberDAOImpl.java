package com.ds.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ds.domain.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	@Qualifier("sqlSession")
	SqlSession session1;
	
	final String MEMBERMAPPER = "memberMapper.";
	
	@Override
	public List<MemberVO> memberList() {
		
		return session1.selectList(MEMBERMAPPER + "list");
	}

	@Override
	public int login(MemberVO memberVO) {
		return session1.selectOne(MEMBERMAPPER + "login", memberVO);
		
	}

}
