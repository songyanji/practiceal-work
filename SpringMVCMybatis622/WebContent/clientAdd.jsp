<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>添加客户</h2>
<form action="addClientSave.do" method="post" >
<table >
<tr><td>编号</td><td><input type="text" name="ClientId" ></td></tr>
<tr><td>姓名</td><td><input type="text" name="clientName"  ></td></tr>
<tr><td>地址</td><td><input type="text" name="address"  ></td></tr>
<tr><td>电话</td><td><input type="text" name="tel" ></td></tr>
<tr><td>数量</td><td><input type="text" name="BucketCnt" ></td></tr>
<tr><td>押金</td><td><input type="text" name="foregift" ></td></tr>
<tr><td>预定时间</td><td><input type="text" name="startDate" ></td></tr>
<tr><td colspan="2"><input type="submit" value="保存" ></td></tr>
</table>
</form>

</body>
</html>