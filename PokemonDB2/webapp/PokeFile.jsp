<html>
<head>
<meta charset="UTF-8">
<meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>
<meta <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v"%>>
<%-- Tag Library --%>
<style>
body {
	background-image: url('Ethanpokedex2.png');
	background-position: fixed;
	background-repeat: no-repeat;
	background-size: 100vw 100vh;
}

#infoPage {
	position: fixed;
	width: 90%;
	height: 48%;
	top: 25%;
	left: 6.5%;
}

#infoPageLeft {
	position: absolute;
	left: 13%;
	top: 5%;
	font-size: 24;
}

#pokePic {
top:10%;
	position: absolute;
	width: 150px;
	height: 150px;
}

#PokeID {
	position: absolute;
	top: 49%;
	left: 2%;
}

#infoPageRight {
	position: absolute;
	top: 6%;
	left: 56%;
}

#statTable {
	color: white;
}

.statCell {
	width: 50px;
	text-align: center;
}

.MainStats {
	height: 35px;
}

.navGame {
	position: fixed;
	top: 86.4%;
	left: 56.6%;
	width: 18.2%;
	height: 73px;
	font-size: 20px;
	background: transparent;
	border: none;
	text-decoration: none;
	color: #FFF;
	text-align: center;
	line-height: 73px;
}

.navDex {
	position: fixed;
	top: 86.4%;
	left: 77.9%;
	width: 18.2%;
	height: 73px;
	font-size: 20px;
	background: transparent;
	border: none;
	text-decoration: none;
	color: #FFF;
	text-align: center;
	line-height: 73px;
}
</style>
<link rel="shortcut icon" href="images\EthansTabIcon.ico"
	type="image/x-icon" />
<title>Ultimate Pokémon Database</title>
</head>
<body>
	<div id="infoPage">
		<v:forEach items="${SearchPokemonNat}" var="v">
			<picture class="pic"> <img id="pokePic"
				src="images\pokemon/${v.getNat()}.png" alt="Pokemon"
				style="width: auto;" display:fixed: onclick="myFunction()"> </picture>
			<article id="PokeID">
				<table>
					<tr>
						<th>${v.getPokemon()}</th>
					</tr>
					<tr>
						<th>${v.getNat()}</th>
					</tr>
					<tr>
						<th>colour: ${v.getColor()}</th>
					</tr>
				</table>
			</article>
			<article id="infoPageLeft">
				<p>${v.getPokemon()}</p>
				<table>
					<tr>
						<td class="MainStats">Type I: ${v.getTypeI()}</td>
					</tr>
					<tr>
						<td class="MainStats">Type II: ${v.getTypeII()}</td>
					</tr>
					<tr>
						<td class="MainStats">Ability I: ${v.getAbilityI()}</td>
					</tr>
					<tr>
						<td class="MainStats">Ability II: ${v.getAbilityII()}</td>
					</tr>
					<tr>
						<td class="MainStats">Hidden Ability: ${v.getHiddenAbility()}</td>
					</tr>
					<tr>
						<td class="MainStats">Evolution threshold : ${v.getEvolve()}</td>
					</tr>
				</table>
			</article>
			<article id="infoPageRight">
				<table id="statTable">
					<tr>
						<th class="statCell">HP</th>
						<th class="statCell">Atk</th>
						<th class="statCell">Def</th>
					</tr>
					<tr>
						<td class="statCell">${v.getHP()}</td>
						<td class="statCell">${v.getAtk()}</td>
						<td class="statCell">${v.getDef()}</td>
					</tr>
					<tr>
						<th class="statCell">Spe</th>
						<th class="statCell">SpA</th>
						<th class="statCell">SpD</th>
					</tr>
					<tr>
						<td class="statCell">${v.getSpe()}</td>
						<td class="statCell">${v.getSpA()}</td>
						<td class="statCell">${v.getSpD()}</td>
					</tr>
				</table>
			</article>
		</v:forEach>
	</div>
	<a class="navGame" href="Pokedexgame">Who's that Pokémon!</a>

	<a class="navDex" href="Practice">Pokédex</a>


</body>
</html>