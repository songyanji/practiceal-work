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
地区：<select id="student"></select>
<input type="button" value="go" onclick="show()">

<script type="text/javascript">
	var stus=[{"sname":"tom","score":95},
			{"sname":"jerry","score":89},
			{"sname":"apache","score":91}];
	function show(){
		for(i=0;i<stus.length;i++){
			$("#student").append("<option>"+stus[i].sname+"</option>");
		}

	}
</script>
</body>
</html>