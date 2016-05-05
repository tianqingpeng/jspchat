<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
String a= session.getAttribute("Username").toString();
session.setAttribute("username1",a);
String b=session.getAttribute("username1").toString();%>
<script type="text/javascript" src="js/ajax.js">
</script>

<head>

<style type="text/css">
    .sub{
    background: url("images/login.png") no-repeat scroll 0 0 rgba(0, 0, 0, 0);
    border: medium none;
    cursor: pointer;
    display: inline;
/*     float: left; */
    height: 32px;
    width: 142px; 
}
.sub:hover{
	background-position: -1px 0px;
}
  </style>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <title>在线尝试 Bootstrap 实例</title>
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
  <li><a  type="button" onclick="message();" style=""    class="btn btn-default"   
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
<div class="container" id="message"style="padding: 100px 50px 10px;" >
 	<ul>
     </ul>
 </div>
   <script>$(function () 
      { $("[data-toggle='popover']").popover();
      });
   </script>
   
  
<script >





function news(){	
	ajax("get","plettershowServlet",callback);
}
function callback(data){

	var dataObj=eval("("+data+")");//把从后台传过去来的值转换为json对象 
	var student,student1,oTest1,newNode1;
	oTest1 = document.getElementById("lists"); 
	//oTest2 = document.getElementById("lists1");
	oTest1.innerHTML="";
	for(var i=0;i<dataObj.students.length;i++)
	{
		
	
		student=dataObj.students[i];
		newNode1 = document.createElement("li"); 
		var x=student.from_id;
		if("<%=b%>"==x)
		{
			newNode1.innerHTML = "<li><span class='icon'>to---user_name:"+student.to_id+"→</span><span id='param1'>"+student.me_node+"</span><div id='pletter'></div></li>"; 
		}
		else{
			newNode1.innerHTML = "<li><span class='icon'>user_name:"+student.from_id+"→</span><span id='param1'>"+student.me_node+"</span><div id='pletter'><a href='javascript:reply("+'"'+student.user_name+'"'+")';>回复</a></div></li>"; 
		}
		
		oTest1.appendChild(newNode1);
	
	
	
	}  	

	/* for(var i=0;i<dataObj.students1.length;i++)
	{
		student1=dataObj.students1[i];
		newNode1 = document.createElement("li"); 
		var x=student.user_name;
		newNode1.innerHTML = "<li><span class='icon'>to→user_name:"+student1.user_name+"→</span><span id='param1'>"+student1.me_node+"</span><div id='pletter'></div></li>"; 
		oTest1.appendChild(newNode1);
	} */
	
}

function reply(data1){
		 alert(data1);
		var oTest1,newNode1;
		 oTest1 = document.getElementById("message"); 
		oTest1.innerHTML=""; 
		newNode1 = document.createElement("div"); 
		newNode1.innerHTML = "<form action='replypletterclServlet?param1=<%=b%>&param2="+data1+"' method='post'><textarea cols='' rows='' class='textarea' name='message' style='height:162px;width:267px;'></textarea></br><input type='submit' value=' send ' class='btn btn-primary'/></form>"; 
		oTest1.appendChild(newNode1);
	};

function message(){


		var oTest1,newNode1;
		oTest1 = document.getElementById("message"); 
		oTest1.innerHTML="";
		newNode1 = document.createElement("div"); 
		newNode1.innerHTML = "<form action='messageServlet?param=<%=b%>' method='post'><textarea cols='' rows='' class='textarea' name='message' style='height:162px;width:267px;'></textarea></br><input type='submit' value=' send ' class='btn btn-primary'/></form>"; 
		oTest1.appendChild(newNode1);
}
</script>
<center>
<div class="alert alert-success">${ok}</div>
<div id="lists" class="alert alert-success"></div>
<div id="lists1" class="alert alert-success"></div>
</center>
</body>
</html>