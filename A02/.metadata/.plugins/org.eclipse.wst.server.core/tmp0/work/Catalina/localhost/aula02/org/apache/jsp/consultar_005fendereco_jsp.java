/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2023-08-08 23:47:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class consultar_005fendereco_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script type = \"text/javascript\">\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#txtCep\").blur(function(){\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar url = \"https://viacep.com.br/ws/\" + $(\"#txtCep\").val() + \"/json/\"; \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$.get( url, function( response ){\n");
      out.write("\t\t\t\t//alert( response.cep);\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t$(\"#txtCep\").val(response.cep);\n");
      out.write("\t\t\t\t\t$(\"#txtLogradouro\").val(response.logradouro);\n");
      out.write("\t\t\t\t\t$(\"#txtComplemento\").val(response.complemento);\n");
      out.write("\t\t\t\t\t$(\"#txtBairro\").val(response.bairro);\n");
      out.write("\t\t\t\t\t$(\"#txtCidade\").val(response.cidade);\n");
      out.write("\t\t\t\t\t$(\"#txtUf\").val(response.uf);\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t}, \"json\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class = \"container-fluid bg-warning py-2 text-center text-muted shadow\">\n");
      out.write("\t\t\n");
      out.write("\t\t<h1>a</h1>\n");
      out.write("\t\t<p>a</p>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class = \"container w-75 pt-5\">\n");
      out.write("\t\n");
      out.write("\t\t<form id=\"frmEndereco\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class = \"my-3\">\n");
      out.write("\t\t      <label for = \"txtCep\" class = \"form-label\"> Cep </label> \n");
      out.write("\t\t      <input class = \"form-control\" type = \"text\" name = \"txtCep\" id = \"txtCep\"> <br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class = \"my-3\">\n");
      out.write("\t\t      <label for = \"txtLogradouro\" class = \"form-label\"> Logradouro </label> \n");
      out.write("\t\t      <input class = \"form-control\" type = \"text\" name = \"txtLogradouro\" id = \"txtLogradouro\"> <br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t      \n");
      out.write("\t      \t<div class = \"my-3\">\n");
      out.write("\t\t      <label for = \"txtComplemento\" class = \"form-label\"> Complemento </label> \n");
      out.write("\t\t      <input  class = \"form-control\" type = \"text\" name = \"txtComplemento\" id = \"txtComplemento\"> <br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t      \t<div class = \"my-3\">\n");
      out.write("\t\t      <label for = \"txtBairro\" class = \"form-label\"> Bairro </label> \n");
      out.write("\t\t      <input  class = \"form-control\" type = \"text\" name = \"txtBairro\" id = \"txtBairro\"> <br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t      \n");
      out.write("\t\t\t<div class = \"my-3\">\n");
      out.write("\t\t      <label for = \"txtCidade\" class = \"form-label\"> Cidade </label> \n");
      out.write("\t\t      <input  class = \"form-control\" type = \"text\" name = \"txtCidade\" id = \"txtCidade\"> <br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t      \n");
      out.write("\t\t\t<div class = \"my-3\">\n");
      out.write("\t\t      <label for = \"txtUf\" class = \"form-label\"> UF </label> \n");
      out.write("\t\t      <input  class = \"form-control\" type = \"text\" name = \"txtUf\" id = \"txtUf\"> <br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t</div>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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