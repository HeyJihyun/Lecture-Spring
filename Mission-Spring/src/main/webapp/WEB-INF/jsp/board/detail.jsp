<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
section {
	width: 80%;
	margin: 0 auto;
	text-align: center;
}

table {
	width: 100%;
}

button {
	margin: 10px;
	width: 100px;
	height: 35px;
}

td {
	text-align: left;
	padding-left: 20px;
}
</style>
<script src="http://code.jquery.com/jquery-3.7.0.min.js"></script>
<script>

	// 댓글리스트 조회(게시판번호)
	let getReplyList = function(){
		$.ajax({
			url: '${pageContext.request.contextPath}/reply/${board.no}',
			type:'get',
			success : function(result){
				let list = JSON.parse(result)
				$('#replyList').empty()
				$(list).each(function(){
					//console.log(this)
					
					let str = ''
					str += '<hr>'
					str += '<div>'
					str += '<strong>' + this.content + '</strong>'
					str += '(' + this.writer + ')'
					str += '&nbsp;&nbsp;' + this.regDate + '&nbsp;&nbsp;'
					str += '<button id=' + this.no + '>삭제</button>'
					str += '</div>'
					
					$('#replyList').append(str)
					
				})
			
			}, error: function(){
				alert('안되나봐')
			}
		})
	}
	
	$(document).ready(function(){
		getReplyList();
	})

	$(document).ready(function(){
		$('#replyAddBtn').click(function(){
			let content = document.rform.content.value
			let writer = document.rform.writer.value
			
			console.log(content, writer)
			
			// http://localhost:8080/Mission-Spring/reply
			$.ajax({
				url: '${pageContext.request.contextPath}/reply',
				type: 'post',
				data: {
					content: content,
					writer: writer,
					boardNo: ${board.no}
				}, success: function(){
					
					document.rform.content.value = ''
					document.rform.writer.value = ''
					getReplyList()
				}, error: function(){
					alert('실패')
				}
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
		<button
			onclick="location.href='${pageContext.request.contextPath}/board'">목록</button>
		<button
			onclick="location.href='${pageContext.request.contextPath}/board'">수정</button>
		<button
			onclick="location.href='${pageContext.request.contextPath}/board'">삭제</button>

		<br>
		<hr>

		<!-- 댓글관련 -->

		<form name="rform" method="post">
			댓글 : <input type="text" name="content" size="50" /> 이름 : <input
				type="text" name="writer" size="10" />
			<button type="button" id="replyAddBtn">댓글 등록</button>
			<div id="replyList"></div>
		</form>


	</section>

</body>
</html>