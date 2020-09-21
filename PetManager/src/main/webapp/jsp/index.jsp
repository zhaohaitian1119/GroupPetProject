<%--
  Created by IntelliJ IDEA.
  User: 39740
  Date: 2020/9/21
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/" method="post">
    品种
    <select name="petBreed">
        <option value="0">--请选择--</option>
        <c:if test="${breed == '柯基'}">
            <option value="柯基" selected>柯基</option>
        </c:if>
        <c:if test="${breed != '柯基'}">
            <option value="柯基" >柯基</option>
        </c:if>

        <c:if test="${breed == '柴犬'}">
            <option value="柴犬" selected>柴犬</option>
        </c:if>
        <c:if test="${breed != '柴犬'}">
            <option value="柴犬" >柴犬</option>
        </c:if>

        <c:if test="${breed == '阿拉斯加'}">
            <option value="阿拉斯加" selected>阿拉斯加</option>
        </c:if>
        <c:if test="${breed != '阿拉斯加'}">
            <option value="阿拉斯加" >阿拉斯加</option>
        </c:if>

        <c:if test="${breed == '杜宾'}">
            <option value="杜宾" selected>杜宾</option>
        </c:if>
        <c:if test="${breed != '杜宾'}">
            <option value="杜宾" >杜宾</option>
        </c:if>

        <c:if test="${breed == '哈士奇'}">
            <option value="哈士奇" selected>哈士奇</option>
        </c:if>
        <c:if test="${breed != '哈士奇'}">
            <option value="哈士奇" >哈士奇</option>
        </c:if>
    </select>
    <input type="submit" value="查询">
    <a href="/jsp/add.jsp">新增宠物</a>
    <table border="1px">
        <tr>
            <td>宠物昵称</td>
            <td>出生日期</td>
            <td>性别</td>
        </tr>
        <c:forEach items="${pets}" var="pet">
            <tr>
                <td>${pet.petName}</td>
                <td>${pet.datetime}</td>
                <td>${pet.petSex}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
