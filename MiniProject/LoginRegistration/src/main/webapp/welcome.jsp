<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<head>
    <link rel="stylesheet" href=
"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<style>
body{
	background-image: url("images/pic2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
nav{
	background-image: url("images/pic2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}

</style>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#" style="color:white;"><%= session.getAttribute("name") %></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#" style="color:white;">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#" style="color:white;">Friends</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#" style="color:white;">Inbox</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp" style="color:white;">Logout</a>
        </li>
      </ul>
      <form class="d-flex" role="search" style="position: relative;left:830px;">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" >
        <button class="btn btn-outline-light" type="submit">Search</button>
      </form>
      
    </div>
  </div>
</nav>
<div style="position:relative; top:250px;left:550px;width:35%;color:white">
  <h1>Welcome To My Page</h1>
</div>

<script src=
"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
  
    <script src=
"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js">
    </script>
  
    <script src=
"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js">
    </script>
</body>
</html>