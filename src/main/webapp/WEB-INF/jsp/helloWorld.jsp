<%@ page import="com.wangjie.spring.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 26297
  Date: 2016/12/28
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="base" value="/"></c:url>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>55555</h1>
<h1>hello  hello    啊啊啊啊啊啊12321315558888</h1>
<c:out value="${myUser.getUsername()}"></c:out>
<c:out value="${user123.password}"></c:out>
<h1>${user123.password}</h1>
<%
    out.print(request.getAttribute("myUser"));
//    response.set
//    request.get
%>
</body>
</html>
