<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:contentPage title="${stadium.name}"
               contentCaption="информация о стадионе">
    <jsp:attribute name="headScript">
    </jsp:attribute>

    <jsp:body>
        <div class="media">
            <c:if test="${stadium.image !=null}">
                <div class="media-left" >
                    <img src="<c:url
                            value="/resources/images/stadiums/${stadium.image.newSrc}"/>" width="300px"/>
                </div>
            </c:if>

            <div class="media-body">
                <table class="table table-striped">
                    <caption class="person-info-title">
                        <h3>
                                ${stadium.name}
                        </h3>

                        Стадион
                    </caption>

                    <tr>
                        <td>Город</td>
                        <td>
                                ${stadium.city.name}
                        </td>
                    </tr>
                    <tr>
                        <td>Вместимость</td>
                        <td>
                                ${stadium.capacity}
                        </td>
                    </tr>
                </table>
            </div>
        </div>

        <form:form method="POST" commandName="file" enctype="multipart/form-data">
            Выберите фото:
            <input type="file" name="file"/>
            <input type="submit" value="Загрузить"/>
        </form:form>
    </jsp:body>
</t:contentPage>