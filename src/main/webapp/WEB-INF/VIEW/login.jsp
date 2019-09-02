<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@page  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

	<style type='text/css'>

		body{
			font-family: sans-serif;
			color: #fff;
			background:url(img3.jpg);
			background-size: cover;

		}

		.signin{
			background-color: rgba(44,62,80,0.4);
			padding: 40px;
			width: 250px;
			margin:auto;
			margin-top: 80px;
			height: 400px;
			border-radius: 3px;
			border-width: 1px;
			border-style:solid;
			border-color: white;
		}

		form{
			width: 250px;
			text-align: center;
		}

		input[type=text]{
			width: 240px;
			text-align: center;
			background: transparent;
			border:none;
			border-bottom: 1px solid #fff;
			font-family: sans-serif;
			font-size: 16px;
			font-weight: 200px;
			padding: 10px 0;
			transition: border 0.5;
			outline: none;
			color: #fff;
		}

		input[type=password]{
			width: 240px;
			text-align: center;
			background:transparent;
			border:none;
			border-bottom: 1px solid #fff;
			font-family: sans-serif;
			font-size: 16px;
			font-weight: 200px;
			padding: 10px 0;
			transition: border 0.5;
			outline: none;
			color: #fff;
		}

		#submit{
			border:none;
			width: 150px;
			background: #808080;
			color: #fff;
			font-size: 16px;
			line-height: 25px;
			padding: 10px 0;
			border-radius: 7px;
			cursor: pointer;
			border-style: solid;
			border-color: #fff;
			border-width: 2px;
		}

		button[type=submit]:hover{
			color: #fff;
			background-color: #e2bb8c;
		}

		h2{
			color: white;
			font-family: verdana;
		}

		a{
			color: yellow;
			text-decoration: blink;
		}
		a:hover{
			color: #fff;
		}

		::placeholder{
			color: #dbed9a;
			opacity: 0.5;
		}



	</style>


	<title>Login</title>
	<link href="tools/css/login.css" rel="stylesheet" >  
	<!--  type="text/css" -->
</head>
<body>
	
	<div class="signin">

		<form method="POST" action="/savelogin">
			<h2 style="color: white">UMIS</h2><br><br>
			<input type="text" name="email" placeholder="email"><br><br>
			<input type="password" name="password" placeholder="Password"><br><br><br>
			<button type="submit" class="btn btn-primary">login</button><br>
			     ${msg}
			<div class="container"><br>
				<a href="#" style="margin-right: 0px; font-size: 13px; font-family: Tahoma,Geneva, sans-serif;">Forgot password?</a>
			</div>
			
		</form>
	</div>
</body>
</html>