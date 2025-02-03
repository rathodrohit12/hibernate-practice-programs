<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %> 

    <title>User Registration</title>
  <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e9ecef;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        form {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        label {
            color: red; /* Error message color */
            display: block;
            margin: 5px 0;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 10px;
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>  
</head>
<body>
    

    <form action="registerProcess.jsp" method="post">
    <input type="hidden" name="action" value="register">
    	<h1>User Register</h1>
        <label>${requestScope.nameError}</label>
        <input type="text" name="name" placeholder="name" value="${requestScope.name != null ? requestScope.name : ''}">

        <label>${requestScope.emailError}</label>
        <input type="text" name="email" placeholder="email" value="${requestScope.email != null ? requestScope.email : ''}">

        <label>${requestScope.mobileError}</label>
        <input type="text" name="mobile" placeholder="mobile" value="${requestScope.mobile != null ? requestScope.mobile : ''}">

        <label>${requestScope.passwordError}</label>
      <input type="password" name="pass" placeholder="password" value="${requestScope.pass != null ? requestScope.pass : ''}">
         <br><br>
        <input type="submit" value="Register">
        <a href="loginPage.jsp">Login</a>
    </form>
  
    
</body>
</html>
