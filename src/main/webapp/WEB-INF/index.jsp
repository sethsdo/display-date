

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
    <h4><a href="Date">Date Template</a></h4>
    <h4><a href="Time">Time Template</a></h4>
    <p>The time is: <%= new Date() %></p>
</body>
</html>