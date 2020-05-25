<html>
<head>
<meta charset="UTF-8">
<meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>
<meta <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v"%>>
<link rel="stylesheet" href="site.css">
<%-- Tag Library --%>
<title>Ultimate Pokémon Database</title>
<style>
.PAbilities
{
position:absolute;
left:70%;
top:20%;
font-size:24;
}
.PCatch
{
position:absolute;
left:50%;
top:20%;
font-size:24;
}
.PStats
{
position:absolute;
left:30%;
top:20%;
font-size:24;
}
p
{
align:center;
}
tr:hover 
{
background-color:blue;
font-color:white;
}
.leftPage
{
position:absolute;
left:30%;
top:20%;
font-size:24;
}

</style>
<link rel="shortcut icon" href="images\EthansTabIcon.ico" type="image/x-icon" />
</head>
<body>


	<div>

</div>


	<div class="PokeInfoPage">
		<div class="pokePic">
			<picture > <img id="pic" src="images\pokemon\5.png" alt="Pokemon"
				style="width: auto;" display:fixed:> </picture>
		</div>
		<div class="PAbilities">
		<h2>Pokemon Abilities:</h2>
		<p>HyperBeam</p>
		<p>Leafyness</p>
		</div>

		<div class="PCatch">
		<h2>Catch Rate:</h2>
		<p>over 9000!</p>	
		</div>
		<div class="PStats">
		<h2>Stats</h2>




		
<v:forEach items="${AllPokemon}" var="v">
		<p id="HP">Health =  ${v.getHP()}</p>
		<p id="Att">Attack =  ${v.getNat()}</p>
		<p>Defence = </p>
		<p>Special Attack =</p>
		<p>Special Defence =</p>
		<p>Speed =</p>
		<p>Total Status Points =</p>
		</v:forEach>
		</div>
		<h1 class="PName">Pokemon Name</h1>
	</div>
	<div class="leftPage">
	<table>
	<tr>
	<td>document.getElementByName("Pokemon")</td>
	<td>Time</td>
	</tr>
	</table>
	</div>
	

	
	
	
	<div class="pokedex">
		<form method="POST" action="./pokedex">
			<table class="pokemonTable" border="1">
				<tr>
					<%-- Table Header --%>
					<th>ID</th>
					<th>Pokemon</th>
					<th>HP</th>
					<th>Type</th>
					<th>Type 2</th>
					<th>Colour</th>
					<th>Evolution Level</th>
				</tr>
				<form method="POST" action="./pokedex">
				<v:forEach items="${AllPokemon}" var="v">
					<tr>
						<%-- Get Variables --%>
						<td type="submit" id="Nat">${v.getNat()}</td>
						<td>${v.getPokemon()}</td>
						<td>${v.getHP()}</td>
						<td id="TypeI">${v.getTypeI()}</td>
						<td>${v.getTypeII()}</td>
						<td>${v.getColor()}</td>
						<td>${v.getEvolve()}</td>
						</td>
					</tr>
				</v:forEach>
				</form>
			</table>
		</form>
		<p id="demo"></p>
	</div>
	<script>
function myFunction(x) {
	var pokID = document.getElementById("Nat").innerHTML;
	 alert("Row index is: " + pokID[3]);
	}

var x = document.getElementsByName("Pokemon");



</script>	
</body>
</html>