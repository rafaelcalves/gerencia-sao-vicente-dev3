<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="title" fragment="true" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" type="text/css">
    <link rel="stylesheet" href="<c:url value="/resources/css/theme.css"/>">
    <title id="title">
        <jsp:invoke fragment="title"/>
    </title>
</head>
<body>
<div id="pageheader">
    <jsp:invoke fragment="header"/>
</div>
<nav class="navbar navbar-fixed-top navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navLogo" href="/"><img src="/resources/img/logo.png" alt="Responsive">
            </a>
        </div>

        <div id="navbar" class="collapse navbar-collapse"
            style="display: flex !important;height: 100% !important;align-items: center;justify-content: flex-end;">
            <ul class="nav navbar-nav navbar-right">
                <c:if test="${not empty logged_user}">
                    <li><a href="/">Página inicial</a></li>
                    <li><a href="/">Relatórios</a></li>
                    <li><a href="/">Tarefas</a></li>
                    <li><a href="/">Meu perfil</a></li>

                    <li><a class="disabled"
                        style="color: #8C0052 !important;font-size: 16px !important; font-weight: 700">
                            Olá, ${logged_user.firstName}
                        </a>
                    </li>

                    <li>
                    <a href="/logout"
                        style="height: 40px; width: 120px; background-color: #8C0052; border-radius: 6px; border: 1px solid #8C0052; box-sizing: border-box; display: flex; align-items: center; justify-content: center; color: #ffffff !important; font-size: 16px; margin-left: 20px;">
                      Sair
                    </a>
                    </li>
                </c:if>
                <c:if test="${empty logged_user}">
                    <li><a href="#">Sobre o Lar</a></li>
                    <li><a href="#">Eventos</a></li>
                    <li><a href="#">Entre em Contato</a></li>
                    <li>
                        <a href="/login"
                           style="height: 40px; width: 120px; background-color: #8C0052; border-radius: 6px; border: 1px solid #8C0052; box-sizing: border-box; display: flex; align-items: center; justify-content: center; color: #ffffff !important; font-size: 16px; margin-left: 20px;">
                            Entrar
                        </a>
                    </li>
                </c:if>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->
<div id="body">
    <div id="main-container" class="container">
        <jsp:doBody />
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"  integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="   crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<div id="pagefooter">
    <jsp:invoke fragment="footer"/>
</div>
</body>
</html>