<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="utf-8" http-equiv="charset">
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/WdatePicker.js"></script> --%>
<script type="text/javascript" defer="defer" src="<%=request.getContextPath() %>/js/datepicker/WdatePicker.js"></script>
</head>
<body>
<form action="insert.action" method="post">
<table>
	<tr>
		<td>姓名:<input type="text" name="name"/></td>
	</tr>
	<tr>
		<td>生日:<input type="text" name="birthday" value=""
	             onfocus="WdatePicker()"/>
		</td>
<!-- 		<td>生日:<input type="text" name="birthday" value=""
	             	onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM-dd'});"/>
		</td> -->
	</tr>
	<tr>
		<td><input type="submit" value="保存"/></td>
	</tr>
</table>
</form>
</body>
</html>