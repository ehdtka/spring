package com.ds.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ds.domain.BoardVO;
import com.ds.domain.MemberVO;
import com.ds.repository.BoardDAO;
import com.ds.repository.MemberDAO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	@Qualifier("boardDAO")
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> listAll() {
		
		return boardDAO.listAll();
	}
	
	
}
