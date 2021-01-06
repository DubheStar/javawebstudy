<%--
  Created by IntelliJ IDEA.
  User: jj
  Date: 2021/1/4
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scope2</title>
</head>
<body>
<h1>scope2.jsp页面</h1>
pageContext域是否有值（“key”）：<%=pageContext.getAttribute("key")%><br/>
request域是否有值（"key"）:<%=request.getAttribute("key")%><br/>
seesion域是否有值（“key”）:<%=session.getAttribute("key")%><br/>
application域有否有值（“key”）：<%=application.getAttribute("key")%><br/>
</body>
</html>
