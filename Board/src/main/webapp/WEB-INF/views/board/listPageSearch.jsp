<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="nav">
	<%@ include file="../include/nav.jsp" %>
</div>

	<table>
<!-- HEAD -->	
		 <thead>
				  <tr>
						   <th>번호</th>
						   <th>제목</th>
						   <th>작성일</th>
						   <th>작성자</th>
						   <th>조회수</th>
				  </tr>
		 </thead> 
<!-- BODY -->		 
		 <tbody>
			  	<c:forEach items="${list}" var="list">
						 <tr>
							  <td>${list.bno}</td>
							  <td>
							  		<a href = "/board/view?bno=${list.bno}">${list.title}</a>
							  </td>
							  <td>${list.regDate}</td>
							  <td>${list.writer}</td>
							  <td>${list.viewCnt}</td>
						 </tr>
				</c:forEach>
		 </tbody>
	</table> 
<!-- Paging -->	
<div>
	<c:if test="${page.prev}">
		<span>[ <a href="/board/listPageSearch?num=${page.startPageNum - 1}">이전</a> ]</span>
	</c:if>	
	<c:forEach begin="${page.startPageNum}" end="${page.endPageNum}" var="num">
		<span>	
			<c:if test="${select != num}">
				<a href="/board/listPageSearch?num=${num}">${num}</a>
			</c:if> 					
			<c:if test="${select == num}">
				<b>${num}</b>
			</c:if>	 			
		</span>
	</c:forEach>	
	<c:if test="${page.next}">
		<span>[ <a href="/board/listPageSearch?num=${page.endPageNum + 1}">다음</a> ]</span>
	</c:if>	

	<div>
	  <select name="searchType">
	     	  <option value="title">제목</option>
	          <option value="content">내용</option>
		      <option value="title_content">제목+내용</option>
		      <option value="writer">작성자</option>
	  </select>
	  
	  <input type="text" name="keyword" />
	  
	  <button type="button">검색</button>
	 </div>
<script>

	document.getElementById("searchBtn").onclick = function () {
		  
		let searchType = document.getElementsByName("searchType")[0].value;
		let keyword =  document.getElementsByName("keyword")[0].value;
		
		location.href = "/board/listPageSearch?num=1" + "&searchType=" + searchType + "&keyword=" + keyword;
	};
</script>
</div>
</body>
</html>




