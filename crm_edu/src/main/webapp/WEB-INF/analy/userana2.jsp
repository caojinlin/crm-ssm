<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>??</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="components/echarts/echarts.js"></script>
<script src="<%=path%>/components/jquery-ui/jquery-1.2.6.js"
	type="text/javascript"></script>
</head>
<body>
	<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
	<div id="main" style="width: 600px; height: 400px;"></div>
	<div id="main1" style="width: 500px; height: 400px;"></div>
	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var myChart1 = echarts.init(document.getElementById('main1'));

		myChart1.showLoading();
		$.ajax({
			type : "post",
			url : "getuseranaservice.do",
			dataType : "json",
			success : function(data) {
				myChart1.hideLoading();
				myChart1.setOption({
					 title : {
					        text: '各人员处理的服务数',
					        x:'center'
					    },
					    tooltip : {
					        trigger: 'item',
					        formatter: "{a} <br/>{b} : {c} ({d}%)"
					    },
					    legend: {
					        x : 'center',
					        y : 'bottom',
					        data:['rose1','rose2','rose3','rose4','rose5','rose6','rose7','rose8']
					    },
					    toolbox: {
					        show : true,
					        feature : {
					            mark : {show: true},
					            dataView : {show: true, readOnly: false},
					            magicType : {
					                show: true,
					                type: ['pie', 'funnel']
					            },
					            restore : {show: true},
					            saveAsImage : {show: true}
					        }
					    },
					    calculable : true,
					    series : [
					        {
					            name:'服务数量',
					            type:'pie',
					            radius : [30, 110],
					            center : ['50%', '50%'],
					            roseType : 'area',
					            data:data
					        },
				    ]});
			}
		})
	</script>
</body>
</html>