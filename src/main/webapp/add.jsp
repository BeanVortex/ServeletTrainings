<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: darkdeveloper
  Date: 10/31/21
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%

            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int sum = num1 + num2;
            out.println(sum);
        %>
    </body>
</html>
