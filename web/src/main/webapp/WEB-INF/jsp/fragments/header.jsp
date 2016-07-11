<%--<%@ page contentType="text/html; charset=UTF-8" %>--%>
<%@tag pageEncoding="UTF-8"%>
<%--In this example, the navigation bar is hidden on small screens and replaced by
a button in the top right corner (try to re-size this window).--%>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value="/" />">Soccer</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Россия<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<c:url value="/russia/teams" />">РФПЛ</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Англия<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<c:url value="/england/teams" />">Премьер-лига</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Испания<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<c:url value="/spain/teams" />">Примера</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Германия<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<c:url value="/germany/teams" />">Бундеслига</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Италия<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<c:url value="/italy/teams" />">Серия А</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Франция<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<c:url value="/france/teams" />">Лига 1</a></li>
                    </ul>
                </li>
                <li><a href="<c:url value="/countries" />">Страны</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </div>
</nav>
