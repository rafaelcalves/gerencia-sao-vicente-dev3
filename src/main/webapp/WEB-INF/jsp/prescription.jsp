<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
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
                    <div class="card card-4">
                        <div class="card-body">
                            <h2 class="title">Receitar remédio</h2>
                            <form method="POST">

                                <div class="input-group">
                                    <label class="label">Médico responsável</label>
                                    <input class="input--style-4" type="text" name="medical">
                                </div>

                                <div class="input-group">
                                    <label class="label">Paciente</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4" type="text" name="patient">
                                        <i class="zmdi zmdi-search input-icon"></i>
                                    </div>
                                </div>


                                <div class="row row-space" style="padding: 8px; border-radius: 10px;margin-top: 22px;">
                                    <h4 class="subtitle">Tratamento</h4>
                                    <div style="padding: 8px;width: 100%;">
                                        <div class="input-group">
                                            <label class="label">Remédio</label>
                                            <div class="input-group-icon">
                                                <input class="input--style-4" type="text" name="medicine">
                                                <i class="zmdi zmdi-search input-icon"></i>
                                            </div>
                                        </div>
                                        <div class="input-group">
                                            <label class="label">Orientações</label>
                                            <textarea class="input--style-4" type="text" rows="6" name="description"
                                                style="width: 100%;"></textarea>
                                         </div>
                                        <div class="input-group">
                                            <label class="label">Data do início</label>
                                            <div class="input-group-icon">
                                                <input class="input--style-4" type="text" name="startDate">
                                                <i class="zmdi zmdi-calendar-alt input-icon"></i>
                                            </div>
                                        </div>
                                        <div class="input-group">
                                            <label class="label">Data do término</label>
                                            <div class="input-group-icon">
                                                <input class="input--style-4" type="text" name="endDate">
                                                <i class="zmdi zmdi-calendar input-icon"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="p-t-15">
                                    <button class="btn btn--radius-2 btn-submit" type="submit">Receitar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

    </jsp:body>
</t:template>
