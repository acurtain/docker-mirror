<%--
  Created by IntelliJ IDEA.
  User: astraea
  Date: 2015/4/2
  Time: 7:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
    String _base = request.getContextPath();
    request.setAttribute("_base", _base);

    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", 0);
    response.setHeader("Pragma", "No-cache");
%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${_base}/resources/Bootstrap/css/bootstrap.min.css">
<script src="${_base}/resources/jQuery/jquery.min.js"></script>
<script src="${_base}/resources/Bootstrap/js/bootstrap.min.js"></script>

<script>
    var _base = "${_base}";
</script>