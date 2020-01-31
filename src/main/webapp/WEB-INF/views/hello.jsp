<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Hello</title>
</head>
<body>
<h1>
	헬로 페이지에 오신것을 환영합니다!!
	<br />
	
	ID: ${id}
	PW: ${pw}
</h1>

<a href="/springlegacy/goodbye?addr=LA&hobby=영화감상">Goodbye페이지로 Go Go!</a>

</body>
</html>
