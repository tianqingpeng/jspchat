<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>


<script type="text/javascript">




function registered()
   {
	 window.open("registered.jsp", "newwindow", "height=300, width=400, toolbar='no', menubar=no, scrollbars=no, resizable='no', location=no, status=no");}
   
</script>
<style type="text/css">
.carousel  img{
width: auto;

}
.container li {
list-style: none;

}
.container li a{

float: right;

}
.row li{
list-style: none;
margin: 5px;
padding: 5px;
}
 .btn{ display: block;
}
*{margin:0px;padding:0px}
</style>
<meta charset="UTF-8">
   <title>JavaGR_ais的小站</title>
   <link href="bootstrap 3.0/css/bootstrap.min.css" rel="stylesheet">
	<script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
   <script src="bootstrap 3.0/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #D8C3BE;">
<ol class="breadcrumb">
  <li><a href="#">Home</a></li>
  <li><a href="#">2014</a></li>
  <li class="active">十一月</li>
  <li class="active" style="font-size: 20px;">JavaGR_ais的小站</li>
   <li><a  type="button" style=""    class="btn btn-default" title="Popover title"  
      data-container="body" data-toggle="popover" data-placement="left" 
      data-content="Please log in again after to leave a message!">Give me a message</a></li> 
  <li><a  type="button" style="margin-left: 320px;" class="btn btn-success" title="About me"  
      data-container="body" data-toggle="popover" data-placement="bottom" 
      data-content="JavaGR_ais小站站长cqupt在读,大家好，我是高瑞！">About me</a></li> 
   <li><a  type="button" style=""     class="btn btn-warning" title="Popover title"  
      data-container="body" data-toggle="popover" data-placement="right" 
      data-content="Personal web">On this website</a></li> 
  
</ol>
 <div class="panel-group" id="accordion" style="margin: 0;">
 <div class="panel panel-default">
    <div class="panel-heading" style="margin-top:-25px; ">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" 
          href="#collapseThree">
        click me
        </a>
      </h4>
    </div>
    <div id="collapseThree" class="panel-collapse collapse">
      <div class="panel-body">
       Bootstrap是Twitter推出的一个开源的用于前端开发的工具包。它由Twitter的设计师Mark Otto和Jacob Thornton合作开发，是一个CSS/HTML框架。Bootstrap提供了优雅的HTML和CSS规范，它即是由动态CSS语言Less写成。Bootstrap一经推出后颇受欢迎，一直是GitHub上的热门开源项目，包括NASA的MSNBC（微软全国广播公司）的Breaking News都使用了该项目。 
      </div>
    </div>
  </div>
</div>
<a target="_blank" href="http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url=http://222.182.104.25:8080/bootstrap/&title=JavaGRais的小站&pics=http://222.182.104.25:8080/bootstrap/images/1.jpg"> 分享到QQ空间 <img src="images/share.jpg"></img></a>

<div class="container" style="padding: 100px 50px 10px;" >

 	<ul>
       
      </ul>
   </div>
   <script>$(function () 
      { $("[data-toggle='popover']").popover();
      });
   </script>


<div class="row" style="padding-left:50px; margin-top: -80px;">
   <form class="form-inline" role="form" action="LoginServlet" method="post">
<ul>
      <li><label class="sr-only" for="text"></label>
      <input type="text" class="form-control" name="Username" placeholder="Enter Username"  style="width: 300px;"></li>
    <li>  <label class="sr-only" for="pass"></label>
      <input type="password" class="form-control" placeholder="Password" name="Password" style="width:300px; "></li>
     <li> <input type="submit"  class="btn btn-primary btn-sm"  style="width: 300px;padding:10px;" value="Login"/>
 </li> 
 	<li><button type="button" onclick="registered();"   style="width: 300px;padding:10px;" class="btn btn-success">registered</button></li>
  <li><div class="alert alert-danger">${no}</div></li>
    </ul>	
     </form>
</div>

<div style="float: right;">

</div>

<center>
<h1 style="background-color: #D8C3BE;margin-bottom: 0px;">The beautiful show</h1>
<div id="myCarousel" class="carousel slide">
   <!-- 轮播（Carousel）指标 -->
   <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
   </ol>   
   <!-- 轮播（Carousel）项目 -->
   <div class="carousel-inner">
      <div class="item active">
         <img src="images/942940.jpg" alt="First slide" id="img1">
      </div>
      <div class="item">
         <img src="images/894095.jpg" alt="Second slide">
      </div>
      <div class="item">
         <img src="images/894105.jpg" alt="Third slide">
      </div>
   </div>
   <!-- 轮播（Carousel）导航 -->
   <a class="carousel-control left" href="#myCarousel" 
      data-slide="prev">&lsaquo;</a>
   <a class="carousel-control right" href="#myCarousel" 
      data-slide="next">&rsaquo;</a>
</div> 

</center>

</body>
</html>			