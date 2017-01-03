<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tibbytang
  Date: 31/12/2016
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>开始上传图片</title>
</head>
<body>
<form action="${ctx}/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="上传">
</form>
<a href="${ctx}/showImage?name=47E66E37-91E7-422F-B581-03B77878CA82.png">显示图片</a>
</body>
</html>
