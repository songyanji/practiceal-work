<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1{
		color: blue;
		border: yellow 1px solid;
	}
</style>
<script type="text/javascript" src="ui/jquery-1.11.1.min.js"></script>
</head>
<body>
<h1 id="box" onmouseover="show();">天津工业大学</h1>
<input type="text" id="t1" >
<script type="text/javascript">
	function show(){
		//alert();
		//document.getElementById("box").innerHTML="天津师范大学";
		var ts=$("#t1").val();
		$("#box").text(ts);
	}
</script>
</body>
</html>