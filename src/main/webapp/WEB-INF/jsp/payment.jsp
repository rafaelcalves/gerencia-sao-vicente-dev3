<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<t:template>
    <jsp:attribute name="header">
    test
    </jsp:attribute>

    <jsp:attribute name="title">
        Pagamento
    </jsp:attribute>

    <jsp:body>
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
    </jsp:body>
</t:template>
