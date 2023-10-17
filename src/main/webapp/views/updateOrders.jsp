<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Orders Are Updated here</title>

</head>
<body>
    <h1>Order Updates</h1>
    <form action="/updateOrders" method="POST"> 
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        
        <label for="dish">Dish:</label>
        <input type="text" id="dish" name="dish" required><br>
        
        <label for="price">Price:</label>
        <input type="number" id="price" name="price" required><br>
        
        <label for="section">Section:</label>
        <input type="text" id="section" name="section" required><br>
        
        <button type="submit">Add Orders</button>
    </form>
</body>
</html>
