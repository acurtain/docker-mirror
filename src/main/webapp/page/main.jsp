<%--
  Created by IntelliJ IDEA.
  User: astraea
  Date: 2015/4/2
  Time: 7:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="/page/common/common.jsp" %>
    <title></title>
    <script>
        $(document).ready(function () {
            $.ajax({
                type:'POST',
                url:'${_base}/container/all',
                dataType:'json',
                success:function(data){
                    var containerTmpl = $.templates("#containerTmpl");
                    var containers = data;
                    var container = {
                        containers: containers
                    };
                    var html = containerTmpl.link("#containers", container);
                }
            });
        });
    </script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">WebSiteName</a>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-2 col-sm-4">
            <ul class="nav nav-pills nav-stacked">
                <li class="active"><a href="#">Container</a></li>
            </ul>
        </div>
        <div class="col-sm-10">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>Names</th>
                    <th>Description</th>
                    <th>Image</th>
                    <th>Command</th>
                    <th>Create time</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody id="containers">
                </tbody>
                <script id="containerTmpl" type="text/x-jsrender">
                    {^{for containers}}
                        <tr>
                            <td>{{:Names}}</td>
                            <td></td>
                            <td>{{:Image}}</td>
                            <td>{{:Command}}</td>
                            <td>{{:Created}}</td>
                            <td></td>
                        </tr>
                    {{/for}}
                </script>
            </table>
        </div>
    </div>
</div>
<div></div>
</body>
</html>
