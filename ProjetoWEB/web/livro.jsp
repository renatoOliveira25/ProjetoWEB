<%-- 
    Document   : livro
    Created on : 05/05/2016, 18:26:40
    Author     : Renato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Livros</h1>
        <br />
        <form>
            Titulo:<br>
            <input type="text" name="titulo"/><br><br>
            Núm. Páginas:<br>
            <input type="number" name="numPaginas"><br><br>
            Autor:<br>
            <input type="text" name="autor"><br><br>
            Editora:<br>
            <input type="text" name="editora"><br><br>
            <button type="button">Cadastrar</button>
        </form>
        <br><br><br>
        <a href="login.xhtml">Página Principal</a>
    </body>
</html>
