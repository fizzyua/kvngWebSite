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
            <li class = "active"><a href="#">Добавить новость</a> </li>
            <li><a href="add_item">Добавить члена</a> </li>
            <li><a href="#">Заплатить членский взнос</a> </li>
            <li><a href="#">Добавить фотоальбом</a> </li>
        </ul>
    </div>
</div></br></br></br>

<form class="form-horizontal">

    <div class="form-group">
        <label class="control-label col-xs-3" for="title"><font color="red">Название</font></label>
        <div class="col-xs-9">
            <input type="text" class="form-control" id="title" placeholder="Введите название">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="text"><font color="red">Описание:</font></label>
        <div class="col-xs-9">
            <input type="text" class="form-control" id="text" placeholder="Введите короткое описание статьи">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="article"><font color="red">Адрес:</font></label>
        <div class="col-xs-9">
            <textarea rows="20" class="form-control" id="article" placeholder="Напишите статью =)"></textarea>
        </div>
    </div>






    <div class="form-group">
        <label class="control-label col-xs-3" for="article"><font color="red">Добавить Фото</font></label>
        <div class="col-xs-9">
            <input class="centered" type="file" name="photo" multiple accept="image/*,image/jpeg">
        </div>
    </div>

    <div class="form-group">

    </div>


    <br />
    <div class="form-group">
        <div class="col-xs-offset-3 col-xs-9">
            <input type="submit" class="btn btn-primary" value="Опубликовать">
            <input type="reset" class="btn btn-default" value="Очистить форму">
        </div>
    </div>
</form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>