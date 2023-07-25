package kr.co.mlec.reply.service;

import java.util.List;

import kr.co.mlec.reply.vo.ReplyVO;

public interface ReplyService {

	void addReply(ReplyVO reply);

	List<ReplyVO> getReplyList(int boardNo);
}
