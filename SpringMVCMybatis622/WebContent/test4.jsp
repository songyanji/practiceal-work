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
<input type="text" id="txt">
地区：<select id="addr"></select>
<input type="button" value="go" onclick="show()">
<input type="button" value="go1" onclick="show1()">
<input type="button" value="go2" onclick="show2()">
<input type="button" value="go3" onclick="show3()">
<input type="button" value="go4" onclick="show4()">
<script type="text/javascript">
function show(){
	var ts=$("#c1").text("深圳");
}
function show1(){
	var ts=$("#c1").text("<font size='5'>重庆</font>");
}
function show2(){
	var ts=$("#txt").val("hello");
}
function show3(){
	var ts=$("#txt").val();
	var ts=$("#c1").text(ts);
}
function show4(){
	var ts=$("#txt").val();
	$("#addr").html("<option>"+ts+"</option>");
	//$("#addr").append("<option>"+ts+"</option>");
}
</script>
</body>
</html>