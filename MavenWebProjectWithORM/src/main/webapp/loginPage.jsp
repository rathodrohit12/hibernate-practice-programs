<!DOCTYPE html>
<html lang="en">
<head>
<%@ page isELIgnored="false" %> 
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Login</title>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        label {
            color: red; /* Error message color */
            display: block;
            margin-bottom: 5px;
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
            background-color: #5cb85c;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #4cae4c;
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

        .error {
            color: red;
            text-align: center;
        }
    </style>   
</head>
<body>
    <div class="container">
        <h1>User Login</h1>
        <form action="login">
        <input type="hidden" name="action" value="login">
        
            <label for="email">${requestScope.emailError}</label>
            <input type="text" name="email" placeholder="Enter Username" >
            <br>
            <label for="password">${requestScope.passwordError}</label>
            <input type="password" name="password" placeholder="Enter password">
            <br>
            <input type="submit" value="Login">
            <a href="forgotPassPage.jsp">ForgetPassword</a>
            <a href="registerPage.jsp">New user? Register</a>
              <label>${requestScope.loginError}</label>
        </form>
    </div>
</body>
</html>
