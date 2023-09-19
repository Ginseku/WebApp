<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>MAC</title>
      <link rel="stylesheet" type="text/css" href="/css/style.x35928.css"/>
</head>
<body>

<form action="/add" method="post">
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
                <input type="submit" value="add task">
            </td>

        </tr>

    </table>
</form>
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
    <#list showList as stock>

    <tr>
        <tr>
            <td>${stock.id}</td>
            <td>${stock.productName}</td>
            <td>${stock.category}</td>
            <td>${stock.size}</td>
            <td>${stock.color}</td>
            <td>${stock.count}</td>
            <td>${stock.price}</td>
            <td><a href="${'/delete/'+stock.id}"">Delete</a></td>
            <td><a href="${'/secondList/'+stock.id}">More...</td>
        </tr>
    </#list>
</table>



</body>
</html>