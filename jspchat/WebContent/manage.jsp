<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%
String a= session.getAttribute("username").toString();
session.setAttribute("username1",a);
String b=session.getAttribute("username1").toString();
%>
<script type="text/javascript" src="js/ajax.js">
</script>
<head>
<style type="text/css">
/*右边部分*/
/* #main {
	width: 1200px;
	padding: 0 0px;
	background: #D8C3BE;
	font-size: 14px;
	color: #686868;
	padding-bottom: 10px;
} */

#main li {
/*  	height: 33px; */ 
	border-bottom: 1px dashed #dcdcdc;
	line-height: 33px;
 /* 	margin: 0px 16px 0 16px;  */
	list-style: none;
		width:auto;
}
#main li span {
	/* float: right; */
	padding-left: 100px;
/* 	padding-right: 30px; */
}

.main-nav li a {
    color: #fff;
    display: inline-block;
    height: 45px;
    line-height: 45px;
    text-align: center;
    text-decoration: none;
    width: 115px;
    margin: 0 0 25px 30px;
  /*   float: left; */
    padding-right: 3px;
    padding-left: 3px;
}
.main-nav li {
    font-size: 18px;
    height: 50px;
    width: auto;
    float: left;
}
.mt10{
	margin-left:80px;
	line-height:30px;
}



  </style>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <title>在线尝试 Bootstrap 实例</title>
 <link href="bootstrap 3.0/css/bootstrap.min.css" rel="stylesheet">
	<script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
   <script src="bootstrap 3.0/js/bootstrap.min.js"></script>
   <script type="text/javascript" src="js/ajax.js">
</script>
</head>
<body style="background-color: #D8C3BE;">
<ol class="breadcrumb">
  <li><a href="#">Home</a></li>
  <li><a href="#">2014</a></li>
  <li class="active">十一月</li>
  <li class="active" style="font-size: 20px;">JavaGR_ais的小站</li>
  <li><a  type="button"  style=""    class="btn btn-default"   
      data-container="body" data-toggle="popover" data-placement="left" 
      >Give me a message</a></li> 
  <li><a  type="button" style="margin-left: 320px;" class="btn btn-success" title="About me"  
      data-container="body" data-toggle="popover" data-placement="bottom" 
      data-content="JavaGR_ais小站站长cqupt在读,大家好，我是高瑞！">About me</a></li> 
   <li><a  type="button"  onclick="news();" style=" width: 120px;"     class="btn btn-warning" title="Popover title"  
      data-container="body" data-toggle="popover" data-placement="right" 
      data-content="Personal web">     	 News      </a></li> 
      <li style="font-size: 20px;"><span style="" class="label label-default">welcom to you：<%=b %></span></li>
</ol>
<div>
<ul class="nav nav-pills nav-stacked">
   <li><a href="javascript:newsList()">message</a></li>
   <li><a href="javascript:img()">news</a></li>
   <li><a href="javascript:img()">photo</a></li>
   <li><a href="#">Study news</a></li>
</ul>
</div>
    <div id="main" class="fr" >
       
    	  <ul class="main-nav bg-66a370">
        		<!-- <li><a href="#">买家姓名</a></li>
        		<li><a href="#">联系方式</a></li> -->
        	</ul>
        <ul class="mt10" id="lists"> 
           
        </ul>
          <div>
        	<ul id="lists2"></ul>
        </div>
         </div>
   <script>$(function () 
      { $("[data-toggle='popover']").popover();
      });
   </script>
<script >


function img(){
	
}
 function getimg(data)
{
	var dataObj=eval("("+data+")");//把从后台传过去来的值转换为json对象 
	var student,oTest1,newNode1;
	oTest1 = document.getElementById("lists"); 
	oTest1.innerHTML="";
	for(var i=0;i<dataObj.Imgs.length;i++)
	{
		student=dataObj.Imgs[i];
		newNode1 = document.createElement("li"); 
		newNode1.innerHTML = "<li><img src='"+student.url+"'/></li>"; 
		oTest1.appendChild(newNode1);
	}  		
}


 function pletter(data1){

		var oTest1,newNode1;
		 oTest1 = document.getElementById("pletter"); 
		oTest1.innerHTML=""; 
		newNode1 = document.createElement("div"); 
		newNode1.innerHTML = "<form action='pletterclServlet?param1=<%=b%>&param2="+data1+"' method='post'><textarea cols='' rows='' class='textarea' name='message' style='height:162px;width:267px;'></textarea></br><input type='submit' value=' send ' class='btn btn-primary'/></form>"; 
		oTest1.appendChild(newNode1);
	};
 function pletter1(data){
		
	}
