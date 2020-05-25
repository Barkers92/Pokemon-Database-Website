<html>
<style>
.pokedex {
	hight: 100%;
	width: 100px;
	background-color: blue;
}

.card {
	height: 100%;
	width: 100%;
	background-color: silver;
}
</style>
<head>
<meta charset="UTF-8">
<meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>
<meta <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v"%>>
<%-- Tag Library --%>


<title>Ultimate Pokémon Database</title>
</head>
<body>
	<div class="card">
		<table border="1">
			<tr>
				<v:forEach items="${SearchPokemon}" var="v">
					<tr>
						<td>${v.getPokemon()}</td>
						<td>${v.getTypeI()}</td>
						<td>${v.getTypeII()}</td>
					</tr>
				</v:forEach>
			</tr>
		</table>
	</div>
</body>
</html>




