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
    <form action="../inscriptions" method="post">
        <label for="firstname">Prénom :</label>
        <input type="text" id="firstname" name="firstname" maxlength="50" required>

        <label for="lastname">Nom :</label>
        <input type="text" id="lastname" name="lastname" maxlength="60" required>

        <label for="birthdate">Date de naissance :</label>
        <input type="date" id="birthdate" name="birthdate" required>

        <label for="gender">Genre :</label>
        <select id="gender" name="gender" required>
            <option value="masculin">Masculin</option>
            <option value="feminin">Féminin</option>
        </select><br><br>

        <label for="email">Email :</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="mot_de_passe">Mot de passe :</label>
        <input type="password" id="mot_de_passe" name="mot_de_passe" required><br><br>

        <label for="adresse">Adresse :</label>
        <textarea id="adresse" name="adresse" required></textarea><br><br>

        <label for="telephone">Numéro de téléphone :</label>
        <input type="tel" id="telephone" name="telephone" required><br><br>


    <c:if test="${nameError != null}">
        <span style="color: red">${nameError}</span>
    </c:if>
        <button type="submit">enregistrement</button>

    </form>
</body>
</html>
