<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Board</title>
</head>
<body>

<table border="1" summary="목록">
    <caption>
        <span>목록</span>
    </caption>
    <thead>
    <tr>
        <th>이름</th>
        <th>제목</th>
        <th>내용</th>
    </tr>
    </thead>

    <c:if test="${posts.size()==0}">
        <tfoot>
        <tr>
            <td colspan="3">게시글이 없습니다.</td>
        </tr>
        </tfoot>
    </c:if>
    <tbody>
        <c:forEach var="post" items="${posts}">
            <tr>
                <td><c:out value="${post.name}"/></td>
                <td><c:out value="${post.title}"/></td>
                <td><c:out value="${post.content}"/></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/">메인으로 돌아가기</a>
</body>
</html>