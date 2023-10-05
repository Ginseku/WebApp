<!DOCTYPE html>
<html>
<head>
    <title>MAC</title>
</head>
<body>
<h1>MAC</h1><hr>
<h4>Registration</h4>
<form action="/registration" method="post">
    Username: <input type="text" name="name"><br><br>
    E-mail: <input type="email" name="email"><br><br>
    Telephone number: <input type="number" name="numberPhone"><br><br>
    Password: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Registartion"/>
</form>

</body>
</html>