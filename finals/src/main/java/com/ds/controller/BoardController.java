package com.ds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ds.domain.BoardVO;
import com.ds.domain.MemberVO;
import com.ds.service.BoardService;
import com.ds.service.MemberService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	@Qualifier("boardService")
	BoardService boardService;
	
	
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<BoardVO> list = boardService.listAll();
		model.addAttribute("boardList", list);
		
		return "board/listPage";
	}
	
}
