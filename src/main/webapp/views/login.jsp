<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login jsp</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
        <div class="wrapper">
            <h2>login</h2>
            <form action="login" method="Post">
              <div class="input-box">
                <input type="email" placeholder="Enter your email" required>
              </div>
              <div class="input-box">
                <input type="password" placeholder="Enter password" required>
              </div>
              <div class="input-box button">
                <input type="Submit">
              </div>
              <div class="text">
                <h3>Create an account? <a href="signup">sign up</a></h3>
              </div>
            </form>
          </div>
</body>
</html>