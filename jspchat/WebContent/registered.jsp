<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
.row li
{
list-style: none;
margin: 20px;

}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registered</title>
<link href="bootstrap 3.0/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
<script src="bootstrap 3.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="row" style="">
   <form class="form-inline" role="form" action="registeredServlet" method="post">
<ul>
	  <li><label class="sr-only" for="text"></label>
    <!--   <input type="text" class="form-control" name="Userid" placeholder="Enter Userid"  style="width: 300px;"></li>
      <li><label class="sr-only" for="text"></label> -->
      <input type="text" class="form-control" name="Username" placeholder="Enter Username"  style="width: 300px;"></li>
    <li>  <label class="sr-only" for="pass"></label>
      <input type="password" class="form-control" placeholder="Password" name="Password" style="width:300px; "></li>
     <li> <input type="submit"  class="btn btn-primary btn-sm"  style="width: 300px;padding:10px;" value="confirm"/>
 </li> 
 	<li><h1><span class="label label-default">${ok}</span></h1><li>
    </ul>	
     </form>
</div>
</body>
</html>