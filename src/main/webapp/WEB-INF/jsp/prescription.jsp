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
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Receitar remédio</h2>
                    <form:form method="POST" action="/employee/prescription/save" modelAttribute="prescription" class="form">
                        <form:hidden path="id"/>
                        <div class="input-group">
                            <label class="label">Médico responsável</label>
                            <input class="input--style-4" type="text" disabled value="${logged_user.id} : ${logged_user.firstName} ${logged_user.lastName}">
                            <form:hidden path="doctorId" value="${logged_user.id}"/>
                        </div>

                        <div class="input-group">
                            <label class="label">Paciente</label>
                            <div class="input-group-icon">
                                <form:select name="patientId" class="input--style-4"  path="patientId">
                                    <form:option value="">Selecione um paciente</form:option>
                                    <form:option value="0">0 : John Doe</form:option>
                                    <form:option value="1">1 : José da Silva</form:option>
                                    <form:option value="2">2 : Maria José</form:option>
                                    <form:option value="3">3 : Eduardo Paulo</form:option>
                                </form:select>
                            </div>
                        </div>


                        <div class="row row-space" style="padding: 8px; border-radius: 10px;margin-top: 22px;">
                            <h4 class="subtitle">Tratamento</h4>
                            <div style="padding: 8px;width: 100%;">
                                <div class="input-group">
                                    <label class="label">Remédio</label>
                                    <div class="input-group-icon">
                                        <form:select name="medicineId" class="input--style-4"  path="medicineId">
                                            <form:option value="">Selecione um Medicamento</form:option>
                                            <form:option value="0">0 : Aspirina</form:option>
                                            <form:option value="1">1 : Dipirona</form:option>
                                            <form:option value="2">2 : Paracetamol</form:option>
                                            <form:option value="3">3 : Diclofenaco</form:option>
                                        </form:select>
                                    </div>
                                </div>
                                <div class="input-group">
                                    <label class="label">Orientações</label>
                                    <form:textarea name="description" rows="6" type="text" autofocus="true" class="input--style-4" cssStyle="width: 100%;" path="description"/>
                                 </div>
                                <div class="input-group">
                                    <label class="label">Data do início</label>
                                    <div class="input-group-icon">
                                        <form:input name="startDate" type="text" autofocus="true" class="input--style-4"  path="startDate"/>
                                        <i class="zmdi zmdi-calendar-alt input-icon"></i>
                                    </div>
                                </div>
                                <div class="input-group">
                                    <label class="label">Data do término</label>
                                    <div class="input-group-icon">
                                        <form:input name="endDate" type="text" autofocus="true" class="input--style-4"  path="endDate"/>
                                        <i class="zmdi zmdi-calendar input-icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="p-t-15">
                            <button class="btn btn--radius-2 btn-submit" type="submit">Receitar</button>
                        </div>

                    </form:form>
                </div>
            </div>
        </div>
    </jsp:body>
</t:template>
