<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增电影信息</title>
<style type="text/css">
@import url(css/index.css);
</style>
<style type="text/css">
@import url(css/bootstrap.css);
</style>
</head>
<body>
	<div id="info-form" align="center">
		<div id="right">
			<h2 class="text-center">请输入要添加的电影信息</h2>
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
		而修改的时候会有问题会变成student/student就无法映射了 
	-->
			<form:form class="form-horizontal"
				action="${pageContext.request.contextPath}/movie" method="POST"
				modelAttribute="movie">

					电影名称
				<form:input path="movie_name" placeholder="请输入电影名称"
					required="required" style="width: 200px; margin-top: 10px" />
				<br>

					导演名字
				<form:input path="director" placeholder="请输入导演" required="required"
					style="width: 200px; margin-top: 10px" />
				<br>

					主演名字
					<form:input path="actor" placeholder="请输入主演" required="required"
					style="width: 200px; margin-top: 10px" />
				<br>

				
					语言类型
					<form:select path="type_language" items="${type_language }"
					style="width: 200px; margin-top: 10px" />
				<br>
				
			
					电影类型
					<form:input path="type_movie" placeholder="请输入电影类型"
					required="required" style="width: 200px; margin-top: 10px" />
				<br>

				
					发行地区
					<form:select path="district" items="${district }"
					style="width: 200px; margin-top: 10px" />
				<br>
				
				
					上映年代
					<form:input path="years" placeholder="请输入上映年代"
					required="required" style="width: 200px; margin-top: 10px" />
				<br>
				
				
					关键词语
					<form:input path="keyword" placeholder="请输入关键词"
					required="required" style="width: 200px; margin-top: 10px" />
				<br>
				
				
					电影资源
					<form:input path="movie_source" placeholder="请输入电影资源"
					required="required" style="width: 200px; margin-top: 10px" />
				<br>
				
				
					电影评分
					<form:input path="rating" placeholder="请输入评分"
					required="required" style="width: 200px; margin-top: 10px" />
				<br>

				<input type="submit" value="确认"
					style="width: 150px; hight: 30px; margin-top: 20px" />

			</form:form>

		</div>
	</div>
</body>
</html>