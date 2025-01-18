<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

    <title>Form Example</title>
</head>
<body>

<div class="container">
    <h1>Login</h1>
    <pre>${errorMessage}</pre>
    <form method="post">

        <div>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter your name">
        </div>
        <br>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password">
        </div>
        <br>
        <input type="submit" value="Submit">

    </form>
</div>

</body>
</html>
