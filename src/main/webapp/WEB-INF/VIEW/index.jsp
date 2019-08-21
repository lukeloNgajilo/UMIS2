<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>UMIS</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/simple-sidebar.css" rel="stylesheet">


 <script src="https://kit.fontawesome.com/e3fe58e232.js"></script>
</head>

<body>


<nav class="navbar navbar-dark bg-dark">
  <a class="navbar-brand ">UMIS</a>
  <form class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>


  <div class="d-flex " id="wrapper">

    <!-- Sidebar -->
    <div class="bg-secondary border-right" id="sidebar-wrapper">
      
      <div class="list-group list-group-flush">
        <a href="university.jsp]" class="list-group-item list-group-item-action bg-secondary">UNIVERSITY</a>
        <a href="faculty.jsp" class="list-group-item list-group-item-action bg-light">FACULTY</a>
        <a href="campus.jsp" class="list-group-item list-group-item-action bg-secondary">CAMPUS</a>
        <a href="deparment.jsp" class="list-group-item list-group-item-action bg-secondary">DEPARMENT</a>
        <a href="programme.jsp" class="list-group-item list-group-item-action bg-secondary">PROGRAMME</a>
          <a href="users.jsp" class="list-group-item list-group-item-action bg-secondary">USERS</a>
        <a href="changepassword.jsp" class="list-group-item list-group-item-action bg-secondary">CHANGE PASSWORD</a>
        <a href="logout.jsp" class="list-group-item list-group-item-action bg-secondary">LOGOUT</a>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-secondary border-bottom">
        <button class="btn btn-primary" id="menu-toggle">Menu</button>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
            <li class="nav-item active">
              <a class="nav-link" href="#">User<span class="sr-only">(current)</span></a>
            </li>
    
          </ul>
        </div>
      </nav>

      <div class="container-fluid">
        <h1 class="mt-4">Simple Sidebar</h1>
        <p>e>hear we come</p>
      </div>
    </div>
    <!-- /#page-content-wrapper -->

  </div>
  <!-- /#wrapper -->

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Menu Toggle Script -->
  <script>
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
  </script>

</body>

</html>
