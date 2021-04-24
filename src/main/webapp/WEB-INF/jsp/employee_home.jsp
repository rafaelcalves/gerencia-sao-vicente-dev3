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
        EMPLOYEE HOME
    </jsp:attribute>

    <jsp:body>
        <h2 class="hello-title">Hello ${name}!</h2>
    </jsp:body>
</t:template>
