<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<t:contentPage title="Upload" contentCaption="Upload info">
    <form:form method="POST" commandName="file" enctype="multipart/form-data">
        Upload your file please:
        <input type="file" name="file"/>
        <input type="submit" value="upload"/>
        <form:errors path="file" cssStyle="color: #ff0000;"/>
    </form:form>

</t:contentPage>