<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body>
	
	<c:if test="${not empty empresa}">
		Empresa " ${empresa} + nomeEmpresa + " cadastrada com sucesso!
	</c:if>
	<c:if test="${empty empresa}">
		Oops, algo aconteceu ?
	</c:if>
	
	
	
	</body>
</html>
