<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" type="text/css" href="${rootPath}/css/info_booklist.css">
<script src="${rootPath}/js/info_list.js"></script>

<body>
	
	<h3>도서목록</h3>
	<table>
		<tr>
			<th>번호</th>
			<th>ISBN</th>
			<th>도서명</th>
			<th>저자</th>
			<th>출판사</th>
			<th>구입일자</th>
			<th>구입가격</th>
		</tr>
		<c:forEach items="${InfoList}" var="infoDTO" varStatus="status">
			<tr class="record" data-b_code="${infoDTO.b_code}">
				<td>${status.count}</td>
				<td>${infoDTO.b_code}</td>
				<td>${infoDTO.b_name}</td>
				<td>${infoDTO.b_author}</td>
				<td>${infoDTO.b_comp}</td>
				<td>${infoDTO.b_year}</td>
				<td>${infoDTO.b_iprice}</td>
			</tr>
		</c:forEach>
	</table>
	<article class="button_box">
		<button id="info_insert" type="button">도서등록</button>
	</article>
	
	<%@ include file="/WEB-INF/views/include/search.jsp" %>
	
	<section>
		<%@ include file="/WEB-INF/views/include/pagination.jsp" %>
	</section>
</body>
</html>