<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Board</title>
</head>
<body>
<form action="/posts/write" method="post">
    username: <input type="text" id ="name" name="name" /><br>
    title: <input type="text" id ="title" name="title" /><br>
    content: <input type="text" id ="content" name="content" /><br>
    <button type="submit">작성</button>
</form>
</body>
</html>