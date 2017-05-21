<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人电影信息管理系统</title>
<style type="text/css">@import url(css/index.css);</style>
<style type="text/css">@import url(css/bootstrap.css);</style>
<style type="text/css">@import url(css/info.css);</style>
<!--  
	SpringMVC 处理静态资源:
	1. 为什么会有这样的问题:
	优雅的 REST 风格的资源URL 不希望带 .html 或 .do 等后缀
	若将 DispatcherServlet 请求映射配置为 /, 
	则 Spring MVC 将捕获 WEB 容器的所有请求, 包括静态资源的请求, SpringMVC 会将他们当成一个普通请求处理, 
	因找不到对应处理器将导致错误。
	2. 解决: 在 SpringMVC 的配置文件中配置 <mvc:default-servlet-handler/>
-->
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".delete").click(function() {
			var href = $(this).attr("href");
			$("form").attr("action", href).submit();
			return false;
		});
	})
</script>


</head>

<body>
<div class="container-fluid">
	<div id="info-form">
	<!--  <div id="global">-->
		<center>
			<!-- 删除的提交方式 -->
			<form action="" method="POST">
				<input type="hidden" name="_method" value="DELETE">
			</form>

			<c:if test="${empty requestScope.movies}">
		没有任何电影信息
	    </c:if>

			<!-- 大括号之内的表达式随便空格,而双引号和表达式之间不能有任何的空格 -->
			<c:if test="${!empty requestScope.movies }">
			<h2 class="text-center">电影详情</h2>
				<table border="1" cellpadding="10" cellspacing="0">
					<tr>
						<th>编号</th>
						<th>电影</th>
						<th>导演</th>
						<th>主演</th>
						<th>语言类型</th>
						<th>电影类型</th>
						<th>地区</th>
						<th>上映年代</th>
						<th>关键词</th>
						<th>资源</th>
						<th>评分</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<c:forEach items="${requestScope.movies}" var="movie">
						<tr>
							<td>${movie.movie_id }</td>
							<td>${movie.movie_name }</td>
							<td>${movie.director  }</td>
							<td>${movie.actor}</td>
							<td>${movie.type_language}</td>
							<td>${movie.type_movie}</td>
							<td>${movie.district}</td>
							<td>${movie.years}</td>
							<td>${movie.keyword}</td>
							<td>${movie.movie_source}</td>
							<td>${movie.rating}</td>
							<td><a href="movie/${movie.movie_id}">修改</a></td>
							<td><a class="delete" href="movie/${movie.movie_id}">删除</a></td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
			<br />
			<h1>
				新增电影,请点击这里---><a href="movie"> 新增一部电影</a>
			</h1>
		</center>

	</div>
	</div>
</body>
</html>