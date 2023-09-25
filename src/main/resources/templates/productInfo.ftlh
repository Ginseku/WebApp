<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>MAC</title>
</head>
<body>

<#list images as img>
    <img src="/images/${img.id}" height="60px"/><br><br>
</#list>
<b>Name product: </b>${stock.productName}<br>
<b>Category: </b>${stock.category}<br>
<b>Size: </b>${stock.size}<br>
<b>Color: </b>${stock.color}<br>
<b>Color: </b>${stock.count}<br>
<b>Price: </b>${stock.price}<br>

</body>
</html>