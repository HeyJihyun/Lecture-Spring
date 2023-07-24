package kr.co.mlec.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.board.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardVO> selectAllBoard() {
		List<BoardVO> list = sqlSession.selectList("board.dao.BoardDAO.selectAllBoard");

		return list;
	}

	@Override
	public BoardVO selectBoard(int no) {

		BoardVO board = sqlSession.selectOne("board.dao.BoardDAO.selectBoard", no);
		return board;
	}

	@Override
	public void insertBoard(BoardVO board) {

		sqlSession.insert("board.dao.BoardDAO.insertBoard", board);

	}

}
