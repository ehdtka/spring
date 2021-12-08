package com.ds.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ds.domain.BoardVO;
import com.ds.domain.MemberVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{
	
	@Autowired
	@Qualifier("sqlSessionMs")
	SqlSession sessionMs;
	
	final String BOARDMAPPER = "boardMapper.";

	@Override
	public List<BoardVO> listAll() {
		return sessionMs.selectList(BOARDMAPPER + "listAll");
	}
	

}
