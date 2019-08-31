<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@page  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="tools/css/login.css">
</head>
<body>
	
	<div class="signin">

		<form method="post" action="">
			<h2 style="color: white">UMIS</h2><br><br>
			<input type="text" name="username" placeholder="Username"><br><br>
			<input type="password" name="pwd" placeholder="Password"><br><br><br>
			<a href=""><input type="submit" name="login" value="Login"></a><br>
			
			<div class="container"><br>
				<a href="#" style="margin-right: 0px; font-size: 13px; font-family: Tahoma,Geneva, sans-serif;">Forgot password?</a>
			</div>
			
		</form>
	</div>
</body>
</html>