<%@tag pageEncoding="UTF-8" %>
<%@attribute name="title" required="true" %>
<%@attribute name="contentCaption" required="false" %>
<%@attribute name="headScript" fragment="true" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericPage>
    <jsp:attribute name="headScript">
        <title>
                ${title}
        </title>
        <%@include file="/WEB-INF/jsp/fragments/headScript.jsp" %>
        <jsp:invoke fragment="headScript"/>
    </jsp:attribute>

    <jsp:attribute name="header">
        <%@include file="/WEB-INF/jsp/fragments/header.jsp" %>
    </jsp:attribute>

    <jsp:attribute name="footer">
        <%@include file="/WEB-INF/jsp/fragments/footer.jsp" %>
    </jsp:attribute>

    <jsp:body>
        <div class="container-fluid">
            <!-- Example row of columns -->
            <div class="row">
                    <%--left content--%>
                <div class="col-md-3">
                    <%@include file="/WEB-INF/jsp/fragments/leftContent.jsp" %>
                </div>
                    <%--main content--%>
                <div class="col-md-7 main-content">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title text-uppercase">${contentCaption}</h3>
                        </div>
                        <div class="panel-body">
                            <jsp:doBody/>
                        </div>
                    </div>
                </div>
                    <%--right content--%>
                <div class="col-md-2">
                    <%@include file="/WEB-INF/jsp/fragments/rightContent.jsp" %>
                </div>
            </div>
        </div>
    </jsp:body>
</t:genericPage>