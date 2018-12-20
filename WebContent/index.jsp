<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Arithmetic Demo</title>
</head>
<body>

<%
	String numA = request.getParameter("numa");
	String numB = request.getParameter("numb");
	String eval = request.getParameter("matheval");
	int add = Integer.valueOf(numA) + Integer.valueOf(numB);
	int sub = Integer.valueOf(numA) - Integer.valueOf(numB);
	int mul = Integer.valueOf(numA) * Integer.valueOf(numB);
	int div = Integer.valueOf(numA) / Integer.valueOf(numB);
	
	if(eval.equals("add")) 
		out.println("<h1>Add: " + add + "</h1>"
				  + "<br />"
				  + "<input type=\"button\" value=\"回首頁\" onclick=\"javascript:location.href='index.html'\" ");
	
	if(eval.equals("subtract")) 
		out.println("<h1>Subtract: " + sub + "</h1>"
				  + "<br />"
				  + "<input type=\"button\" value=\"回首頁\" onclick=\"javascript:location.href='index.html'\" ");
	
	if(eval.equals("multiply"))
		out.println("<h1>Multiply: " + mul + "</h1>"
				  + "<br />"
				  + "<input type=\"button\" value=\"回首頁\" onclick=\"javascript:location.href='index.html'\" ");
	
	if(eval.equals("divide"))
		out.println("<h1>Divide: " + div + "</h1>"
				  + "<br />"
				  + "<input type=\"button\" value=\"回首頁\" onclick=\"javascript:location.href='index.html'\" ");
%>

</body>
</html>