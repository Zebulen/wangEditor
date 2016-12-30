<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tibbytang
  Date: 30/12/2016
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Preview</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/dist/css/wangEditor.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/dist/static/highlightjs/dark.css">
</head>
<body>
<%--<div>${page}</div>--%>
<div>${page}</div>
<!--这里引用jquery和wangEditor.js-->
<script type="text/javascript" src="${ctx}/static/dist/js/lib/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="${ctx}/static/dist/js/wangEditor.min.js"></script>
</body>
</html>
