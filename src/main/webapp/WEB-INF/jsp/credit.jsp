<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<t:template>
    <jsp:attribute name="header">
        <link rel="stylesheet" href="/resources/css/credit.css">
    </jsp:attribute>

    <jsp:attribute name="title">
        Credit Card
    </jsp:attribute>

    <jsp:body>

        <div class="creditCardForm">
            <div class="heading">
                <h1>Confirme sua doação</h1>
            </div>
            <div class="payment">
                <form:form method="POST" action="/payment/credit/save" modelAttribute="credit-card" class="form">
                    <div class="form-group owner">
                        <label for="name">Nome impresso no cartão</label>
                        <form:input name="name" type="text" autofocus="true" class="form-control"  path="name"/>
                        <form:errors path="name" cssClass="error" />
                    </div>
                    <div class="form-group valor">
                        <label for="value">Valor</label>
                        <form:input name="value" type="number" autofocus="true" class="form-control"  path="value"/>
                        <form:errors path="value" cssClass="error" />
                    </div>
                    <div class="form-group CVV">
                        <label for="cvv">CVV</label>
                        <form:input name="cvv" type="text" autofocus="true" class="form-control"  path="cvv"/>
                        <form:errors path="cvv" cssClass="error" />
                    </div>
                    <div class="form-group" id="card-number-field">
                        <label for="number">Número</label>
                        <form:input name="number" type="text" autofocus="true" class="form-control"  path="number"/>
                        <form:errors path="number" cssClass="error" />
                    </div>
                    <div class="form-group" id="expiration-date">
                        <label>Validade</label>
                        <form:select name="expirationMonth" class="input--style-4"  path="expirationMonth">
                            <form:option value="01">Janeiro</form:option>
                            <form:option value="02">Fevereiro </form:option>
                            <form:option value="03">Março</form:option>
                            <form:option value="04">Abril</form:option>
                            <form:option value="05">Maio</form:option>
                            <form:option value="06">Junho</form:option>
                            <form:option value="07">Julho</form:option>
                            <form:option value="08">Agosto</form:option>
                            <form:option value="09">Setembro</form:option>
                            <form:option value="10">Outubro</form:option>
                            <form:option value="11">Novembro</form:option>
                            <form:option value="12">Dezembro</form:option>
                        </form:select>
                        <form:errors path="expirationMonth" cssClass="error" />
                        <form:select name="expirationYear" class="input--style-4"  path="expirationYear">
                            <form:option value="21"> 2021</form:option>
                            <form:option value="22"> 2022</form:option>
                            <form:option value="23"> 2023</form:option>
                            <form:option value="24"> 2024</form:option>
                            <form:option value="25"> 2025</form:option>
                            <form:option value="26"> 2026</form:option>
                            <form:option value="27"> 2027</form:option>
                            <form:option value="28"> 2028</form:option>
                        </form:select>
                        <form:errors path="expirationYear" cssClass="error" />
                    </div>
                    <div class="form-group" id="credit_cards">
                        <img src="/resources/img/visa.jpg" id="visa">
                        <img src="/resources/img/mastercard.jpg" id="mastercard">
                        <img src="/resources/img/amex.jpg" id="amex">
                    </div>
                    <div class="form-group" id="pay-now">
                        <button type="submit" class="btn btn-default" id="confirm-purchase">Efetuar doação</button>
                    </div>
                </form:form>
            </div>
        </div>

        <script src="/resources/js/jquery.payform.min.js" charset="utf-8"></script>
        <script src="/resources/js/card.js"></script>
    </jsp:body>
</t:template>
