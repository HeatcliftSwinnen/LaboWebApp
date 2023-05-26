<%--
  Created by IntelliJ IDEA.
  User: studentdev04
  Date: 25-05-23
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>page d'inscription</title>
</head>
<body>
    <h1>Inscriptions</h1>
    <form action="../login" method="post">
        <label for="firstname">Prénom :</label>
        <input type="text" id="firstname" name="firstname" maxlength="50">
        <label for="lastname">Nom :</label>
        <input type="text" id="lastname" name="lastname" maxlength="60">
        <label for="birthdate">Date de naissance :</label>
        <input type="date" id="birthdate" name="birthdate">

    <c:if test="${nameError != null}">
        <span style="color: red">${nameError}</span>
    </c:if>
        <button type="submit">enregistrement</button>

    </form>
</body>
</html>
