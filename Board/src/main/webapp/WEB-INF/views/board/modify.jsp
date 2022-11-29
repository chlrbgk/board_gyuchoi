<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD__UPDATE</title>
</head>
<body>

<form method="post">

	<label>제목</label>
	<input type="text" name="title"  value = "${view.title}" /><br />
	
	<label>작성자</label>
	<input type="text" name="writer"  value = "${view.writer}"/><br />
	
	<label>내용</label>

	<textarea cols="50" rows="5" name="content">${view.content}</textarea><br />
	
	<button  type="submit" style="font-size: 20px; color: orange; text-align: center;"> U P D A T E</button>

</form>	

</body>
</html>