/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-13 02:44:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adduser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path );
      out.write("/Style/skin.css\" />\r\n");
      out.write("    <script>\r\n");
      out.write("    \tvar msg = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("    \tif(msg!=\"\"){\r\n");
      out.write("    \t\talert(msg);\r\n");
      out.write("    \t}\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("            <!-- 头部开始 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"17\" valign=\"top\" background=\"");
      out.print(path );
      out.write("/Images/mail_left_bg.gif\">\r\n");
      out.write("                    <img src=\"");
      out.print(path );
      out.write("/Images/left_top_right.gif\" width=\"17\" height=\"29\" />\r\n");
      out.write("                </td>\r\n");
      out.write("                <td valign=\"top\" background=\"");
      out.print(path );
      out.write("/Images/content_bg.gif\">\r\n");
      out.write("                    <table width=\"100%\" height=\"31\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"./");
      out.print(path );
      out.write("/Images/content_bg.gif\">\r\n");
      out.write("                        <tr><td height=\"31\"><div class=\"title\">添加人员</div></td></tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"16\" valign=\"top\" background=\"");
      out.print(path );
      out.write("/Images/mail_right_bg.gif\"><img src=\"");
      out.print(path );
      out.write("/Images/nav_right_bg.gif\" width=\"16\" height=\"29\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!-- 中间部分开始 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <!--第一行左边框-->\r\n");
      out.write("                <td valign=\"middle\" background=\"");
      out.print(path );
      out.write("/Images/mail_left_bg.gif\">&nbsp;</td>\r\n");
      out.write("                <!--第一行中间内容-->\r\n");
      out.write("                <td valign=\"top\" bgcolor=\"#F7F8F9\">\r\n");
      out.write("                    <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                        <!-- 空白行-->\r\n");
      out.write("                        <tr><td colspan=\"2\" valign=\"top\">&nbsp;</td><td>&nbsp;</td><td valign=\"top\">&nbsp;</td></tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td colspan=\"4\">\r\n");
      out.write("                                <table>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td width=\"100\" align=\"center\"><img src=\"");
      out.print(path );
      out.write("/Images/mime.gif\" /></td>\r\n");
      out.write("                                        <td valign=\"bottom\"><h3 style=\"letter-spacing:1px;\">添加人员的基本信息！</h3></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- 一条线 -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td height=\"40\" colspan=\"4\">\r\n");
      out.write("                                <table width=\"100%\" height=\"1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("                                    <tr><td></td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- 添加栏目开始 -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                            <td width=\"96%\">\r\n");
      out.write("                                <table width=\"100%\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td colspan=\"2\">\r\n");
      out.write("                                            <form action=\"adduser.do\" method=\"post\">\r\n");
      out.write("                                                <table width=\"100%\" class=\"cont\">\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td width=\"10%\">账号：</td>\r\n");
      out.write("                                                        <td width=\"20%\"><input class=\"text\" type=\"text\" name=\"account\" value=\"\" /></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>用户名：</td>\r\n");
      out.write("                                                        <td><input class=\"text\" type=\"text\" name=\"name\" value=\"\" /></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                      <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>密码：</td>\r\n");
      out.write("                                                        <td><input class=\"text\" type=\"password\" name=\"pwd\" value=\"\" /></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>确认密码：</td>\r\n");
      out.write("                                                        <td><input class=\"text\" type=\"password\" name=\"pwd2\" value=\"\" /></td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                        <td>级别：</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                        \t<select name=\"root\">\r\n");
      out.write("                                                        \t\t<option value=\"0\">管理员</option>\r\n");
      out.write("                                                        \t\t<option value=\"1\">高管</option>\r\n");
      out.write("                                                        \t\t<option value=\"2\">产品经理</option>\r\n");
      out.write("                                                        \t\t<option value=\"3\">开发人员</option>\r\n");
      out.write("                                                        \t</select>\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                   <tr>\r\n");
      out.write("                                                   \t\t<td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                                                   \t\t<td>\r\n");
      out.write("                                                   \t\t\t<input type=\"submit\" value=\"提交\"/>\r\n");
      out.write("                                                   \t\t</td>\r\n");
      out.write("                                                   </tr>\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!-- 添加栏目结束 -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td height=\"40\" colspan=\"4\">\r\n");
      out.write("                                <table width=\"100%\" height=\"1\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("                                    <tr><td></td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("                            <td width=\"51%\" class=\"left_txt\">\r\n");
      out.write("                                 <img src=\"");
      out.print(path );
      out.write("/Images/icon_mail.gif\" width=\"16\" height=\"11\"> 作者邮箱：caojinlin563580@gmail.com<br />\r\n");
      out.write("                                <img src=\"");
      out.print(path );
      out.write("/Images/icon_phone.gif\" width=\"17\" height=\"14\"> 官方网站：<a href=\"http://h2design.taobao.com/\" target=\"_blank\">氢设计</a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>&nbsp;</td><td>&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td background=\"");
      out.print(path );
      out.write("/Images/mail_right_bg.gif\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!-- 底部部分 -->\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td valign=\"bottom\" background=\"");
      out.print(path );
      out.write("/Images/mail_left_bg.gif\">\r\n");
      out.write("                    <img src=\"");
      out.print(path );
      out.write("/Images/buttom_left.gif\" width=\"17\" height=\"17\" />\r\n");
      out.write("                </td>\r\n");
      out.write("                <td background=\"");
      out.print(path );
      out.write("/Images/buttom_bgs.gif\">\r\n");
      out.write("                    <img src=\"");
      out.print(path );
      out.write("/Images/buttom_bgs.gif\" width=\"17\" height=\"17\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td valign=\"bottom\" background=\"");
      out.print(path );
      out.write("/Images/mail_right_bg.gif\">\r\n");
      out.write("                    <img src=\"");
      out.print(path );
      out.write("/Images/buttom_right.gif\" width=\"16\" height=\"17\" />\r\n");
      out.write("                </td>           \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
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
