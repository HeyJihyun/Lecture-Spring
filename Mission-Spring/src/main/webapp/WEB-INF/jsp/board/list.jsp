<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 전체 조회</title>
</head>
<body>
	<h2>게시글 전체 조회</h2>

	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList}">
				<tr>
					<td>${board.no }</td>
					<td>
						<a href="${pageContext.request.contextPath }/board/detail?no=${board.no}">
							${board.title }
						</a>
					</td>
					<td>${board.writer }</td>
					<td>${board.regDate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>