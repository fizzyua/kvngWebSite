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
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header"></div>
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class = "icon-bar"></span>
            <span class = "icon-bar"></span>
            <span class = "icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Т/К Время не ждет</a>
    </div>
    <div class = "navbar-collapse collapse">
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/">Главная</a> </li>
            <li class = "active"><a href="/calendar">Календарь</a> </li>
            <li><a href="#">Форум</a> </li>
            <li><a href="#">Участники</a> </li>
            <li><a href="/admin_add_item">Для членов клуба</a> </li>
        </ul>
    </div>
    <div>
        <iframe src="https://calendar.google.com/calendar/embed?height=1000&amp;wkst=1&amp;bgcolor=%23FFFFFF&amp;src=c52llhagd65qt6tf7odqbkk9co%40group.calendar.google.com&amp;color=%232F6309&amp;src=f10tdkk1t3fnjmfc5l65i89vq8%40group.calendar.google.com&amp;color=%238C500B&amp;ctz=Europe%2FKiev" style="border:solid 1px #777" width="800" height="800" frameborder="0" scrolling="yes"></iframe>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>