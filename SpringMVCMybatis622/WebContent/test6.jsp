<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="box" style="width: 300px;height: 270px;border: blue 1px solid;overflow: true">
</div>
<input type="button" value="go" onclick="fun();">
<script type="text/javascript">
	var ajax;
	function fun(){
	    ajax=new XMLHttpRequest();
	    ajax.onreadystatechange=mycallback;
	    ajax.open("post","test1.jsp");
	    ajax.send();
	}
	function mycallback(){
	    if(ajax.readyState==4){
	    	document.getElementById("box").innerHTML=ajax.responseText;
	    }
	}
</script>
</body>
</html>