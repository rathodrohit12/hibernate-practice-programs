<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="ubean" class="com.rohit.bean.UserBean" scope="page"/>
<jsp:setProperty property="*" name="ubean"/>
<jsp:useBean id="udao" class="com.rohit.dao.UserDaoImpl" scope="page"/>

<%
try {
    udao.registerUser(ubean);
    out.println("Registration successful!");
} catch (Exception e) {
    out.println("Error during registration: " + e.getMessage());
    e.printStackTrace(); 
}
%>
<a href="registerPage.jsp">Go back to registration</a>

</body>
</html>