/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-03 01:19:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.analy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cuspro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<title>??</title>\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"components/echarts/echarts.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/components/jquery-ui/jquery-1.2.6.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 为ECharts准备一个具备大小（宽高）的Dom -->\r\n");
      out.write("\t<div id=\"main\" style=\"width: 600px; height: 400px;\"></div>\r\n");
      out.write("\t<div id=\"main1\" style=\"width: 600px; height: 400px;\"></div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t// 基于准备好的dom，初始化echarts实例\r\n");
      out.write("\t\tvar myChart = echarts.init(document.getElementById('main'));\r\n");
      out.write("\t\tvar myChart1 = echarts.init(document.getElementById('main1'));\r\n");
      out.write("\r\n");
      out.write("\t\tmyChart.showLoading();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\turl : \"getanalycus.do\",\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tmyChart.hideLoading();\r\n");
      out.write("\t\t\t\tmyChart.setOption({\r\n");
      out.write("\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\ttext : '各等级客户数量'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\ttooltip : {},\r\n");
      out.write("\t\t\t\t\ttoolbox : {\r\n");
      out.write("\t\t\t\t\t\tshow:true,\r\n");
      out.write("\t\t\t\t\t\t feature: {\r\n");
      out.write("\t\t\t\t\t            dataZoom: {\r\n");
      out.write("\t\t\t\t\t                yAxisIndex: 'none'\r\n");
      out.write("\t\t\t\t\t            },\r\n");
      out.write("\t\t\t\t\t            dataView: {readOnly: false},\r\n");
      out.write("\t\t\t\t\t            magicType: {type: ['line', 'bar']},\r\n");
      out.write("\t\t\t\t\t            restore: {},\r\n");
      out.write("\t\t\t\t\t            saveAsImage: {}\r\n");
      out.write("\t\t\t\t\t        }\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\t\tdata : [ '数量' ]\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\tdata : data.xAxisDate,\r\n");
      out.write("\t\t\t\t\t\tname : \"级别\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tyAxis : {\r\n");
      out.write("\t\t\t\t\t\tname : \"数量\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\t\t\t// 根据名字对应到相应的系列\r\n");
      out.write("\t\t\t\t\t\tname : '级别:数量',\r\n");
      out.write("\t\t\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\t\t\tdata : data.seriesDate\r\n");
      out.write("\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
