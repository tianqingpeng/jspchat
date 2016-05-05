function createXHR(){
		if(typeof XMLHttpRequest != undefined){
			return new XMLHttpRequest();
		}
		else{
			var xmlhttp = null;
			var versions = ["MSXML2.XMLHttp2.0","MSXML2.XMLHttp3.0","MSXML2.XMLHttp4.0","MSXML2.XMLHttp5.0"
			                ,"MSXML2.XMLHttp6.0","MSXML2.XMLHttp","Miscrosoft.XMLHTTP"];
			
				for(var i = 0; i < versions.length; i++){
						try{
							xmlhttp = new ActiveXObject(versions[i]);
						}
						catch(ex){
							continue;
						}
				}
				return xmlhttp;
		}
		alert("您的浏览器不支持该功能，请更换！");
	}
function ajax(doMethod,url,callback,postParams){

	//创建ajax对象
	var xmlhttp = createXHR();
	//设置回掉函数
	xmlhttp.onreadystatechange = function(){
	    if(xmlhttp.readyState == 4){	       
	    	 if (xmlhttp.status == 200) {  
	    	      
	    	    callback(xmlhttp.responseText);
	    	    
	    	 }
	    };
	}
	//打开连接
	if(doMethod=="get"){
		xmlhttp.open("get", url, true);
		xmlhttp.send(null);
	}else if(doMethod == "post"){
		xmlhttp.open("post", url, true);
		xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		xmlhttp.send(postParams);//postParams--> "postParams="+postParams
	}
}


