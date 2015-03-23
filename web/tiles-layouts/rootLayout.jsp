<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<html:html>
    <tiles:insert attribute="head"/>
<body>
    <tiles:insert attribute="header"/>
    <tiles:insert attribute="panelBody"/>
    <tiles:insert attribute="footer"/>
</body>
</html:html>
