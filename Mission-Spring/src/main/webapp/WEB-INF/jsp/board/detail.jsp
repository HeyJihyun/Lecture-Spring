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
<script src="http://code.jquery.com/jquery-3.7.0.min.js"></script>
<script>
	$(document).ready(function(){
		$('#replyAddBtn').click(function(){
			let content = document.rform.content.value
			let writer = document.rform.writer.value
			
			console.log(content, writer)
			
			// http://localhost:8080/Mission-Spring/reply
			$.ajax({
				url: ''
			})
		})
		
	})
</script>
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

	<br>
	<hr>
	
	<!-- 댓글관련 -->
	
	<form name="rform" method="post">
		댓글 : <input type="text" name="content" size="50"/>
		이름 : <input type="text" name="writer" size="10"/>
		<button type="button" id="replyAddBtn">댓글 등록</button>
		<div id="replyList">
		
		
		</div>
	</form>


</section>

</body>
</html>