<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<link rel="stylesheet" type="text/css" href="">
<html>
<head>
	<title>B O A R D</title>
</head>
<body>

<p style="font: 30px" align="center"> B O A R D ___ START ! !  </p>
	
<div align="center"style="color: blue;">
	<P >  
			The time on the server is ${serverTime}.
	 </P>
</div>
<div align="center">
	<p style="font-size: 25px"> <a href = "/board/list">  BOARD LIST </a> </p>
</div>
<div align="center" >
	<p style="font-size: 25px"> <a href = "/board/write">  BOARD WRITE </a> </p>
</div>


</body>
</html>
