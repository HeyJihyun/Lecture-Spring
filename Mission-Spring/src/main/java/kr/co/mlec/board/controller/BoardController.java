package kr.co.mlec.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService BoardService;

	@GetMapping("/board")
	public String List(HttpServletRequest request) {
		List<BoardVO> boardList = BoardService.getBoardList();
		request.setAttribute("boardList", boardList);
		return "board/list";
	}

	@GetMapping("/board/detail")
	public String Board(HttpServletRequest request) {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardVO board = BoardService.getBoard(no);
		request.setAttribute("board", board);
		return "board/detail";
	}
}
