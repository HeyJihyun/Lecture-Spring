package kr.co.mlec.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class MemberController {

	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}

	@RequestMapping("/join.do")
	public ModelAndView join(MemberVO member) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form/memberInfo");
		mav.addObject("memberVO", member);
		return mav;
	}
//	
//	@RequestMapping("/join.do")
//	public String join(MemberVO member) {
//		System.out.println(member);
//		return "form/memberInfo";
//	}

//	@RequestMapping("/join.do")
//	public String join(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		String name = request.getParameter("name");
//		MemberVO member = new MemberVO();
//		member.setId(id);
//		member.setName(name);
//		member.setPassword(password);
//		request.setAttribute("member", member);
//		return "form/memberInfo";
//	}
}
