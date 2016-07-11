<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:contentPage title="${country.name}" contentCaption="${country.name}. Команды">
    <jsp:attribute name="headScript">
        <link href='<c:url value="/resources/css/teams.css"/>' rel="stylesheet">
    </jsp:attribute>
    <jsp:body>
        <div class="teams-container">
            <c:forEach var="team" items="${teams}">
                <div class="col-md-3 text-center team-list-column">
                    <div class="team-list-block">
                        <div class="team-list-title">
                            <a href="<c:url value="/teams/${team.id}"/>">
                                    ${team.name}
                            </a>
                        </div>
                        <div class="team-list-logo"
                             style="background-image: url(<c:url value="/resources/images/team/${team.image.newSrc}"/>)"
                             onclick="location.href = '<c:url value="/teams/${team.id}"/>'">
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </jsp:body>
</t:contentPage>