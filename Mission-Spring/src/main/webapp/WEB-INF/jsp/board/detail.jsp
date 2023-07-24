<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
section{
	width : 80%;
	margin: 0 auto;
	text-align: center;
}

table{
	width: 100%;
}
button {
	margin: 10px;
	width: 100px;
	height: 50px;
}

td{
	text-align: left;
	padding-left: 20px;
}
</style>
</head>
<body>
<section>
	<h2>게시판 상세 페이지</h2>
	<table border="1">
		<tr>
			<th width="25%">번호</th>
			<td>${board.no }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${board.title }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${board.regDate }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${board.content }</td>
		</tr>
	</table>
	<button onclick="location.href='${pageContext.request.contextPath}/board'">목록</button>
	<button onclick="location.href='${pageContext.request.contextPath}/board'">수정</button>
	<button onclick="location.href='${pageContext.request.contextPath}/board'">삭제</button>
</section>

</body>
</html>