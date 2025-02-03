<%@page import="com.rohit.dao.UserDaoImpl"%>
<%@page import="com.rohit.bean.UserBean"%>
<%@page import="java.util.List"%>
<%@page import="com.rohit.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %> 
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<style>
        body {
            background-color: #f0f8ff; 
            font-family: Arial, sans-serif; 
            color: #333; 
        }
        h1 {
            color: #2e8b57;
            text-align: center;
            margin-top: 50px;
        }
        label {
            display: block;
            margin-left: 10px; 
        }
        table, th, td {    
            border: 1px solid black;  
            margin-left: auto;  
            margin-right: auto;  
            border-collapse: collapse;    
            width: 500px;  
            text-align: center;  
            font-size: 20px;  
        }
</style>

</head>
<body>
<%!UserDaoImpl userDao=new UserDaoImpl();
List<UserBean> userlist=userDao.getAllUsers(); %>

<label>Welcome: ${requestScope.name}</label>
<h1>List Of Users</h1>
<table class="center">
<tr>
<th>NAME</th>
<th>EMAIL</th>
<th>MOBILE</th>
<th>EDIT ACTION</th>
<th>DELETE ACTION</th>
</tr>

<% 
for(UserBean user : userlist) {
%>  
<%
session.setAttribute("id",user.getId());
%>  
<tr>
<td><%=user.getName() %></td>
<td><%=user.getEmail() %></td>
<td><%=user.getMobile() %></td>
<td><a href="editPage.jsp?id=<%=user.getId()%>">edit</a></td>
<td><a href="deletepage.jsp?id=<%=user.getId()%>">delete</a></td>
</tr>
<% 
}
%>
</table>

</body>
</html>
