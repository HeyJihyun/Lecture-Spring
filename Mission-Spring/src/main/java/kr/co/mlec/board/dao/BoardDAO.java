package kr.co.mlec.board.dao;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

/**
 * Databse에서 게시판과 관련된 CRUD 표준 인터페이스
 * 
 * @author User
 *
 */
public interface BoardDAO {
	/**
	 * 전체게시글 조회
	 * 
	 * @return 조회된 게시글
	 */
	List<BoardVO> selectAllBoard();

	/**
	 * 상세 게시글 조회
	 * 
	 * @param no 조회 할 글번호
	 * @return
	 */
	BoardVO selectBoard(int no);

	/**
	 * 글 등록
	 * 
	 * @param board
	 */
	void insertBoard(BoardVO board);
}
