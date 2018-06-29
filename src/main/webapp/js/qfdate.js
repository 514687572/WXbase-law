var isLunar = false;
var yearList_lunar;
var year_slected,month_slected,day_slected;
var status=0;
var chinaYear_list;

$(function() {
    render()
});

function render(){
    new QfDatePicker().init();
    chinaYear_list=calendar.getChinaYearList();
};

function getSelecteDate(){
    return{
        year_slected,
        month_slected,
        day_slected,
        isLunar:isLunar
    }
};

function QfDatePicker() {
    var _this = this;
    var maxYear = 2100;
    var minYear =  1900;
    var curOpt = null;
    var rootDiv = null;
    var yearScroll, monthScroll, dayScroll;
    var okBtn, cancelBtn;
    var yearList = [],monthList = [],dayList = [];
    var selectedYear = 1990;

    this.init = function() {
        _this.initView();
        _this.initData();

        yearScroll.changeFunction = _this.updateDate;
        monthScroll.changeFunction = _this.updateDate;

        $('.qfdate').attr('readonly', 'readonly');
        $('.qfdate').attr('type', 'text');
        $('.qfdate').click(function() {
            curOpt = $(this);
            rootDiv.show();
            _this.resetData();

        });
        
        okBtn.click(function() {
            var selectedDate = _this.getDate()
            rootDiv.hide();
            $('.selected_date').val(selectedDate.date)
        });
        
        $('.regorianBtn').click(function(){
            isLunar = false;
            _this.initData();
            _this.resetData();
            $('.regorianBtn-selected').css({
                'display':'inline-block'
            });
            $('.lunarBtn-selected').css({
                'display':'none'
            });
        });
        
        $('.lunarBtn').click(function(){
            isLunar = true;
            _this.initData();
            _this.resetData();
            $('.lunarBtn-selected').css({
                'display':'inline-block',
                'margin-top': '2px'
            });
            $('.regorianBtn-selected').css({
                'display':'none'
            });
        });
    };

    this.getDate = function() {
      var yearKey = yearScroll.getValue();
        var monthKey = monthScroll.getValue();
        var dayKey = dayScroll.getValue();
        var yearVal = _this.getDateVal(yearKey);
        var monthVal = _this.getDateVal(monthKey);
        var dayVal = _this.getDateVal(dayKey);
        var date = yearVal + '-' + monthVal + '-' + dayVal;
        if(isLunar){
            year_slected = yearKey
            month_slected = monthKey
            day_slected = dayKey
        }else{
            year_slected = {
            key:yearKey,
            value:yearVal
            } 
            month_slected = {
                key:monthKey,
                value:monthVal
            } 
            day_slected = {
                key:dayKey,
                value:dayVal
            }
        }
        return {
            y:{yearKey,yearVal},
            m:{monthKey,monthVal},
            d:{dayKey,dayVal},
            date:date
        };
    };
    
    this.getDateVal = function(date){
        var _val;
        if(date.key){
            _val = date.value
        }else{
            _val = date
        }
        return _val
    };
    
    this.initData = function() {
        if(isLunar){
            yearList = calendar.getChinaYearList();
        }else{
           for (var i = minYear; i < maxYear + 1; i++){
             yearList[i - minYear] = i; 
           } 
        }
        monthList = _this.getMonthList(selectedYear);
        dayList = _this.getDayList(selectedYear,1);
        yearScroll.setData(yearList);
        monthScroll.setData(monthList);
        dayScroll.setData(dayList);
        status=1;
    };
    
    this.getMonthList = function(selectedYear){
        var monthList = []
        if(isLunar){
            monthList = calendar.toChinaMonthList(selectedYear)
        }else{
            for (var i = 0; i < 12; i++) {
                monthList[i] = i + 1;
            }; 
        }
        
        return monthList
    };
    
    // 获取日期
    this.getDayList = function(y,m){
        var _dayList = [],daycount;
        if(isLunar){
            if(y.key){
                _dayList = calendar.getChinaDateList(y.key,m.key)
                daycount = _dayList.length
            }else{
                _dayList = calendar.getChinaDateList(y,m)
                daycount = _dayList.length
            }        
        }else{
            daycount = new Date(y, m, 0).getDate(); 
            for(var i = 0; i < daycount; i++){
                _dayList[i] = i + 1; 
            }
        }
        
        return _dayList
    };
    
    // 设置初始位置
    this.resetData = function() {
        yearScroll.selectIndex(90);
        monthScroll.selectIndex(0);
        dayScroll.selectIndex(0);
        status=1;
    };

    this.updateDate = function() {
    	if(status==1){
    		status=0;
    		return;
    	}
        var y = yearScroll.getValue();
        var daycount,monthCount=12;
        var m = monthScroll.getValue();
        if(isLunar){
            var _daycount = calendar.getChinaDateList(y.key,m.key);
            var _monthCount= calendar.toChinaMonthList(y.key)
            daycount = _daycount.length
            monthCount = _monthCount.length
        }else{
            daycount = new Date(y, m, 0).getDate(); 
        }
        var curIndex = dayScroll.curIndex;
        if(monthCount != monthList.length){
            if(!isLunar){
                return
            }else{
                monthList = _this.getMonthList(y.key);
                setTimeout(()=>{
                    monthScroll.setData(monthList);
                    monthScroll.selectIndex(0); 
                },1000)
            }
        }
        if (daycount != dayList.length) {
            dayList = []
            dayList = _this.getDayList(y,m);
            setTimeout(()=>{
                dayScroll.setData(dayList);
                dayScroll.selectIndex(curIndex); 
            },1000)
          
        };
    };

    this.initView = function() {
        $('body').append(
            '<div class="qfDatepickerRoot">' +
            '<div class="calendar-top">'+
            '<div class="regorianBtn-selected" style="display:inline-block;margin-left:5%;margin-top:2px;"><span class="regorianBtn option selected">公历</span><span class="lunarBtn option">农历</span></div>'+
            '<div class="lunarBtn-selected" style="display:inline-block;margin-left:20px;"><span class="regorianBtn option">公历</span><span class="lunarBtn option selected">农历</span></div>'+
            '<div class="okBtn datepickerBtn">确定</div>' +
            '</div>'+
            '<br/>' +
            '<div class="yearScroll" ></div>' +
            '<div class="monthScroll" ></div>' +
            '<div class="dayScroll" ></div>' +
            '<div class="datepickerBtnDiv">' +
            '</div>' +
            '</div>'
        );

        rootDiv = $('.qfDatepickerRoot');
        cancelBtn = rootDiv.find('.cancelBtn');
        okBtn = rootDiv.find('.okBtn');

        yearScroll = new QfScroll($('.yearScroll'));
        monthScroll = new QfScroll($('.monthScroll'));
        dayScroll = new QfScroll($('.dayScroll'));

        $('.qfDatepickerRoot').css({
            "display": "none",
            "position": "fixed",
            "top": "20%",
            "width": "80%",
            "max-width": "600px",
            "left": "10%",
            "background": "#fcfcfc",
            "height": "auto",
            "text-align": "center",
            "box-shadow": "0px 0px 30px #999",
            "border-radius": "3px",
        });
        $('.option').css({
            'display': 'inline-block',
            'width': '60px',
            'height': '40px',
            'line-height':' 40px',
           'border':'1px solid #147ffa',
           ' text-align': 'center',
            'color':'#1b81be',
            'position':'relative'
        });
        $('.selected').css({
            'background': '#147ffa',
            'color':'#f5feff'
        });
        $('.lunarBtn-selected').css({
            'display':'none'
        });
        $('.calendar-top').css({
            'display':'flex',
            'justify-content':'space-between',
            'align-items':'center',
            'font-size':'15px'
        })
        rootDiv.find('.datepickerBtnDiv').css({
            "text-align": "right",
            "margin": "10px"
        });

        rootDiv.find('.datepickerBtn').css({
            "display": "inline-block",
            "text-align": "center",
            "margin-right": "5%",
            "color": "#0592ff"
        });

    };
};

