package kr.co.mlec.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.mlec.member.service.MemberService;
import kr.co.mlec.member.vo.MemberVO;

@Controller
@SessionAttributes("userVO")
public class memberController2 {

	@Autowired
	private MemberService memberService;

	@GetMapping("login")
	public String login() {
		return "login/login";
	}

	@PostMapping("login")
	public String login(MemberVO memeber, Model model) {
		MemberVO userVO = memberService.login(memeber);

		if (userVO == null) {
			return "login/login";
		}

		model.addAttribute("userVO", userVO);

		return "redirect:/";
	}

	@GetMapping("logout")
	public String logout(SessionStatus status) {

		status.setComplete();

		return "redirect:/";
	}
}
