/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-26 07:10:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("    \r\n");

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
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("                        <tr><td height=\"31\"><div class=\"title\">欢迎界面</div></td></tr>\r\n");
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
      out.write("                        <!--**********这里是内容**********-->\r\n");
      out.write("                        <!--**********这里是内容**********-->\r\n");
      out.write("                        <!--**********这里是内容**********-->\r\n");
      out.write("                        <!--**********这里是内容**********-->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <!--左边内容-->\r\n");
      out.write("                            <td colspan=\"2\" valign=\"top\">\r\n");
      out.write("                                <h3 style=\"margin:0 0 10px 10px;\">感谢您使用华科客户管理系统</h3>\r\n");
      out.write("                                <img src=\"");
      out.print(path );
      out.write("/Images/ts.gif\" width=\"16\" height=\"16\" style=\"margin-left:10px;\"> 提示：<br />\r\n");
      out.write("                                <p style=\"text-indent:20px;line-height:25px;margin-left:10px;font-size:15px;\">你现在使用的是华科毕设,客户关系管理系统<span> <a target=\"_blank\" href=\"http://wpa.qq.com/msgrd?v=3&uin=609307843&site=qq&menu=yes\" onfocus=\"this.blur()\"><img style=\"vertical-align:middle;\"border=\"0\" src=\"http://wpa.qq.com/pa?p=2:609307843:41\" alt=\"瑞曼为您服务\" title=\"瑞曼科技\"></a> </span>在线客服进行咨询！<br />&nbsp;&nbsp;&nbsp;&nbsp;此程序是您建立地区级商家信息门户的首选方案！</p>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <!--间隔-->\r\n");
      out.write("                            <td width=\"7%\">&nbsp;</td>\r\n");
      out.write("                            <!--右边内容-->\r\n");
      out.write("                            <td width=\"40%\" valign=\"top\">\r\n");
      out.write("                                <table width=\"100%\" height=\"150\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border: 1px solid #CCCCCC;\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td width=\"7%\" height=\"27\" background=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\">\r\n");
      out.write("                                            <img src=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\" width=\"2\" height=\"27\">\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td width=\"93%\" background=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\" class=\"left_bt\">最新动态</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr><td height=\"5\" colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td height=\"100\" valign=\"top\" colspan=\"2\" id=\"news\">\r\n");
      out.write("                                            <marquee direction=\"up\" scrollamount=\"2\" vspace=\"30px\" width=\"400px\" height=\"100px\" onmouseout=\"this.start()\" onmouseover=\"this.stop()\">\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li>客户关系管理系统！</li>\r\n");
      out.write("                                                    <li>专业管理企业网站！</li>\r\n");
      out.write("                                                    <li>华科网站管理系统！</li>\r\n");
      out.write("                                                    <li>专业客户管理网站！</li>\r\n");
      out.write("                                                    <li>华科信管毕设系统！</li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </marquee>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr><td height=\"5\" colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr height=\"20\"><td colspan=\"2\" valign=\"top\">&nbsp;</td><td>&nbsp;</td><td valign=\"top\">&nbsp;</td></tr>\r\n");
      out.write("                        <!--第二行-->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td colspan=\"2\" valign=\"top\">\r\n");
      out.write("                                <table width=\"100%\" height=\"230\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border: 1px solid #CCCCCC;\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td width=\"7%\" background=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\">\r\n");
      out.write("                                            <img src=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\" width=\"2\" height=\"27\">\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td width=\"93%\" background=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\" class=\"left_bt\">正开发任务</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td height=\"186\" valign=\"top\" colspan=\"2\">\r\n");
      out.write("                                        \t<table>\r\n");
      out.write("                                        \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        \t</table>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr><td height=\"5\" colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>&nbsp;</td>\r\n");
      out.write("                            <td valign=\"top\">\r\n");
      out.write("                                <table width=\"100%\" height=\"230\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border: 1px solid #CCCCCC;\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td width=\"7%\" background=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\">\r\n");
      out.write("                                            <img src=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\" width=\"2\" height=\"27\">\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td width=\"93%\" height=\"27\" background=\"");
      out.print(path );
      out.write("/Images/news_title_bg.gif\" class=\"left_bt\">待处理服务</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr><td height=\"186\" valign=\"top\">&nbsp;</td>\r\n");
      out.write("                                    <td height=\"102\" valign=\"top\">\r\n");
      out.write("                                    \t<table>\r\n");
      out.write("                                        \t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        \t</table>\r\n");
      out.write("                                    </td></tr>\r\n");
      out.write("                                    <tr><td height=\"5\" colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
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
      out.write("                                <img src=\"");
      out.print(path );
      out.write("/Images/icon_mail.gif\" width=\"16\" height=\"11\"> 作者邮箱：caojinlin563580@gmail.com<br />\r\n");
      out.write("                                <img src=\"");
      out.print(path );
      out.write("/Images/icon_phone.gif\" width=\"17\" height=\"14\">作者：<a href=\"http://h2design.taobao.com/\" target=\"_blank\">华科曹金霖</a>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/index/main.jsp(91,42) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("chance");
    // /WEB-INF/index/main.jsp(91,42) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/index/main.jsp(91,42) '${chances }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${chances }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        \t\t<tr>\r\n");
          out.write("                                        \t\t<td style=\"font-size: 20px\">项目名:</td>\r\n");
          out.write("                                        \t\t<td width=\"50\"></td>\r\n");
          out.write("                                        \t\t<td style=\"font-size: 20px\"><a href=\"toaddplan.do?chanceid=,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chance.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chance.pname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("                                        \t\t</tr>\r\n");
          out.write("                                        \t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/index/main.jsp(116,42) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("service");
    // /WEB-INF/index/main.jsp(116,42) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/index/main.jsp(116,42) '${services }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${services }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        \t\t<tr>\r\n");
          out.write("                                        \t\t<td style=\"font-size: 20px\">服务概要:</td>\r\n");
          out.write("                                        \t\t<td width=\"50\"></td>\r\n");
          out.write("                                        \t\t<td style=\"font-size: 20px\"><a href=\"dealservice.do?serviceid=,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${service.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${service.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("                                        \t\t</tr>\r\n");
          out.write("                                        \t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}