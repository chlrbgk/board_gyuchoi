<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
	<script>
		$(document).on('click', '#btnSave', function(e){
			e.preventDefault();
			$("#form").submit();
		});
		$(document).on('click', '#btnList', function(e){
			e.preventDefault();
			location.href="${pageContext.request.contextPath}/GBoard/list";
		});
	</script>
	<style>
		body {
		  padding-top: 70px;
		  padding-bottom: 30px;
		}
	</style>
</head>

<body>
	<article>
		<div class="container" role="main">
			<h2>board Form</h2>
			<form name="form" id="form" role="form" method="post" action="${pageContext.request.contextPath}/GBoard/saveBoard">
				<div class="mb-3">
					<label for="title">제목</label>
					<input type="text" class="form-control" name="title" id="gTitle" placeholder="제목을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="reg_id">작성자</label>
					<input type="text" class="form-control" name="reg_id" id="gWriter" placeholder="이름을 입력해 주세요">
				</div>
			     <div class="mb-3">
					<label for="content">내용</label>
					<textarea class="form-control" rows="5" name="content" id="gContent" placeholder="내용을 입력해 주세요" ></textarea>
				</div>
				<div class="mb-3">
					<label for="tag">TAG</label>
					<input type="text" class="form-control" name="tag" id="gTag" placeholder="태그를 입력해 주세요">
				</div>
			</form>
			<div >
				<button type="button" class="btn btn-sm btn-primary" id="btnSave">저장</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
			</div>
		</div>
	</article>
</body>
</html>