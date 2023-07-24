package kr.co.mlec.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.member.vo.MemberVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/board")
	public String List(HttpServletRequest request) {
		List<BoardVO> boardList = boardService.getBoardList();
		request.setAttribute("boardList", boardList);
		return "board/list2";
//		return "board/list";
	}

	@GetMapping("/board/detail")
	public String Board(HttpServletRequest request) {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardVO board = boardService.getBoard(no);
		request.setAttribute("board", board);
		return "board/detail";
	}

	@GetMapping("/board/{no}")
	public ModelAndView Board2(@PathVariable("no") int boardNO, HttpServletRequest request) {
		BoardVO board = boardService.getBoard(boardNO);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/detail");
		mav.addObject("board", board);

		request.setAttribute("board", board);
		return mav;
	}

	@GetMapping("/board/write")
	public void write(Model model, HttpSession session) {
		BoardVO board = new BoardVO();

		MemberVO userVO = (MemberVO) session.getAttribute("userVO");
		if (userVO != null)
			board.setWriter(userVO.getId());

		model.addAttribute("boardVO", board);
	}

	@PostMapping("/board/write")
	public String write(@Valid BoardVO board, BindingResult result) {

		System.out.println(result);

//		if (board.getTitle() == null || board.getTitle().length() == 0 || board.getWriter() == null
//				|| board.getWriter().length() == 0)
		if (result.hasErrors())
			return "board/write";

		boardService.addBoard(board);
		return "redirect:/board";
	}
}
