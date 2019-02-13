<%@ page import="java.util.ArrayList" %>
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
    <link rel="stylesheet" href="/css/index.css">


</head>
<body>
<div>
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
                <li class = "active"><a href="/">Главная</a> </li>
                <li><a href="/calendar">Календарь</a> </li>
                <li><a href="#">Форум</a> </li>
                <li><a href="#">Участники</a> </li>
                <li><a href="/admin_add_item">Для членов клуба</a> </li>
            </ul>
        </div>
    </div>
</div></br></br>
<div class = "news">
    <h3>Новости</h3>
</div>
<div id="table" class="col-md-10 col-md-offset-1">

    <div class="panel panel-default panel-table">
        <div class="panel-heading">
            <div class="row">
                <div class="col col-xs-6">


                </div>
                <div class="panel-body">
                    <table class="table table-striped table-bordered table-list">
                        <thead>
                        <tr>
                            <th><center>Тема</center></th>
                            <th><center>Обзор</center></th>
                            <th><center>Фото</center></th>
                            <th><center>Подробнее</center></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${items}" var="temp">
                            <tr>
                                <td><center>${temp.title}</center></td>
                                <td><center>${temp.text}</center></td>
                                <td><center>
                                <c:forEach items="${temp.itemLinks}" var="tem">
                                    <img class="piacture" src="${tem.path}" alt="Golden Gate Bridge with San Francisco in distance">
                                </c:forEach>
                                </center</td>
                                <td align="center">
                                    <button id = "itemId-${temp.id}"  class="myBtn btn btn-default">Открыть <i class="fa fa-rocket" aria-hidden="true"></i></button>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </div>
                <div class="centered panel-footer">
                    <div class="row">
                        <div class="col col-xs-8">
                            <ul class="pagination hidden-xs pull-right">
                                <li><a href="#"><<</a></li>
                                <li><a href="#">>></a></li>
                            </ul>
                            <ul class="pagination visible-xs pull-right">
                                <li><a href="#">«</a></li>
                                <li><a href="#">»</a></li>
                            </ul>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<div id="myModal" class="modal">

    <!-- Modal content -->
    <div class="modal-content">
       <%-- <span class="close">&times;</span>
        <p>Some text in the Modal..</p>--%>
    </div>

</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
</body>
</html>