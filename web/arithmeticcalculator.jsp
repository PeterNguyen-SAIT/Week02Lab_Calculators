<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 22, 2020, 5:34:14 PM
    Author     : 810585
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>

        <form return="false">
            <div>
                <div>First: <input type="text" size="25" name="first" value="${first}"></div>
                <div>Second: <input type="text" size="25" name="second" value="${second}"></div>
                <div>
                    <input type="submit" name="button" value="+">
                    <input type="submit" name="button" value="-">
                    <input type="submit" name="button" value="*">
                    <input type="submit" name="button" value="%">
                </div>
                <div>Result: ${result}</div>
                <div><a href="agecalculator.jsp">Age Calculator</a></div>
            </div>
        </form>
    </body>
</html>
