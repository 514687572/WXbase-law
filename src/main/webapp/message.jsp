<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="/include.jsp"%>
<head>
<meta charset="UTF-8">
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />
    <meta content="telephone=no, address=no" name="format-detection" />
    <link href="${ctx}/css/clear.css" rel="stylesheet">
    <link href="${ctx}/css/all.css" rel="stylesheet">
    <script src="${ctx}/js/rem.js"></script>
</head>
<body style="background-color: #fff;">
<div id="page">
<!--     <div id="c-head">
        <header id="head">
            <div class="head-back"><i></i></div>
            <div class="head-title">纪念日助手</div>
            <div class="head-icon"></div>
        </header>
    </div> -->
    <div id="c-con">
        <div class="c-wraps clearfloat">
        	<img src="${ctx}/images/message.jpg" alt="" style="width:100%;"  >
        </div>
        <div class="c-wraps c-msg clearfloat">
			<div class="c-mtop">留言板</div>
	       	<c:if test="${requestScope.messageList!=null && requestScope.messageList!=''}" var="condition" scope="request">
				<c:forEach var="adList" items="${requestScope.messageList}" varStatus="list">
			 		<div class="c-text" >
			            <div class="c-wrap">
			            	<span class="c-name"><img src="${adList.headimgurl}" alt="" style="width:20%;"  >&nbsp;${adList.msgContent}</span>
			            </div>
			            <p class="c-yytime">${adList.remark1}</p>
			        </div>
				</c:forEach>
			</c:if>
			<c:if test="${requestScope.messageList==null || requestScope.messageList==''}" var="condition" scope="request">
		       	<c:if test="${sessionScope.messageList!=null && sessionScope.messageList!=''}" var="condition" scope="request">
					<c:forEach var="adList" items="${sessionScope.messageList}" varStatus="list">
				 		<div class="c-text" >
				            <div class="c-wrap">
				            	<span class="c-name"><img src="${adList.headimgurl}" alt="" style="width:20%;"  >&nbsp;${adList.msgContent}</span>
				            </div>
				            <p class="c-yytime">${adList.remark1}</p>
				        </div>
					</c:forEach>
				</c:if>
			</c:if>
		<c:if test="${(requestScope.messageList==null || requestScope.messageList=='')&&(sessionScope.messageList==null || sessionScope.messageList=='')}" var="condition" scope="request">
			<div class="c-text">
	            <div class="c-wrap">
	                <span class="c-name">还没有留言赶紧留下脚印</span>
	                <span class="c-times"></span>
	            </div>
	        </div>
		</c:if>
        </div>
        <div class="c-texts clearfloat"  >
            <div class="c-wrap">
                <input class="thingname" id="thingname" type="text" placeholder="请留下宝贵意见" maxlength="100" style="width:80%;">
                <button style="background-color: #bcbcbc;border-radius: .05rem;" onclick="saveMessage();">留言</button>
            </div>
            <p class="c-yytime" id="alertt" style="color:#F00"></p>
        </div>
    </div>
</div>
<script>
	document.title="纪念日助手";
	
	function saveMessage(){
		var thingname = $("#thingname");
		
		if(thingname.val()==""){
			document.getElementsByTagName('input')[0].style.border = '1px solid red';
		}else{
			document.getElementsByTagName('input')[0].style.border = '2px solid #009F00';
		    $.ajax({     
		        type:"POST",     
		        url:ctx+"/saveMessage",
				dataType : "json",
				data:{
					"message":$("#thingname").val()
					},
				success : function(data) {
					if(data.success=='badWords'){
						$("#alertt").html("非法字符");
					}else{
						$("#alertt").html("");
						$("#thingname").val('');
						$.ajax({     
					        type:"POST",     
					        url:ctx+"/getMessageList",
							dataType : "json",
							data:{ },
							success : function(data) {
								window.location.href=ctx+'/message.jsp'; 
							}
						});
					}
				}
			});
		}
		
	}
</script>
</body>
</html>