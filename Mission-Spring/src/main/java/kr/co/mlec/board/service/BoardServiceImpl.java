package kr.co.mlec.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.selectAllBoard();
	}

	@Override
	public BoardVO getBoard(int no) {
		return boardDAO.selectBoard(no);
	}

	@Override
	public void addBoard(BoardVO board) {
		boardDAO.insertBoard(board);
	}

}
