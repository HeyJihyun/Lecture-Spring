package board.dao;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {
	
	private SqlSession session;

	public BoardDAO() {
		session = new MyConfig().getInstance();
	}
	
	public void insert() {
		
		String title = "이번에는 꼭...!";
		
		int cnt = session.insert("board.dao.BoardDAO.insert", title);
		session.commit();
		System.out.println("총 " + cnt + "개 행 삽입...");
	}
	
	public void work() {
		insert();
	};
	

}
