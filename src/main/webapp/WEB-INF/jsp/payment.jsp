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
        Payment
    </jsp:attribute>

    <jsp:body>
        <div class="form">
            <div class="form-payment">
                <p class="form-title">Realize uma doação! <br/>
                   Qual a forma de pagamento?</p>
                <input type="button" class="btn-pix" value="Pix" onclick="document.location.href='payment/pix'">

                <input type="button" class="btn-card" value="Cartão de crédito" onclick="document.location.href='payment/credit'">
                <div class="box-footer-payment">
                    <a href="/payment" class="box-footer-login-item">Informações adicionais</a>
                </div>
            </div>
        </div>
    </jsp:body>
</t:template>
