<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="ui/css/layui.css" rel="stylesheet"/>
<script type="text/javascript" src="ui/layui.js"></script>
</head>
<body>
<div class="layui-container">
<button id="btn1" class="layui-btn layui-btn-danger layui-btn-lg">open</button>
</div>
<script type="text/javascript">
	layui.use(["layer","jquery"],function(){
		var layer=layui.layer;
		var $=layui.jquery;
		$("#btn1").click(function(){
			layer.open({
				title:"测试窗口",
				content:"<h1>hello world</h1>",
				btn:["ok","cancel"],
				maxWidth:500
			});
		});
	});
</script>
</body>
</html>