function news(){	
	
	alert("马上开发");
}
function newsList(){	
	ajax("get","messageshowpesronuser",callback);
}
function showpersonnews(data){	
	ajax("get","messageshowServlet?data="+data,callback1);
}
function callback1(data){

		
	 /* var dataObj=eval("("+data+")");
		var student,oTest1,newNode1;
		oTest1 = document.getElementById("lists2"); 
		oTest1.innerHTML="";
		for(var i=0;i<dataObj.students.length;i++)
		{
			student=dataObj.students[i];
			
			newNode1 = document.createElement("li"); 
			var x=student.user_name;
			var y = student.from_id;
	
			newNode1.innerHTML = "<li><span class='icon'>"+student.me_node+"</span><span id='param1'>"+student.user_name+"</span><div id='pletter'><a href='javascript:pletter("+'"'+student.user_name+'"'+")';>私信</a></div></li>"; 
			oTest1.appendChild(newNode1);
		}  		     */
	var dataObj=eval("("+data+")");//把从后台传过去来的值转换为json对象 
	var student,student1,oTest1,newNode1;
	oTest1 = document.getElementById("lists2"); 
	//oTest2 = document.getElementById("lists1");
	oTest1.innerHTML="";
	for(var i=0;i<dataObj.students.length;i++)
	{
	
	
		student=dataObj.students[i];
		newNode1 = document.createElement("li"); 
		var x=student.fromusername;

		if("<%=b%>"==x){
			newNode1.innerHTML = "<li><span class='icon'>to---user_name:"+student.to_id+"→</span><span id='param1'>"+student.me_node+"</span><div id='pletter'></div></li>"; 

		}
		else{
			newNode1.innerHTML = "<li><span class='icon'>user_name:"+student.from_id+"→</span><span id='param1'>"+student.me_node+"</span><div id='pletter'><a href='javascript:pletter("+'"'+student.fromusername+'"'+")';>回复</a></div></li>"; 

		}
		
		oTest1.appendChild(newNode1);
	
	
	
	}  	
}

function callback(data){
	
 	 var dataObj=eval("("+data+")");
		var student,oTest1,newNode1;
		oTest1 = document.getElementById("lists"); 
		oTest1.innerHTML="";
		for(var i=0;i<dataObj.students.length;i++)
		{
			student=dataObj.students[i];
			
			newNode1 = document.createElement("li"); 
			var x=student.user_name;
			var y = student.from_id;
	
			
			newNode1.innerHTML = "<li><div id='pletter'><a href='javascript:showpersonnews("+'"'+student.from_id+'"'+")';><span id='param1'>"+student.from_id+"</span></a></div></li>"; 
			oTest1.appendChild(newNode1);
		}   	
	
	/*  var dataObj=eval("("+data+")");
	var student,oTest1,newNode1;
	oTest1 = document.getElementById("lists"); 
	oTest1.innerHTML="";
	for(var i=0;i<dataObj.students.length;i++)
	{
		student=dataObj.students[i];
		
		newNode1 = document.createElement("li"); 
		var x=student.user_name;
		var y = student.from_id;
		alert(x+""+y);
		if(x==y){
		newNode1.innerHTML = "<li><span class='icon'>"+student.me_node+"</span><span id='param1'>"+student.user_name+"</span><div id='pletter'><a href='javascript:pletter("+'"'+student.user_name+'"'+")';>私信</a></div></li>"; 
		oTest1.appendChild(newNode1);}
	}  		  */
}
window.onload = function() { 
	img();  
};

</script>
<center>
</center>

</body>
</html>