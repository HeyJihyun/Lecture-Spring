package kr.co.mlec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mlec.member.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring/spring-mvc.xml" })
public class Login테스트 {

	@Autowired
	private SqlSessionTemplate session;

	@Test
	public void 로그인테스트() throws Exception {

		MemberVO member = new MemberVO();
		member.setId("hong");
		member.setPassword("1234");
		MemberVO user = session.selectOne("member.dao.MemberDAO.login", member);

		System.out.println(user);
	}
}
