<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
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
                <form>
                    <div class="form-group owner">
                        <label for="owner">Nome impresso no cartão</label>
                        <input type="text" class="form-control" id="owner">
                    </div>
                    <div class="form-group CVV">
                        <label for="cvv">CVV</label>
                        <input type="text" class="form-control" id="cvv">
                    </div>
                    <div class="form-group" id="card-number-field">
                        <label for="cardNumber">Número</label>
                        <input type="text" class="form-control" id="cardNumber">
                    </div>
                    <div class="form-group" id="expiration-date">
                        <label>Validade</label>
                        <select>
                            <option value="01">Janeiro</option>
                            <option value="02">Fevereiro </option>
                            <option value="03">Março</option>
                            <option value="04">Abril</option>
                            <option value="05">Maio</option>
                            <option value="06">Junho</option>
                            <option value="07">Julho</option>
                            <option value="08">Agosto</option>
                            <option value="09">Setembro</option>
                            <option value="10">Outubro</option>
                            <option value="11">Novembro</option>
                            <option value="12">Dezembro</option>
                        </select>
                        <select>
                            <option value="21"> 2021</option>
                            <option value="22"> 2022</option>
                            <option value="23"> 2023</option>
                            <option value="24"> 2024</option>
                            <option value="25"> 2025</option>
                            <option value="26"> 2026</option>
                            <option value="27"> 2027</option>
                            <option value="28"> 2028</option>
                        </select>
                    </div>
                    <div class="form-group" id="credit_cards">
                        <img src="/resources/img/visa.jpg" id="visa">
                        <img src="/resources/img/mastercard.jpg" id="mastercard">
                        <img src="/resources/img/amex.jpg" id="amex">
                    </div>
                    <div class="form-group" id="pay-now">
                        <button type="submit" class="btn btn-default" id="confirm-purchase">Efetuar doação</button>
                    </div>
                </form>
            </div>
        </div>

        <script src="/resources/js/jquery.payform.min.js" charset="utf-8"></script>
        <script src="/resources/js/card.js"></script>
    </jsp:body>
</t:template>
