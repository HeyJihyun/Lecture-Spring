<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error {
		color: red;
		font-size: 0.6em;
		display: block;
	}
</style>
</head>
<body>
<section>
	<h2>게시글 등록폼</h2>
	<form:form method="post" modelAttribute="boardVO">
		<table>
			<tr>
				<th>제목</th>
				<td><form:input path="title"/><form:errors path="title" class="error" /></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><form:input path="writer"/><form:errors path="writer" class="error" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><form:textarea path="content"/></td>
			</tr>
		</table>
		<button type="submit">등  록</button>
	</form:form>
</section>

</body>
</html>