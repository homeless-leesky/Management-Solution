/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-12-30 11:36:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modeler.Product;
import java.util.ArrayList;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("modeler.Product");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Admin page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/productList.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");

	  if(session.getAttribute("id")==null){
		  
      out.write("\n");
      out.write("\t\t    <script type=\"text/javascript\">\n");
      out.write("\t\t      if(!(alert(\"로그인을 먼저 해주세요!\"))){\n");
      out.write("\t\t         document.location = 'signIn.html';\n");
      out.write("\t\t      }\n");
      out.write("\t\t    </script>\n");
      out.write("\t\t  ");

	  }
	
      out.write('\n');
      out.write('	');
      modeler.ProductListModeler productList = null;
      productList = (modeler.ProductListModeler) _jspx_page_context.getAttribute("productList", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (productList == null){
        productList = new modeler.ProductListModeler();
        _jspx_page_context.setAttribute("productList", productList, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <header>\n");
      out.write("            <div class=\"product-logo\">\n");
      out.write("                <a href=\"index.html\"><img class=\"logo-S\" src=\"./img/logo.png\" alt=\"logo\"></a>\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"product-h1\">product list.</h1>\n");
      out.write("            <div  class=\"member-wrap\">\n");
      out.write("                <div>\n");
      out.write("                    <div>\n");
      out.write("                        <span class=\"input-label\">STORE</span>\n");
      out.write("                        <span class=\"manager-info\">");
      out.print( session.getAttribute("address"));
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <span class=\"input-label\">MANAGER</span>\n");
      out.write("                        <span class=\"manager-info\">");
      out.print( session.getAttribute("name") );
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"logOut.jsp\">\n");
      out.write("                    <button class=\"logout-button\">LOGOUT</button>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <article>\n");
      out.write("            <div class=\"search-wrap\">\n");
      out.write("                <form action=\"productList.jsp\" method=\"get\" autocomplete=\"off\">\n");
      out.write("                    <div>\n");
      out.write("                        <input  name=\"searchValue\" type=\"text\">\n");
      out.write("                        <button  class=\"search-button\" type=\"submit\">search</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"tbl-header\">\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>product name</th>\n");
      out.write("                                <th>price ($)</th>\n");
      out.write("                                <th>stock</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tbl-content\">\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                        <tbody>\n");
      out.write("                        ");

                        	ArrayList<Product> list;
                        	String searchValue = request.getParameter("searchValue");
                        	if((searchValue == null) || (searchValue.equals("ALL")) || searchValue.equals("all")){
                        		list = productList.getAllList();
                        	}
                        	else {
                        		list = productList.getFindList(searchValue);
                        	}
                        	int counter = list.size();
                        	if(counter > 0){
                        		for (Product p : list){
                        
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th>");
      out.print( p.getProductName() );
      out.write("</th>\n");
      out.write("                                <th>");
      out.print( p.getProductPrice() );
      out.write("</th>\n");
      out.write("                                <th>");
      out.print( p.getStockCount() );
      out.write("</th>\n");
      out.write("                            </tr>\n");
      out.write("\t\t\t\t\t\t                 \n");
      out.write("                        ");

                        		}
                        	}
                        
                        
                        
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div><span class=\"label\">go to</span><a href=\"./createProduct.jsp\">create product.</a></div>\n");
      out.write("                <div><span class=\"label\">go to</span><a href=\"./updateProduct.jsp\">update product.</a></div>\n");
      out.write("                <div><span class=\"label\">go to</span><a href=\"./deleteProduct.jsp\">delete product.</a></div>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("        <footer>\n");
      out.write("            <span>Copyright 2019 . Narciss . All rights reserved</span>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
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
