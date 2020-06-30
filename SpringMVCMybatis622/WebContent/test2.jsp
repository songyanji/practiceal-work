<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="ui/jquery-1.11.1.min.js"></script>
</head>
<body>
<h1 id="box">天津工业大学</h1>
<h1 >天津理工大学</h1>
<h1 class="tt">天津师范大学</h1>
<h1 class="tt">天津城建大学</h1>
<input type="button" value="go" onclick="show()">
<input type="button" value="go1" onclick="show1()">
<input type="button" value="go2" onclick="show2()">
<script type="text/javascript">
function show(){
	var ts=$("#box").css("color","red");
}
function show1(){
	var ts=$(".tt").css("color","yellow");
}
function show2(){
	var ts=$("h1").css("border","blue 1px solid");
}
</script>
</body>
</html>