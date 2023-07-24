package kr.co.mlec.member.dao;

import kr.co.mlec.member.vo.MemberVO;

public interface MemberDAO {

	/**
	 * id, password 적합한 회원 데이터 조회
	 * 
	 * @param member id, password
	 * @return 조회환 회원데이터
	 */
	MemberVO login(MemberVO member);

}
