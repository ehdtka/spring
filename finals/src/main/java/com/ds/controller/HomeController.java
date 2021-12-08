package com.ds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ds.domain.MemberVO;
import com.ds.service.MemberService;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("memberService")
	MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<MemberVO> list = memberService.memberList();
		
		model.addAttribute("memberList", list);
		
		return "home";
	}
	
}
