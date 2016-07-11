<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:contentPage title="${team.name}" contentCaption="${team.name}">
    <jsp:attribute name="headScript">
        <link href="<c:url value="/resources/css/bootstrap-table.css"/>" rel="stylesheet">
        <script src="<c:url value="/resources/js/bootstrap-table.js"/>"></script>
        <script src="<c:url value="/resources/js/table-sorter.js"/>"></script>
        <script src="<c:url value="/resources/js/team.js"/> "></script>
    </jsp:attribute>

    <jsp:body>
        <div class="media team-info">
            <div class="media-left">
                <a href="#">
                    <img class="media-object" src="<c:url value="/resources/images/manager/${team.manager.image.newSrc}"/>"
                         alt="${team.manager.image.alt}">
                </a>
            </div>
            <div class="media-body">
                <table class="table table-striped soc-table" id="team-table">
                    <tr>
                        <td>Город</td>
                        <td>${team.stadium.city.name}</td>
                    </tr>
                    <tr>
                        <td>Сайт</td>
                        <td class="name_teams">
                            <a target="_blank" href="http://${team.site}">
                                    ${team.site}
                            </a>
                        </td>
                    </tr>
                    <tr>
                        <td>Стадион</td>
                        <td class="name_teams"><a
                                href="<c:url value="/stadium/${team.stadium.id}"/>">${team.stadium.name}</a></td>
                    </tr>
                    <tr>
                        <td>Тренер</td>
                        <td class="name_teams">
                            <a href="<c:url value="/manager/${team.manager.id}"/>">${team.manager.firstName} ${team.manager.lastName}</a>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="media-right">
                <a href="#">
                    <img class="media-object" src="<c:url value="/resources/images/team/${team.image.newSrc}"/>" alt="${team.image.alt}">
                </a>
            </div>
        </div>
        <p></p>
        <table data-toggle="table" class="table table-striped soc-table" id="squad-table">
            <thead>
            <tr>
                <th data-field="num" data-sortable="true">№</th>
                <th data-field="name" data-sortable="true" data-sort-name="_name_data" data-sorter="nameSorter">Игрок
                </th>
                <th data-field="amplua" data-sortable="true" data-sort-name="_amplua_data" data-sorter="ampluaSorter">
                    Поз
                </th>
                <th data-field="height" data-sortable="true">Рост</th>
                <th data-field="weight" data-sortable="true">Вес</th>
                <th data-field="price" data-sortable="true" data-sort-name="_price_data" data-sorter="priceSorter">
                    Стоимость
                </th>
                <th data-field="birth" data-sortable="true" data-sort-name="_birth_data" data-sorter="dateSorter">Дата
                    рождения
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="player" items="${team.players}">
                <tr>
                    <td>${player.num}</td>
                    <td data-playername="${player.lastName}${player.firstName}" class="strong"><a
                            href="<c:url value="/player/${player.id}"/>">${player.lastName} ${player.firstName}</a></td>
                    <td data-amplua="${player.amplua}">${player.amplua}</td>
                    <td>${player.height}</td>
                    <td>${player.weight}</td>
                    <td data-price="${player.priceEuro}">${player.price}</td>
                    <td data-month="<fmt:formatDate pattern="yyyyMMdd" value="${player.birthDate}"/>"><fmt:formatDate
                            pattern="dd.MM.yyyy" value="${player.birthDate}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </jsp:body>
</t:contentPage>