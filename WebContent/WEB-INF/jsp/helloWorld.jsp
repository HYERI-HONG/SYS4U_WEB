<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello World!!</title>
</head>
<body>
	<h2>방문자 수 카운트 하기</h2>
	<br>
	<h3>방문자 수 : <%= request.getAttribute("count")%></h3>
</body>
</html>