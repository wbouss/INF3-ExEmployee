package org.apache.jsp.tiles_002dlayouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rootLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_attribute_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_insert_attribute_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_tiles_insert_attribute_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_html_html_0(_jspx_page_context))
        return;
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_html_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_html_html_0.setPageContext(_jspx_page_context);
    _jspx_th_html_html_0.setParent(null);
    int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
    if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_tiles_insert_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<body>\n");
        out.write("\n");
        out.write("<table width=\"750\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n");
        out.write("<tr>\n");
        out.write("  <td>\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("<!-- Begin topBanner -->\n");
        out.write("    ");
        if (_jspx_meth_tiles_insert_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<!-- End topBanner -->\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("  </td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("  <td>\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("<!-- Begin topMenu -->\n");
        out.write("    ");
        if (_jspx_meth_tiles_insert_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<!-- End topMenu -->\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("  </td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("  <td>\n");
        out.write("    <br>\n");
        out.write("    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n");
        out.write("    <tr valign=\"top\">\n");
        out.write("      <td width=\"35%\">\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("<!-- Begin panel1 -->\n");
        out.write("        ");
        if (_jspx_meth_tiles_insert_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<!-- End panel1 -->\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("        <br>\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("<!-- Begin panel2 -->\n");
        out.write("        ");
        if (_jspx_meth_tiles_insert_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<!-- End panel2 -->\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("      </td>\n");
        out.write("      <td width=\"2%\">&nbsp;</td>\n");
        out.write("      <td width=\"63%\">\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("<!-- Begin panel3 -->\n");
        out.write("        ");
        if (_jspx_meth_tiles_insert_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<!-- End panel3 -->\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("      </td>\n");
        out.write("    </tr>\n");
        out.write("    </table>\n");
        out.write("    <br>\n");
        out.write("  </td>\n");
        out.write("</tr>\n");
        out.write("<tr>\n");
        out.write("  <td>\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("<!-- Begin footer -->\n");
        out.write("    ");
        if (_jspx_meth_tiles_insert_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<!-- End footer -->\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("  </td>\n");
        out.write("</tr>\n");
        out.write("</table>\n");
        out.write("\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("<!-- Begin footerDebug -->\n");
        if (_jspx_meth_tiles_insert_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<!-- End footerDebug -->\n");
        out.write("<!-- ============================================================ -->\n");
        out.write("\n");
        out.write("</body>\n");
        int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      return true;
    }
    _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_insert_0 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_insert_0.setAttribute("head");
    int _jspx_eval_tiles_insert_0 = _jspx_th_tiles_insert_0.doStartTag();
    if (_jspx_th_tiles_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_0);
      return true;
    }
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_0);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_insert_1 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_insert_1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_insert_1.setAttribute("topBanner");
    int _jspx_eval_tiles_insert_1 = _jspx_th_tiles_insert_1.doStartTag();
    if (_jspx_th_tiles_insert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_1);
      return true;
    }
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_1);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_insert_2 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_insert_2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_insert_2.setAttribute("topMenu");
    int _jspx_eval_tiles_insert_2 = _jspx_th_tiles_insert_2.doStartTag();
    if (_jspx_th_tiles_insert_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_2);
      return true;
    }
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_2);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_insert_3 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_insert_3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_insert_3.setAttribute("panel1");
    int _jspx_eval_tiles_insert_3 = _jspx_th_tiles_insert_3.doStartTag();
    if (_jspx_th_tiles_insert_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_3);
      return true;
    }
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_3);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_insert_4 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_insert_4.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_insert_4.setAttribute("panel2");
    int _jspx_eval_tiles_insert_4 = _jspx_th_tiles_insert_4.doStartTag();
    if (_jspx_th_tiles_insert_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_4);
      return true;
    }
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_4);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_insert_5 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_insert_5.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_insert_5.setAttribute("panel3");
    int _jspx_eval_tiles_insert_5 = _jspx_th_tiles_insert_5.doStartTag();
    if (_jspx_th_tiles_insert_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_5);
      return true;
    }
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_5);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_insert_6 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_insert_6.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_insert_6.setAttribute("footer");
    int _jspx_eval_tiles_insert_6 = _jspx_th_tiles_insert_6.doStartTag();
    if (_jspx_th_tiles_insert_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_6);
      return true;
    }
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_6);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_insert_7 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_insert_7.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_insert_7.setAttribute("footerDebug");
    int _jspx_eval_tiles_insert_7 = _jspx_th_tiles_insert_7.doStartTag();
    if (_jspx_th_tiles_insert_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_7);
      return true;
    }
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_7);
    return false;
  }
}
