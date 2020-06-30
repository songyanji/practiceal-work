<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="ui/jquery-1.11.1.min.js"></script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="box" style="width: 300px;height: 270px;border: blue 1px solid;">
</div>
<input type="button" value="go" onclick="fun()">
<input type="button" value="go1" onclick="fun1()">
<input type="text" id="txt">
<script type="text/javascript">
  function fun(){
    $("#box").load("show.jsp");
  }
  function fun1(){
    var t1=$("#txt").val()
    $("#box").load("show1.jsp",{line:t1});
  }
</script>
</body>
</html>