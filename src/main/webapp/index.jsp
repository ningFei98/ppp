<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 	<ol>
		<c:forEach items="${requestScope.depts}" var="d">
			<li>${d.dname}</li>
		</c:forEach>
	</ol> --%>
	
	<table>
		<tr>
			<th>序号</th>
			<th>部门</th>
			<th>其他</th>
		</tr>
		<c:forEach items="${requestScope.depts}" var="d" varStatus="i">
			<tr>
				<th>${i.count}</th>
				<th>${d.dname}</th>
				<th>${d.dloc}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>