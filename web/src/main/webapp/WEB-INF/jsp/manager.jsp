<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:contentPage title="${manager.firstName} ${manager.lastName}"
               contentCaption="тренер">
    <jsp:attribute name="headScript">
    </jsp:attribute>

    <jsp:body>
        <div class="media">
            <div class="media-left">
                <a href="#">
                    <img class="media-object" src="${manager.image.src}" alt="${manager.image.alt}">
                </a>
            </div>
            <div class="media-body">
                <table class="table table-striped">
                    <caption class="person-info-title">
                        <h3>
                            ${manager.firstName} ${manager.lastName}
                        </h3>

                        Тренер
                    </caption>

                    <tr>
                        <td>Команда</td>
                        <td>
                            <a href="<c:url value="/teams/${team.id}"/>">
                                    ${team.name}
                            </a>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </jsp:body>
</t:contentPage>