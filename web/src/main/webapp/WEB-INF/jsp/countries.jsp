<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:contentPage title="Angular REST" contentCaption="REST using Angular js">

    <jsp:attribute name="headScript">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
        <script src="<c:url value='/resources/js/app.js' />"></script>
        <script src="<c:url value='/resources/js/service/country_service.js' />"></script>
        <script src="<c:url value='/resources/js/controller/country_controller.js' />"></script>
    </jsp:attribute>

    <jsp:body>
        <div class="generic-container" ng-app="myApp" ng-controller="CountryController as ctrl">

            <div class="panel panel-default">

                <div class="panel-heading"><span class="lead">Country Registration Form </span></div>
                <div style="margin: 20px" class="formcontainer">
                    <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">

                        <input type="hidden" ng-model="ctrl.country.id"/>

                        <div class="row">
                            <div class="form-group col-md-12">
                                <label class="col-md-2 control-lable" for="uname">Name</label>
                                <div class="col-md-7">
                                    <input type="text" ng-model="ctrl.country.name" id="uname" name="uname"
                                           class="firstName form-control input-sm" placeholder="Enter your name"
                                           required
                                           ng-minlength="3"/>
                                    <div class="has-error" ng-show="myForm.$dirty">
                                        <span ng-show="myForm.uname.$error.required">This is a required field</span>
                                        <span ng-show="myForm.uname.$error.minlength">Minimum length required is 3</span>
                                        <span ng-show="myForm.uname.$invalid">This field is invalid </span>
                                    </div>
                                </div>
                            </div>
                        </div>


                        <div class="row">
                            <div class="form-group col-md-12">
                                <label class="col-md-2 control-lable" for="image.src">image.src</label>
                                <div class="col-md-7">
                                    <input type="text" ng-model="ctrl.country.image.src" id="image.src"
                                           class="form-control input-sm"
                                           placeholder="Enter your lastName"/>
                                </div>
                            </div>
                        </div>


                        <div class="row">
                            <div class="form-group col-md-12">
                                <label class="col-md-2 control-lable" for="image.alt">image.alt</label>
                                <div class="col-md-7">
                                    <input type="text" ng-model="ctrl.country.image.alt" id="image.alt"
                                           class="form-control input-sm"
                                           placeholder="Enter your lastName"/>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-4">
                                <input type="submit" value="{{!ctrl.country.id ? 'Add Country' : 'Update Country'}}"
                                       class="btn btn-primary btn-sm"
                                       ng-disabled="myForm.$invalid">
                                <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm"
                                        ng-disabled="myForm.$pristine">
                                    Reset Form
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="panel panel-default">
                <!-- Default panel contents -->
                <div class="panel-heading"><span class="lead">List of Countries </span></div>
                <div class="tablecontainer">
                    <table class="table table-bordered table-hover fixed-table">
                        <thead>
                        <tr>
                            <th width="7%">ID</th>
                            <th width="13%">Name</th>
                            <th width="59%">src</th>
                            <th width="12%">alt</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr ng-repeat="u in ctrl.countries | orderBy:'id'">
                            <td><span ng-bind="u.id"></span></td>
                            <td><span ng-bind="u.name"></span></td>
                            <td><span ng-bind="u.image.src"></span></td>
                            <td><span ng-bind="u.image.alt"></span></td>
                            <td>
                                <button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-success">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </button>
                                <button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-danger">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </jsp:body>
</t:contentPage>