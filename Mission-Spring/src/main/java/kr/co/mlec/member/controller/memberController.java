package kr.co.mlec.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.mlec.member.service.MemberService;
import kr.co.mlec.member.vo.MemberVO;

//@Controller
public class memberController {

	@Autowired
	private MemberService memberService;

	@GetMapping("login")
	public String login() {
		return "login/login";
	}

	@PostMapping("login")
	public String login(MemberVO memeber, HttpSession session) {
		MemberVO userVO = memberService.login(memeber);

		if (userVO == null) {
			return "login/login";
		}

		session.setAttribute("userVO", userVO);

		return "redirect:/";
	}

	@GetMapping("logout")
	public String logout(HttpSession session) {

		session.invalidate();

		return "redirect:/";
	}
}
