<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: jj
  Date: 2021/1/4
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是A页</title>
</head>
<body>
a.jsp页面

<%!
    private Integer id;
    private String name;
    private static Map<String, Object> map;
%>
<%--    2.声明静态代码块--%>
<%!
    static {
        map = new HashMap<String, Object>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
    }
%>
<%--声明类方法--%>
<%!
    public int abc() {
        return 12;
    }
%>
<%--声明内部类--%>
<%!
    public static class A {
        private Integer id;
        private String abc = "abc";
    }
%>
<%=12%> <br/>
<%=12.12%> <br/>
<%="我是字符串"%> <br/>
<%=map%> <br/>
<%=request.getParameter("username")%>

</body>
</html>
