<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>MAC</title>
      <link rel="stylesheet" type="text/css" href="/css/style.x35928.css"/>
</head>
<body>
<h1>MAC | <a href="/login">Войти</a></h1><hr>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Logout">
</form>
<h4>Your personal warehose</h4>
<form action="/add" method="post" enctype="multipart/form-data">
    <table border="1px">
        <tr>
            <td>
                <label>Product Name</label>
                    <input type="text" name="productName">
            </td>
            <td>
                <label>Category</label>
                <input type="text" name="category">
            </td>
            <td>
                <label>Size</label>
                <input type="number" name="size">
            </td>
            <td>
                <label>Color</label>
                <input type="text" name="color">
            </td>
            <td>
                <label>Price</label>
                <input type="number" name="price">
            </td>
            <td>
                <label>Count</label>
                <input type="number" name="count">
            </td>
            <td>
                <label>First photo:</label>
                <input type="file" name="file1">
            </td>
            <td>
                <label>Second photo:</label>
                <input type="file" name="file2">
            </td>
            <td>
                <label>Thirst photo:</label>
                <input type="file" name="file3">
            </td>
            <td>
                <input type="submit" value="add task">
            </td>

        </tr>

    </table>

</form>

<p>
<p>
<p>
<table border="1px">
    <tr>
        <td><label>Id</label></td>
        <td><label>Product Name</label></td>
        <td><label>Category</label></td>
        <td><label>Size</label></td>
        <td><label>Color</label></td>
        <td><label>Price</label></td>
        <td><label>Count</label></td>
        <td><label>Options</label></td>
        <td><label>More</label></td>
    </tr>
    <#list products as stock>

    <tr>
        <tr>
            <td>${stock.id}</td>
            <td>${stock.productName}</td>
            <td>${stock.category}</td>
            <td>${stock.size}</td>
            <td>${stock.color}</td>
            <td>${stock.count}</td>
            <td>${stock.price}</td>
            <td><a href="${'/delete/'+stock.id}">Delete</a></td>
            <td><a href="${'/secondList/'+stock.id}">More...</td>
        </tr>
    </#list>
</table>
<p>
<form action="/" method="get">
    Find by name: <input type="text" name="productName">
    <input type="submit" value="Search"/>
</form>


</body>
</html>