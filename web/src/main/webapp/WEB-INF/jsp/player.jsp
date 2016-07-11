<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:contentPage title="${player.firstName} ${player.lastName}" contentCaption="Информация об игроке">
    <jsp:attribute name="headScript">
    </jsp:attribute>

    <jsp:body>
        <div class="media">
            <div class="media-left">
                <a href="#">
                    <img class="media-object" src="<c:url value="/resources/images/player/${player.image.newSrc}"/>" alt="${player.image.alt}">
                </a>
            </div>
            <div class="media-body">
                <table class="table table-striped">
                    <caption class="person-info-title">
                        <h3>${player.firstName} ${player.lastName}</h3>

                        #${player.num} | ${player.amplua}
                    </caption>
                    <tr>
                        <td>Команда</td>
                        <td>
                            <a href="<c:url value="/teams/${player.team.id}"/>">
                                    ${player.team.name}
                            </a>
                        </td>
                    </tr>
                    <tr>
                        <td>Дата рождения</td>
                        <td>
                            <fmt:formatDate pattern="dd.MM.yyyy" value="${player.birthDate}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Рост</td>
                        <td>${player.height}</td>
                    </tr>
                    <tr>
                        <td>Вес</td>
                        <td>${player.weight}</td>
                    </tr>
                    <tr>
                        <td>Цена</td>
                        <td>${player.price}</td>
                    </tr>
                </table>
            </div>
        </div>
    </jsp:body>
</t:contentPage>