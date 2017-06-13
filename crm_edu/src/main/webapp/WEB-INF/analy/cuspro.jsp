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
	<div id="main1" style="width: 600px; height: 400px;"></div>
	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('main'));
		var myChart1 = echarts.init(document.getElementById('main1'));

		myChart.showLoading();
		$.ajax({
			type : "post",
			url : "getanalycus.do",
			dataType : "json",
			success : function(data) {
				myChart.hideLoading();
				myChart.setOption({
					title : {
						text : '各等级客户数量'
					},
					tooltip : {},
					toolbox : {
						show:true,
						 feature: {
					            dataZoom: {
					                yAxisIndex: 'none'
					            },
					            dataView: {readOnly: false},
					            magicType: {type: ['line', 'bar']},
					            restore: {},
					            saveAsImage: {}
					        }
					},
					legend : {
						data : [ '数量' ]
					},
					xAxis : {
						data : data.xAxisDate,
						name : "级别"
					},
					yAxis : {
						name : "数量"
					},
					series : [ {
						// 根据名字对应到相应的系列
						name : '级别:数量',
						type : 'bar',
						data : data.seriesDate
					} ]
				});
			},
		});
	</script>
</body>
</html>