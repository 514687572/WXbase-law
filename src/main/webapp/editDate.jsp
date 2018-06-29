<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="/include.jsp"%>
<head>
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />
    <meta content="telephone=no, address=no" name="format-detection" />
    <link href="${ctx}/css/clear.css" rel="stylesheet">
    <link href="${ctx}/css/all.css" rel="stylesheet">
    <link href="${ctx}/css/mobiscroll.2.13.2.css" rel="stylesheet">
    <link href="${ctx}/css/qfdate.css" rel="stylesheet">
    <link href="${ctx}/css/jquery-confirm.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${ctx}/css/gdate_0.1.2.css"/>
    <script src="${ctx}/js/rem.js"></script>
</head>
<body>
<div id="page">
<!--     <div id="c-head">
        <header id="head">
            <div class="head-back"><i></i></div>
            <div class="head-title">添加纪念日</div>
            <div class="head-iconmore"></div>
        </header>
    </div> -->
    <div id="c-con">

        <div class="c-texts clearfloat">
            <div class="c-wrap">
                <input class="thingname" id="thingname" type="text" placeholder="事件名称(最多100字)" maxlength="100">
            </div>
        </div>
        <div class="c-texts clearfloat">
            <div class="c-wrap">
                <div class="settings" style="display:none;">
                    <select name="demo" id="demo">
                    </select>
                </div>
<!--                 <div class="onoff clearfloat" id="onoffdate">
                    <span class="on" id="on">公历</span>
                    <span class="off" id="off">农历</span>
                    <div class="onround" id="onround"></div>
                </div> -->
               <div class="qfdate" id="qfdate">
			        <input type="text" class="selected_date" name="form_one" id="form_one" placeholder="事件时间" readonly >
			        <img src="${ctx}/images/ic_time.png" alt="">
			    </div>
            </div>
        </div>
        <div class="c-texts clearfloat typechoose" id="typechoose">
            <div class="c-wrap">
                <span class="leftname">重复</span>
                <div class="r-type clearfloat">
                    <span class="r-types" id="typerepeat">不重复</span>
                    <i class="r-typeicon"></i>
                </div>
            </div>
        </div>
        <div class="c-texts clearfloat" id="typechooses">
            <div class="c-wrap">
                <span class="leftname">提醒</span>
                <div class="r-type clearfloat">
                    <span class="r-types" id="typeremind">不提醒</span>
                    <i class="r-typeicon"></i>
                </div>
            </div>
        </div>
        <div class="c-texts clearfloat">
            <div class="c-wrap">
                <span class="leftname">特别关注</span>
                <div class="onoff clearfloat" id="onoffattention">
                    <span class="on" id="on1">是</span>
                    <span class="off" id="off1">否</span>
                    <div class="onround" id="onround1"></div>
                </div>
            </div>
            <p style="font-size: .1rem">开启后此事件显示在顶部</p>
        </div>
        <!-- <div id="ckeep">保存</div> -->
        <div id="alert" style="color:#F00"> </div>
        <button id="ckeep">保 存</button>
        <button id="delete">删 除</button>
    </div>
    <div id="Mb">
        <div id="type-wrap">
            <div class="type-list">不重复</div>
            <div class="type-list">每天</div>
            <div class="type-list">每周</div>
            <div class="type-list">每月</div>
            <div class="type-list">每年</div>
        </div>
    </div>
    <div id="remindMb">
        <div id="type-wrapRemind">
            <div class="type-list">不提醒</div>
            <div class="type-list">每天</div>
            <div class="type-list">事件当天</div>
            <div class="type-list">提前一天</div>
            <div class="type-list">提前2天</div>
        </div>
    </div>