function QfScroll(divOpt) {
    var _this = this;

    var dataPanel = null;
    var selectedBar = null;
    var dataBar = null;

    var touchEvents = null;
    var oneHeight = 0;
    var dataList = null;
    this.curIndex = 0;

    var mY = 0;
    var dY = 0;
    var isDown = false;

    this.getValue = function() {
        return dataList[_this.curIndex];
    };


    this.setData = function(data) {
        divOpt.empty();
        _this.initTouchEvents();
        _this.initView();
        _this.addEventListener();
        dataList = data;
        for (var i = 0; i < dataList.length; i++) {
            if(dataList[i].key){
                var ele = $('<div>')
                ele.html(dataList[i].value)
                ele.addClass('dataBar')
                ele.attr('_id',dataList[i].key)
                dataPanel.append(ele)
            }else{
               dataPanel.append("<div class='dataBar'>" + dataList[i] + '</div>'); 
            }
        };

        dataBar = divOpt.find('.dataBar');
        dataBar.height(divOpt.height() / 5);
        dataBar.css('line-height', divOpt.height() / 5 + 'px');
        _this.selectIndex(dataList.length - 1);
    };

    this.addEventListener = function() {
        dataPanel.bind(touchEvents.start, function(event) {
            event.preventDefault();
            mY = _this.getMousePos(event).y;
            dY = dataPanel.position().top;
            isDown = true;
        });
        dataPanel.bind(touchEvents.move, function(event) {
            event.preventDefault();
            var y = _this.getMousePos(event).y;
            if (isDown) {
                _this.setTop(y - mY + dY);
            };
        });
        dataPanel.bind(touchEvents.end, function(event) {
            event.preventDefault();
            isDown = false;
            _this.setRightTop();
        });
    };

    this.setRightTop = function() {
        var topValue = dataPanel.position().top;
        if (topValue >= 0) {
            if ((topValue % oneHeight) <= (oneHeight / 2)) {
                index = -parseInt(topValue / oneHeight) + 2;
            } else {
                index = -parseInt(topValue / oneHeight) + 1;
            };
            if (topValue >= oneHeight * 2) {
                index = 0;
            };
        } else {
            if ((-topValue % oneHeight) <= (oneHeight / 2)) {
                index = parseInt(-topValue / oneHeight) + 2;
            } else {
                index = parseInt(-topValue / oneHeight) + 3;
            };
            if (topValue <= -oneHeight * (dataList.length - 3)) {
                index = dataList.length - 1;
            };

        };
        _this.selectIndex(index);
    };


    this.changeFunction = function() {};

    this.selectIndex = function(index) {
        if(!dataList){
            return;
        }
        if (index >= dataList.length ) {
            _this.selectIndex(dataList.length - 1);
            return;
        };
        var val = oneHeight * 2 - index * oneHeight;
        _this.setTop(val);
        _this.curIndex = index;
        _this.changeFunction();
    };


    this.setTop = function(value) {
        dataPanel.css('top', value);
    };

    this.setWidth = function(value) {
        divOpt.css('width', value);
    };

    this.initView = function(event) {

        divOpt.addClass('qfScroll');
        divOpt.html(
            '<div class="dataPanel"></div>' +
            '<div class="selectedBar"></div>'
        );
        dataPanel = divOpt.find('.dataPanel');
        selectedBar = divOpt.find('.selectedBar');

        divOpt.css({
            "background": "#fcfcfc",
            "display": "inline-block",
            "min-width": "80px",
            "width":"30%",
            "height": "250px",
            "overflow": "hidden",
            "position": "relative",
            "z-index": "0",
            "background":"#eeeeee"
        });
        dataPanel.css({
            "text-align": "center",
            "position": "absolute",
            "width": "100%",
            "top": "0",
            "left": "0",
            "font-size": "15px",
            "color": "black",
            "z-index": "80"
        });

        selectedBar.css({
            "position": "absolute",
            "top": "40%",
            "left": "0",
            "width": "100%",
            "height": "20%",
            "border-top": "1px solid rgba(5, 146, 255, 0.2)",
            "border-bottom": "1px solid rgba(5, 146, 255, 0.2)",
            "z-index": "50",
            "color":"black",
            "font-weight":"bold"
        });
        oneHeight = divOpt.height() / 5;
    };

    this.initTouchEvents = function(event) {
        if (_this.isPC()) {
            touchEvents = {
                start: "mousedown",
                move: "mousemove",
                end: "mouseup",
                leave: "mouseleave"
            }
        } else {
            touchEvents = {
                start: "touchstart",
                move: "touchmove",
                end: "touchend",
                leave: "mouseleave"
            };
        }
    };


    this.isPC = function(event) {
        var userAgentInfo = navigator.userAgent;
        var Agents = new Array("Android", "iPhone", "SymbianOS", "Windows Phone", "iPad", "iPod");
        var flag = true;
        for (var v = 0; v < Agents.length; v++) {
            if (userAgentInfo.indexOf(Agents[v]) > 0) {
                flag = false;
                break;
            }
        }
        return flag;
    };

    this.getMousePos = function(event) {
        var e = event || window.event;
        var scrollX = document.documentElement.scrollLeft || document.body.scrollLeft;
        var scrollY = document.documentElement.scrollTop || document.body.scrollTop;
        var x = e.originalEvent.targetTouches[0].pageX || e.clientX + scrollX;
        var y = e.originalEvent.targetTouches[0].pageY || e.clientY + scrollY;
        return {
            'x': x,
            'y': y
        };
    };
};
