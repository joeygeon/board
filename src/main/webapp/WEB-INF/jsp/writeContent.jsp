<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Board</title>
</head>
<body>
<form action="/posts/write" method="post">
    User Name: <input type="text" id ="name" name="name" /><br>
    Title: <input type="text" id ="title" name="title" /><br>
    Content: <input type="text" id ="content" name="content" /><br>
    <button type="submit">작성</button>
</form>
</body>
</html>