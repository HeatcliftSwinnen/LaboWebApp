<%--
  Created by IntelliJ IDEA.
  User: morph
  Date: 30-05-23
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inscription</title>
    <link rel="stylesheet" href="../styles/index.css">
</head>
<body>
<h1>Inscription</h1>
<form action="inscription" method="POST">
    <label for="prenom">Prénom :</label>
    <input type="text" name="prenom" id="prenom" required><br>

    <label for="nom">Nom :</label>
    <input type="text" name="nom" id="nom" required><br>

    <label for="dateNaissance">Date de naissance :</label>
    <input type="date" name="dateNaissance" id="dateNaissance" required><br>

    <label for="email">Email :</label>
    <input type="email" name="email" id="email" required><br>

    <label for="motDePasse">Mot de passe :</label>
    <input type="password" name="motDePasse" id="motDePasse" required><br>

    <label for="adresse">Adresse :</label>
    <input type="text" name="adresse" id="adresse" required><br>

    <label for="numeroTelephone">Numéro de téléphone :</label>
    <input type="text" name="numeroTelephone" id="numeroTelephone" required><br>

    <input type="submit" value="S'inscrire">
</form>
</body>
</html>