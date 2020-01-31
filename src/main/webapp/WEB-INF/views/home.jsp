<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	${username}님 홈에 오신것을 환영합니다!!  
</h1>

<!-- /hello하면 /springlegacy 안 달고 간다 -->
<form action="/springlegacy/hello" method="post">
	<input type="hidden" name="id" value="ssar" />
	<input type="hidden" name="pw" value="1234" />
	<input type="submit" name="Hello 페이지로 이동" value="이동" />

</form>

</body>
</html>
