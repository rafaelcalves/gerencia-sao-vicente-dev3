<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<t:template>
    <jsp:attribute name="header">
        <link rel="stylesheet" href="/resources/css/form.css">
    </jsp:attribute>

    <jsp:attribute name="title">
        Login
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

        <form method="POST" action="/login" class="form-signin" modelAttribute="user">
            <div class="">
                <input name="email" type="text" placeholder="Email"
                       autofocus="true"/>
                <input name="password" type="password" placeholder="Password"/>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <br>
                <button type="submit">Log In</button>
            </div>
        </form>
    </jsp:body>
</t:template>
