package kr.co.mlec.board.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class BoardVO {

	private int no;

	@Length(min = 2, max = 50, message = "최소 2글자 이상 50글자 이하로만 가능합니다.")
//	@NotEmpty(message = "필수항목입니다.")
	private String title;

	@Pattern(regexp = "^[A-Za-z0-9]*", message = "알파벳과 숫자만 가능합니다.")
	@NotEmpty(message = "필수항목입니다.")
	private String writer;
	private String regDate;
	private String content;
	private int viewCnt;

	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int no, String title, String writer, String regDate, String content, int viewCnt) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
		this.content = content;
		this.viewCnt = viewCnt;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate + ", content="
				+ content + ", viewCnt=" + viewCnt + "]";
	}

}
