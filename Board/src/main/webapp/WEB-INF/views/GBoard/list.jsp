<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<!DOCTYPE html>
<html>
<head>

<title>[ [ 	G A M E___L I S T 	] ] </title>
<style>
body {
	padding-top: 70px;
	padding-bottom: 30px;
}
</style>
<script>
	$(document).on('click', '#btnWriteForm', function(e){
		e.preventDefault();
    	location.href = "${pageContext.request.contextPath}/GBoard/boardInsert";
	});
</script>
</head>
<body>

<article>
	<div class="container">
		<div class="table-responsive">
		
<h1>[  [  BOARD   LIST  ]  ]</h1>
	<table class="table table-striped table-sm">
	<!-- colgroup  -->
			<colgroup>
				<col style="width:5%;" />
				<col style="width:auto;" />
				<col style="width:15%;" />
				<col style="width:10%;" />
				<col style="width:10%;" />
			</colgroup>
	<!-- thead  -->
			<thead>
				<tr>
					<th>NO</th>
					<th>TITLE</th>
					<th>CONTENT</th>
					<th>DOWN_CNT</th>
					<th>WRITE_DATE</th>
				</tr>
			</thead>
	<!-- tbody  -->
			<tbody>
				<c:choose>
					<c:when test="${empty list}" >
						<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
					</c:when> 
					<c:when test="${!empty list}">
						<c:forEach var="list" items="${list}">
							<tr>
								<td><c:out value="${list.gno}"/></td>
								<td><c:out value="${list.gTitle}"/></td>
								<td><c:out value="${list.gContent}"/></td>
								<td><c:out value="${list.gDownCnt}"/></td>
								<td><c:out value="${list.gDate}"/></td>
							</tr>
						</c:forEach>
					</c:when>
				</c:choose>
			</tbody>
		</table>
		
		</div>
	<div >
		<button type="button" class="btn btn-sm btn-primary" id="btnWriteForm">글쓰기</button>
	</div>	
	</div>
</article>	

</body>
</html>