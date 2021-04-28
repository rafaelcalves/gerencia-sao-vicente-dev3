<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<t:template>
    <jsp:attribute name="header">
        <link rel="stylesheet" href="/resources/css/login.css">
    </jsp:attribute>

    <jsp:attribute name="title">
        Register
    </jsp:attribute>

    <jsp:body>
        <c:if test="${param.error}">
            <div>
                Invalid username and password.
            </div>
        </c:if>
        <c:if test="${param.logout}">
            <div>
                You have been logged out.
            </div>
        </c:if>

        <form method="POST" action="perform_login" class="form" modelAttribute="user">
            <div class="form-login">
                <p class="form-title">Área de acesso interno! <br/>
                    Insira seus dados para acessar sua conta</p>
                <input name="username" type="text" placeholder="E-mail"
                       autofocus="true" class="input-form-login" />
                <input name="password" type="password" placeholder="Senha" class="input-form-login" />
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                <br>
                <button type="submit" class="btn-signin">Entrar</button>

                <a href="/login" class="forgot-password">Esqueci minha senha</a>
                <div class="box-footer-login">
                    <a href="/login" class="box-footer-login-item">Termos</a>
                    <a href="/login" class="box-footer-login-item">Privacidade</a>
                    <a href="/login" class="box-footer-login-item">Segurança</a>
                </div>
            </div>
        </form>
    </jsp:body>
</t:template>
