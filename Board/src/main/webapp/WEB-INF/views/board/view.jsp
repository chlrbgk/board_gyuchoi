<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>B o a r d__V I E W</title>
</head>
<body>

<div id="nav">
	<%@ include file="../include/nav.jsp" %>
</div>	
	
<form method="post">

	<label>제목</label>
	<input type="text" name="title"  value = "${view.title}" /><br />
	
	<label>작성자</label>
	<input type="text" name="writer"  value = "${view.writer}"/><br />
	
	<label>내용</label>

	<textarea cols="50" rows="5" name="content">${view.content}</textarea><br />
	
	<div align="center" >
		<a href = "/board/modify?bno=${view.bno}">BOARD MODIFY</a>
	</div>
	<br/>
	<div align="center" style="font: bold; font-size: 20px">
		<a href = "/board/delete?bno=${view.bno}">BOARD DELETE</a>
	</div>
	
</form>	
	
</body>
</html>