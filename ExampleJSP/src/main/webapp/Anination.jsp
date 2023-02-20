<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .load{
            border: 16px solid black;
            border-radius: 50%;
            border-top:  16px solid white;
            width: 100px;
           height: 100px;
           animation: rotate 2s linear infinite;
        }
        @keyframes rotate
        {
             
                100%{transform: rotate(360deg);}
        }
    </style>
</head>
<body>
    <h1>Loading in HTML</h1>
    <div class="load"></div>
</body>     
</html>