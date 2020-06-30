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
<ul id="city">
	<li>天津
		<ul>
			<li>南开</li>
			<li>和平</li>
			<li>河西</li>
		</ul>
	</li>
	<li id="c1">北京</li>
	<li>上海</li>
	<li>广州</li>
</ul>

<input type="button" value="go" onclick="show()">
<input type="button" value="go1" onclick="show1()">
<input type="button" value="go2" onclick="show2()">
<input type="button" value="go3" onclick="show3()">
<input type="button" value="go4" onclick="show4()">
<script type="text/javascript">
function show(){
	var ts=$("#city li").css("color","red");
}
function show1(){
	var ts=$("#city>li").css("color","yellow");
}
function show2(){
	var ts=$("#c1+li").css("border","blue 1px solid");
}
function show3(){
	var ts=$("#c1~li").css("border","red 1px solid");
}
function show4(){
	var ts=$("#city li:last").css("color","green");
}
</script>
</body>
</html>