<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

	let checkLogin = function(){
		
		let form = document.loginForm;
		
		if(form.id.value === null || form.id.value === ''){
			
			alert('아이디를 입력하세요')
			form.id.focus()
			return false;
		}
		
		if(form.password.value === null || form.password.value === ''){
			form.password.focus()
			alert('비밀번호를 입력하세요')
			return false;
		}
		
		return true
	}
</script>
</head>
<body>
	<div align="center">
		<h1>로그인 페이지</h1>

		<form method="post" name="loginForm" onsubmit="return checkLogin()">
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password" /></td>
				</tr>
			</table>

			<button type="submit">로그인</button>
		</form>
	</div>
</body>
</html>