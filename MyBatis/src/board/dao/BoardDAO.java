package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import board.vo.BoardVO;

public class BoardDAO {

	private SqlSession session;

	public BoardDAO() {
		session = new MyConfig().getInstance();
	}

	public void insert() {

		BoardVO board = new BoardVO();
		board.setTitle("vo�� ����");
		board.setWriter("hong");

		int cnt = session.insert("board.dao.BoardDAO.insert", board);
		session.commit();
		System.out.println("�� " + cnt + "�� �� ����...");
	}

	public void select() {
		// ��ü�Խñ� ��ȸ
		List<BoardVO> boardList = session.selectList("board.dao.BoardDAO.selectAll2");

		for (BoardVO board : boardList) {
			System.out.println(board);
		}

	}

	public void selectOne() {

		BoardVO board = new BoardVO();
		board.setNo(4);

		board = session.selectOne("board.dao.BoardDAO.selectByNo", board);
		System.out.println(board);

	}

	public void selectWhere() {

		// 1. ����+�۾��� �˻�
//		BoardVO board = new BoardVO();
//		board.setTitle("�����̿�");
//		board.setWriter("ȫ�浿");

		// 2. �۾��̰� ȫ�浿�� ����� �˻�
		BoardVO board = new BoardVO();
		board.setTitle("�Ƕ�Ƕ�...!");
//		board.setWriter("ȫ�浿");

		List<BoardVO> boardList = session.selectList("board.dao.BoardDAO.selectWhere", board);

		for (BoardVO b : boardList) {
			System.out.println(b);
		}
	}

	public void selectWhere2() {
		// ����+�۾��� ��ȸ
		Map<String, String> board = new HashMap<>();
//		board.put("title", "�����̿�");
		board.put("writer", "ȫ�浿");

		List<BoardVO> boardList = session.selectList("board.dao.BoardDAO.selectWhere2", board);

		for (BoardVO b : boardList) {
			System.out.println(b);
		}

	}

	public void selectWhere3() {

		Map<String, String> board = new HashMap<>();
		board.put("no", "4");

		Map<String, Object> result = session.selectOne("board.dao.BoardDAO.selectWhere3", board);

		Set<String> keys = result.keySet();
		for (String key : keys) {
			System.out.println("key : " + key + ", value : " + result.get(key));
		}

	}

	public void selectNos() {
		int[] nos = { 2, 3, 4, 5, 6 };

		List<BoardVO> boardList = session.selectList("board.dao.BoardDAO.selectNos", nos);
		for (BoardVO b : boardList) {
			System.out.println(b);
		}

	}

	public void work() {
		selectNos();
//		selectWhere3();
//		selectWhere2();
//		selectWhere();
//		selectOne();
//		select();
//		insert();
	};

}
