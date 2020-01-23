<%-- 
    Document   : agecalculator
    Created on : Jan 20, 2020, 4:18:59 PM
    Author     : 810585
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form return="false">
            <div>
                <div>Enter your age: <input type="text" size="25" name="age"></div>
                <div><input type="submit" value="Age next birthday"></div>
                ${message}
                <div><a href="arithmeticcalculator.jsp">Arithmetic Calculator</a></div>
            </div>
        </form>
    </body>
</html>
