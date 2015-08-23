<%@ page import="cn.net.vive.test.Person" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8"%>
<%@include file="base.jsp" %>

<%
    Person person = new Person("1", "wjh", 18);
    pageContext.setAttribute("person",person);

%>

<html>
<body>
<h2>Hello World!</h2><%--
<jsp:useBean id="person" beanName="Person"></jsp:useBean>
<jsp:getProperty name="person" property="name"></jsp:getProperty>
--%>

${person.name}
</body>
</html>