</div>
<script src="${ctx}/js/mobiscroll.2.13.2.js"></script>
<script src="${ctx}/js/fastclick.js"></script>
<script src="${ctx}/js/jquery-confirm.min.js"></script>
<script src="${ctx}/js/calendar.js"></script>
<script src="${ctx}/js/qfdate.js"></script>
<script type="text/javascript">
    //选择类型
    var i = 0;
    var j = 0;
    var r=0;
    var typechoose = $("#typechoose");
    var typechooses = $("#typechooses");
    var ckeep = $("#ckeep");
    var Mb = $("#Mb");
    var remindMb = $("#remindMb");
    var typewrap = $("#type-wrap");
    var typewrapRemind = $("#type-wrapRemind");
    var thingname = $("#thingname");
    var alert = document.getElementById('alert');
    var test = document.getElementById('form_one');
    var isGC=0;
    var isAttention=0;
    var solarDate;
    var lunarDate;
    var dateId;
    var openId;
    
    $(function () {
        if(${sessionScope.date.gc}==true){
            isGC=1;
        }else{
            isGC=0;
        }
        
        if(${sessionScope.date.attentionDate}==1){
        	j=0;
            $("#off1").css("display","none");
            $("#on1").css("display","block");
            $("#onround1").css("left","calc(100% - .2rem)");
            $(this).css("background","#999");
            isAttention=1;
            j++;
        }else{
        	j=1;
            $("#off1").css("display","block");
            $("#on1").css("display","none");
            $("#onround1").css("left","0");
            $(this).css("background","#bbb");
            j--;
            isAttention=0;
        }
        
        $("#thingname").val("${sessionScope.date.dateTitle}");
        $("#typeremind").html("${sessionScope.date.repetRemind}");
        $("#typerepeat").html("${sessionScope.date.remindType}");
        if(${sessionScope.date.gc}==false){
        	$("#form_one").val("${sessionScope.date.lunarCh}");
            solarDate="${sessionScope.date.remark3}";
            lunarDate="${sessionScope.date.remarko}";
        }else{
        	$("#form_one").val("${sessionScope.date.remark3}");
        }
        dateId="${sessionScope.date.dateId}";
        openId="${sessionScope.date.openId}";

    });
    
    document.title="编辑纪念日";
    //点击选择重复类型（弹出框type-wrap中加载重复类型数据）
    typechoose.on("click", function(){
        r = 1;
        Mb.css("display","block");
    });
    //点击选择提醒类型（弹出框type-wrap中加载提醒类型数据）
    typechooses.on("click", function(){
        r = 2;
        remindMb.css("display","block");
    });
     typewrap.on("click",".type-list", function(){
         var text = $(this).html();
       	 Mb.css("display","none");
         $("#typerepeat").html(text);
     });
     
     typewrapRemind.on("click",".type-list", function(){
         var text = $(this).html();
       	 remindMb.css("display","none");
         $("#typeremind").html(text);
     });
     
     function isnull(val) {
         var str = val;
         if (str == '' || str == undefined || str == null) {
             return true;
         } else {
             return false;
         }
     }
     
     ckeep.on("click", function(){
    	 if($("#thingname").val()==""){
    		 alert.innerHTML="事件名称不能为空";
    		 document.getElementsByTagName('input')[0].style.border = '1px solid red';
    		 return;
    	 }else if($("#form_one").val()==""){
    		 alert.innerHTML="时间不能为空";
    		 document.getElementsByTagName('input')[1].style.border = '1px solid red';
    		 return;
    	 }else{
    		 document.getElementsByTagName('input')[0].style.border = '2px solid #009F00';
    		 document.getElementsByTagName('input')[1].style.border = '2px solid #009F00';
    		 alert.innerHTML="";
    		 getNewDate();
    	 }
    	 
	    $.ajax({     
	        type:"POST",     
	        url:ctx+"/saveDateDetils",
			dataType : "json",
			data:{
					"typerepeat":$("#typerepeat").html(),
					"typeremind":$("#typeremind").html(),
					"isGC":isGC,
					"isAttention":isAttention,
					"thingname":$("#thingname").val(),
					"datetime":$("#form_one").val(),
					"dateId":dateId,
					"openId":openId,
					"solarDate":solarDate,
					"lunarDate":lunarDate
					
				},
			success : function(data) {
				$("#typerepeat").html('');
				$("#typeremind").html('');
				isGC=0;
				isAttention=0;
				$("#thingname").val('');
				$("#form_one").val('');
				$.ajax({     
			        type:"POST",     
			        url:ctx+"/getDateList",
					dataType : "json",
					data:{ },
					success : function(data) {
						window.location.href=ctx+'/dateList.jsp'; 
					}
				});
				
			}
		});
    	 
     });
     
     
     $("#delete").on("click", function(){
    	 $.confirm({
			    title: '提示',
			    content: '确定要删除吗?',
			    width:"100px",
			    buttons: {
			        confirm:{
                     text: "确 定",
                     btnClass: 'btn-primary',
                     keys: ['enter'],
                     action: function(){
                    	 deleteDate();
                     }
                 },
			        cancel:{
                     text: "取 消",
                     btnClass: 'btn-primary',
                     keys: ['esc'],
                     action: function(){
                     }
                 } 
			    }
			});
     });
     
     function deleteDate(){
 	    $.ajax({     
	        type:"POST",     
	        url:ctx+"/deleteDate",
			dataType : "json",
			data:{
					"dateId":dateId
				},
			success : function(data) {
				$.ajax({     
			        type:"POST",     
			        url:ctx+"/getDateList",
					dataType : "json",
					data:{ },
					success : function(data) {
						window.location.href=ctx+'/dateList.jsp'; 
					}
				});
				
			}
		});
     }

    //是否特别关注（默认否）
    
    $("#onoffattention").on("click", function(){
        if(j==0){
            $("#off1").css("display","none");
            $("#on1").css("display","block");
            $("#onround1").css("left","calc(100% - .2rem)");
            $(this).css("background","#999");
            isAttention=1;
            j++;
        }else{
            $("#off1").css("display","block");
            $("#on1").css("display","none");
            $("#onround1").css("left","0");
            $(this).css("background","#bbb");
            j--;
            isAttention=0;
        }
    });
    
	function getNewDate() {
		var das = getSelecteDate();
		var yearString
		
		if(das.year_slected!=undefined){
			if (das.isLunar) {
				yearString = das.year_slected.value + "-" + das.month_slected.value + "-" + das.day_slected.value;
				var temM;
				if(das.month_slected.key>12){
					temM=das.month_slected.key%13;
					lunarDate = das.year_slected.key + "-" + temM + "-" + das.day_slected.key;
				}else{
					lunarDate = das.year_slected.key + "-" + das.month_slected.key + "-" + das.day_slected.key;
				}
				var a = lunarDate.split("-");
				var lunar = calendar.lunar2solar(parseInt(a[0]), parseInt(a[1]), parseInt(a[2]));
	
				if ($("#typerepeat").html() == '每年') {
					solarDate = getSolarDate(lunar.cYear + "-" + lunar.cMonth + "-" + lunar.cDay, lunarDate);
				} else {
					solarDate = lunar.cYear + "-" + lunar.cMonth + "-" + lunar.cDay;
				}
				isGC=0;
			} else {
				solarDate = das.year_slected.value + "-" + das.month_slected.value + "-" + das.day_slected.value;
				isGC=1;
			}
		}
	}
    
	function getSolarDate(str, ld) {
		var myDate = new Date();
		var gy = myDate.getFullYear(); //获取完整的年份(4位,1970-????)
		var gm = myDate.getMonth() + 1; //获取当前月份(0-11,0代表1月)
		var gd = myDate.getDate(); //获取当前日(1-31)

		var b = ld.split("-");
		var ss = calendar.lunar2solar(gy, parseInt(b[1]), parseInt(b[2]));
		str = ss.cYear + "-" + ss.cMonth + "-" + ss.cDay;
		console.log(str);
		var a = str.split("-");

		if (a[0] > gy) {
			return str;
		}
		if (parseInt(a[0]) < gy) {
			if (parseInt(a[1]) > gm) {
				return str;
			} else if (parseInt(a[1]) == gm) {
				if (parseInt(a[2]) > gd) {
					return str;
				} else if (parseInt(a[2]) == gd) {
					return str;
				} else {
					var lunar = calendar.lunar2solar(parseInt(gy) + 1, parseInt(b[1]), parseInt(b[2]));
					return lunar.cYear + "-" + lunar.cMonth + "-" + lunar.cDay;
				}

			} else {
				var lunar = calendar.lunar2solar(parseInt(gy), parseInt(b[1]), parseInt(b[2]));
				return lunar.cYear + "-" + lunar.cMonth + "-" + lunar.cDay;
			}
		} else if (parseInt(a[0]) == gy) {
			if (parseInt(a[1]) > gm) {
				return str;
			} else if (parseInt(a[1]) < gm) {
				var lunar = calendar.lunar2solar(parseInt(gy) + 1, parseInt(b[1]), parseInt(b[2]));
				return lunar.cYear + "-" + lunar.cMonth + "-" + lunar.cDay;
			} else if (parseInt(a[1]) == gm) {
				if (parseInt(a[2]) > gd) {
					return str;
				} else if (parseInt(a[2]) == gd) {
					return str;
				} else {
					var lunar = calendar.lunar2solar(parseInt(gy) + 1, parseInt(b[1]), parseInt(b[2]));
					return lunar.cYear + "-" + lunar.cMonth + "-" + lunar.cDay;
				}
			}
		}
	}
</script>
</body>
</html>