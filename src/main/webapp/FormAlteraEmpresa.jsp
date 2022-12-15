<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!-- ou <c:url value="/Novaempresa" var="variavel"/> -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Nova Empresa</title>
</head>
<body>

<!-- Com o core permite a automatização de atualização de url -->


	<form action="<c:url value="/Alteraempresa"/>" method="POST">
		<label for="fname">First name:</label><br> 
		<input type="text" id="fname" name="fname" value="${empresa.nome}"><br> 
		<label for="data">Data de Abertura:</label><br> 
		<input type="text" id="data" name="data" value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>"><br> 
		<input type="text" id="id" name="id" value="${empresa.id}"><br>
		
			<input type="submit">

	</form>

</body>
</html>