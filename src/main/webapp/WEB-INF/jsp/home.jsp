<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<t:template>
    <jsp:attribute name="header">
        <link rel="stylesheet" href="/resources/css/login.css">
    </jsp:attribute>

    <jsp:attribute name="title">
        Lar São Vicente de Paula
    </jsp:attribute>

    <jsp:body>
        <c:if test="${empty logged_user}">
            <form:form method="POST" action="/register" modelAttribute="user" class="form">
                <div class="form-login">
                    <p class="form-title">Cadastre-se e venha ser um doador<br/></p>
                    <form:hidden path="id"/>
                    <form:input name="firstName" type="text" placeholder="Nome" autofocus="true" class="input-form-login"  path="firstName"/>
                    <form:errors path="firstName" cssClass="error" />
                        <%--                <form:input name="lastName" type="text" placeholder="Sobrenome" autofocus="true" class="input-form-login"  path="lastName"/>--%>
                        <%--                <form:errors path="lastName" cssClass="error" />--%>
                    <form:input name="email" type="text" placeholder="E-mail" autofocus="true" class="input-form-login"  path="email"/>
                    <form:errors path="email" cssClass="error" />
                    <form:input name="password" type="password" placeholder="Senha" class="input-form-login"  path="password"/>
                    <form:input name="confirmPassword" type="password" placeholder="Confirmar Senha" class="input-form-login"  path="confirmPassword"/>
                    <form:errors path="confirmPassword" cssClass="error" />
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    <br>
                    <form:button class="btn-signin">Cadastrar</form:button>
                    <div class="box-footer-login">
                    </div>
                </div>
            </form:form>
        </c:if>
    </jsp:body>
</t:template>
