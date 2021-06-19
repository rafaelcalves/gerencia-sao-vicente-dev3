<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<t:template>
    <jsp:attribute name="header">
        <link rel="stylesheet" href="/resources/css/prescription.css">
    </jsp:attribute>

    <jsp:attribute name="title">
        Receitar remédio
    </jsp:attribute>

    <jsp:body>
        <div class="wrapper wrapper--w680">
            <c:forEach var="prescription" items="${prescriptions}">
                <div class="card card-4">
                    <div class="card-body">
                        <h2 class="title">Receita ${prescription.id}</h2>
                        <div class="input-group">
                            <label class="label">Paciente</label>
                            <div class="input-group-icon">
                                <input class="input--style-4" type="text" disabled value="${prescription.patient}">
                            </div>
                        </div>

                        <div class="row row-space" style="padding: 8px; border-radius: 10px;margin-top: 22px;">
                            <h4 class="subtitle">Tratamento</h4>
                            <div style="padding: 8px;width: 100%;">
                                <div class="input-group">
                                    <label class="label">Remédio</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4" type="text" disabled value="${prescription.medicine}">
                                    </div>
                                </div>
                                <div class="input-group">
                                    <label class="label">Orientações</label>
                                    <textarea type="text" autofocus="true" rows="6" class="input--style-4" style="width: 100%;" disabled >
                                            ${prescription.description}
                                    </textarea>
                                 </div>
                                <div class="input-group">
                                    <label class="label">Data do início</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4" type="text" disabled value="${prescription.startDate}">
                                        <i class="zmdi zmdi-calendar input-icon"></i>
                                    </div>
                                </div>
                                <div class="input-group">
                                    <label class="label">Data do término</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4" type="text" disabled value="${prescription.endDate}">
                                        <i class="zmdi zmdi-calendar input-icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </jsp:body>
</t:template>
