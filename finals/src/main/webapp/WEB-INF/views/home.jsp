<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<html>
<head>
	<title>Home</title>
</head>
<body>

<div>
	
	<br>
	<c:forEach items="${memberList}" var="member">
		<br>
		${member.id} <br>
		${member.password } <br>
		${member.email } <br>
		${member.phonenumber } <br>
	</c:forEach>
</div>
</body>
</html>
