<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电影信息修改</title>
<link rel="stylesheet" href="../css/index.css">
<link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
	<!--  
		1. WHY 使用 form 标签呢 ?
		可以更快速的开发出表单页面, 而且可以更方便的进行表单值的回显
		2. 注意:
		可以通过 modelAttribute 属性指定绑定的模型属性,
		若没有指定该属性，则默认从 request 域对象中读取 command 的表单 bean
		如果该属性值也不存在，则会发生错误。
	-->

	<!-- 
		这个action写成了绝对路径,是因为如果是相对路径,新建的时候没有问题,
		而修改的时候会有问题会变成movie/movie就无法映射了 
	-->
	<div id="info-form" align="center">
		<form:form action="${pageContext.request.contextPath}/movie"
			method="POST" modelAttribute="movie">
			<br />

			<h1>修改电影信息：编号${requestScope.movie.movie_id}</h1>
			<form:hidden path="movie_id" />
			<input type="hidden" name="_method" value="PUT" />
			<br />
	
			 电影类型：<form:input path="type_movie" placeholder="请输入电影类型"
				required="required" style="width: 200px; margin-top: 10px" />
			<br>
			 
			关键词语：<form:input path="keyword" placeholder="请输入关键词"
				required="required" style="width: 200px; margin-top: 10px" />
			<br>

			电影资源：<form:input path="movie_source" placeholder="请输入电影资源"
				required="required" style="width: 200px; margin-top: 10px" />
			<br>
		
			电影评分：<form:input path="rating" placeholder="请输入电影资源"
				required="required" style="width: 200px; margin-top: 10px" />
			<br>

			<input type="submit" value="确认"
				style="width: 150px; hight: 30px; margin-top: 40px" />
		</form:form>
	</div>

</body>
</html>