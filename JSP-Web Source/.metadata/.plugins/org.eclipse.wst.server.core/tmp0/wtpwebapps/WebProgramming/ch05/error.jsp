<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage = "true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error of Error_test.jsp</title>
</head>
<body>
	<h1>에러가 발생 하였습니다.</h1>
	<hr>
		<table style = "font-size : 20pt; font-family : consolas;">
			<tr bgcolor = "pink">
				<td>
				관리자에게 문의해주세요<br>
				빠른 시일내 <strong>복구</strong>하겠습니다.
				<hr>
				<%= exception%>
				<hr>
				</td>
			</tr>
		</table>
</body>
</html>