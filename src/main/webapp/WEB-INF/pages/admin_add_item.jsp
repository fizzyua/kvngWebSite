<?xml version="1.0" encoding="utf-8"?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;charset=utf-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>KVNG-web-site</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>

<h1>Form</h1>
<form method = "POST" action = "/addItem" modelAttribute="Item">>
    <table>
        <tr>
            <td><label path = "title">title</label></td>
            <td><input path = "title" /></td>
        </tr>
        <tr>
            <td><label path = "text">text</label></td>
            <td><input path = "text" /></td>
        </tr>
        <tr>
            <td><label path = "article">article</label></td>
            <td><input path = "article" /></td>
        </tr>
        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>