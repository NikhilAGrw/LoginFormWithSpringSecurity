<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>sign up</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
        <div class="wrapper">
            <h2>Registration</h2>
            <form action="register" method="Post">

              <div class="input-box">
                <input type="text" name="name" placeholder="Enter your name" required>
              </div>
               <div class="input-box">
                 <input type="tel" name="mobileNo" placeholder="Enter your mobile" required>
               </div>
              <div class="input-box">
                <input type="email" name="emailId" placeholder="Enter your email" required>
              </div>
              <div class="input-box">
                <input type="password" name="password" placeholder="Create password" required>
              </div>
              <div class="input-box button">
                <input type="Submit">
              </div>
              <div class="text">
                <h3>Already have an account? <a href="login">Login now</a></h3>
              </div>
            </form>
          </div>
</body>
</html>