/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M22
 * Generated at: 2017-11-30 09:37:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class data_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>数据分析</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nav.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/userGroup.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/data.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-theme.css\">\r\n");
      out.write("    <link href=\"assets/img/favicon-20170803111016817.ico\" rel=\"SHORTCUT ICON\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"assets/js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"assets/js/js/laydate.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"assets/js/echarts.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav id=\"menu\" class=\"navbar\">\r\n");
      out.write("        <ul id=\"nav-list\">\r\n");
      out.write("          <li class=\"li-1\"><a href=\"home\">主页</a></li>\r\n");
      out.write("          <li class=\"li-2\"><a href=\"finacialCreate\">收支创建</a></li>\r\n");
      out.write("          <li class=\"li-3\"><a href=\"expandShow\">我的收支</a></li>\r\n");
      out.write("          <li class=\"li-4\"><a href=\"data\">数据分析</a></li>\r\n");
      out.write("          <li class=\"li-5\"><a href=\"plan\">我的计划</a></li>\r\n");
      out.write("          <li class=\"li-6\"><a href=\"userGroup\">我的家庭组</a></li>\r\n");
      out.write("          <div class=\"current\">\r\n");
      out.write("              <div class=\"top-arrow\"></div>   \r\n");
      out.write("              <div class=\"current-back\"></div>\r\n");
      out.write("              <div class=\"bottom-arrow\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div id=\"nav-right\">\r\n");
      out.write("\t\t   <a href=\"userSetting\" id=\"user\">\r\n");
      out.write("\t\t   \t\t<span id=\"pic\" style=\"background-image: url(assets/img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userPic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")\"></span>\r\n");
      out.write("\t\t   \t\t<span id=\"name\">\r\n");
      out.write("\t\t   \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userNickname.length() > 4 ? user.userNickname.substring(0,4).concat(\"...\"): user.userNickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("\t\t   \t\t</span>\r\n");
      out.write("\t\t   \t</a>\t\r\n");
      out.write("  \t       <a class=\"fa fa-sign-out\" id=\"log-out\" aria-hidden=\"true\" href=\"logout\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<form action=\"\" id=\"Date\" method=\"get\" style=\"margin-top: 40px;\">\r\n");
      out.write("\t\t\t<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"register-table\">\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t    <td height=\"40\" align=\"right\" style=\"color:#fff\">开始时间：</td>\r\n");
      out.write("\t\t\t    <td height=\"40\" align=\"left\" id = \"in-1\" ><input type=\"text\" name=\"te\" id=\"from\" class=\"test-style width150\" /></td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t    <td height=\"40\" align=\"right\" style=\"color:#fff\">截止时间：</td>\r\n");
      out.write("\t\t\t    <td height=\"40\" align=\"left\" id = \"in-2\"><input type=\"text\" name=\"tex\" id=\"to\" class=\"test-style width150\" /></td>\r\n");
      out.write("\t\t\t    <td><button  class=\"btn btn-default\" type=\"button\" form = \"Date\" onclick=\"data_bt()\" style=\"margin-left: 60px\">查询</button></td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>  \r\n");
      out.write("    <div id=\"main\" style=\"width: 600px;height:400px; margin: 20px 0 0 400px;border:1px solid #8e8e8e \"></div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t  !function(){\r\n");
      out.write("\t  \t\tlaydate.skin('molv');//切换皮肤，请查看skins下面皮肤库\r\n");
      out.write("\t  \t\tlaydate({elem: '#from', max: laydate.now(0)});//绑定元素\r\n");
      out.write("\t  \t}();\r\n");
      out.write("\t  \t!function(){\r\n");
      out.write("\t  \t\tlaydate.skin('molv');//切换皮肤，请查看skins下面皮肤库\r\n");
      out.write("\t  \t\tlaydate({elem: '#to', max: laydate.now(0)});//绑定元素\r\n");
      out.write("\t  \t}();\r\n");
      out.write(" \r\n");
      out.write("\t  function data_bt(){\r\n");
      out.write("\t\t    // 基于准备好的dom，初始化echarts实例\r\n");
      out.write("\t        var myChart = echarts.init(document.getElementById('main'));  \r\n");
      out.write("\t\t    \r\n");
      out.write("\t        var option = {\r\n");
      out.write("\t\t\t    title : {\r\n");
      out.write("\t\t\t        text: '消费情况',\r\n");
      out.write("\t\t\t        subtext: '数据分析',\r\n");
      out.write("\t\t\t        x:'center'\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    tooltip : {\r\n");
      out.write("\t\t\t        trigger: 'item',\r\n");
      out.write("\t\t\t        formatter: \"{a} <br/>{b} : {c} ({d}%)\"\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    legend: {\r\n");
      out.write("\t\t\t        orient: 'vertical',\r\n");
      out.write("\t\t\t        left: 'left'\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    series : [\r\n");
      out.write("\t\t\t        {\r\n");
      out.write("\t\t\t            name: '支出细节',\r\n");
      out.write("\t\t\t            type: 'pie',\r\n");
      out.write("\t\t\t            radius : '40%',\r\n");
      out.write("\t\t\t            center: ['50%', '50%'],\r\n");
      out.write("\t\t\t            itemStyle: {\r\n");
      out.write("\t\t\t                emphasis: {\r\n");
      out.write("\t\t\t                    shadowBlur: 10,\r\n");
      out.write("\t\t\t                    shadowOffsetX: 0,\r\n");
      out.write("\t\t\t                    shadowColor: 'rgba(0, 0, 0, 0.5)'\r\n");
      out.write("\t\t\t                }\r\n");
      out.write("\t\t\t            }\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    ]\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t        \r\n");
      out.write("\t        $.get('SelectMoney',{HeadTime:$('#in-1 > input').val(),TailTime:$('#in-2 > input').val()},function(data){\r\n");
      out.write("\t        \tif(data.logName != null){\r\n");
      out.write("\t        \t\toption.legend.data = data.logName;\r\n");
      out.write("\t        \t\toption.series[0].data = \r\n");
      out.write("\t\t\t\t\t        \t\t\t function(){\r\n");
      out.write("\t\t\t\t\t\t\t            \tvar res = [];\r\n");
      out.write("\t\t\t\t\t\t\t            \tvar len = data.logName.length;\r\n");
      out.write("\t\t\t\t\t\t\t            \t while (len--) { \r\n");
      out.write("\t\t\t\t\t\t\t            \t\t if(data.money[len] == 0) continue;\r\n");
      out.write("\t\t\t\t\t\t            \t\t\t res.push({  \r\n");
      out.write("\t\t\t\t\t                                 value: data.money[len],\r\n");
      out.write("\t\t\t\t\t                                 name: data.logName[len],\r\n");
      out.write("\t\t\t\t\t                             });\r\n");
      out.write("\t\t\t\t\t                        };\r\n");
      out.write("\t\t\t\t\t                        return res;\r\n");
      out.write("\t\t\t\t\t\t\t            }();\r\n");
      out.write("\t        \t\tmyChart.setOption(option);\r\n");
      out.write("\t        \t}\r\n");
      out.write("\t        \telse if(data.logName == null){\r\n");
      out.write("\t        \t\talert('这段时间无任何消费！');\r\n");
      out.write("\t        \t}\r\n");
      out.write("\t        },'json');\r\n");
      out.write("\t    } \r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}