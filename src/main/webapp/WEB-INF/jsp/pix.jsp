<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<t:template>
    <jsp:attribute name="header">
        <link rel="stylesheet" href="/resources/css/payment.css">
        <script src="<c:url value="/resources/js/pix.js" />"></script>
    </jsp:attribute>

    <jsp:attribute name="title">
        Pix
    </jsp:attribute>

    <jsp:body>
        <div class="form">
            <div class="form-payment">
                <p class="form-title">O PIX permite uma doação rápida e prática! <br/>
                    Clique em uma das chaves para copiar para sua área de transferência e termine o pagamento pelo seu banco</p>

                <input type="text" id="CNPJ" class="text-pix" value="12.345.678/0001-99" onclick="myFunctionCNPJ()">

                <input type="text" id="telefone" class="text-pix" value="+5551999999999" onclick="myFunctionTelefone()">
                <div class="box-footer-payment">
                    <class="box-footer-login-item">Obrigada!
                </div>
            </div>
        </div>
    </jsp:body>
</t:template>
