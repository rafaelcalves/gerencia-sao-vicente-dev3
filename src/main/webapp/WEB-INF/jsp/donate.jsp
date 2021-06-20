<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<t:template>
    <jsp:attribute name="header">
        <link rel="stylesheet" href="/resources/css/payment.css">
    </jsp:attribute>

    <jsp:attribute name="title">
        Obrigada!
    </jsp:attribute>

    <jsp:body>
        <div class="form">
            <div class="form-payment">
                <p class="form-title">Doação confirmada!</p>
            </div>
        </div>
    </jsp:body>
</t:template>
