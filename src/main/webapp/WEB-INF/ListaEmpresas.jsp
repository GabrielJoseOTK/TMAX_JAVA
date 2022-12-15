<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    
    %>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard Taglib</title>
</head>
<body>

	<c:if test="${not empty empresa}">
		Empresa " ${empresa} + nomeEmpresa + " cadastrada com sucesso!
	</c:if>


    Lista de empresas: <br />

    <ul>
        <c:forEach items="${empresas}" var="empresa">
        
            <li>${empresa.nome } </li>
            <li><fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/></li>

            
        </c:forEach>
    </ul>

colocar o arquivo jstl-1.2.jar dentro da basta lib de WEB_INF;


</body>
</html>