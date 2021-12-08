package com.ds.repository;

import java.util.List;

import com.ds.domain.BoardVO;

public interface BoardDAO {
	
	public List<BoardVO> listAll();
}
