<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>
<meta <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v"%>>
<link rel="stylesheet" href="site.css">
<%-- Tag Library --%>
<title>Ultimate Pokémon Database</title>
<style>
#Pokegamepage {
	position: fixed;
	top: 33%;
	left: 17%;
}

.navGame {
	position: fixed;
	top: 86.4%;
	left: 56.6%;
	width:18.2%;
	height: 73px;
	font-size:20px;
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
	font-size:20px;
	background: transparent;
	border: none;	
	text-decoration: none;
	color: #FFF;
	text-align: center;
	line-height: 73px;
}
.PokemonGuessInput {
	position: fixed;
	width: 37%;
	top: 85.2%;
	left: 13.4%;
	height: 54px;
	background: transparent;
	border: none;
	text-align: center;
	font-size: 20px;
	width: 21%;
}
.PokemonGuessInputSubmit {
	position: fixed;
	width: 1.5%;
	top: 85.6%;
	left: 34.4%;
	height: 54px;
}
.PokemonGuessInputGuess {
	position: fixed;
	top: 83.2%;
	left: 13.4%;
}
#pic
{
filter:brightness(0%);
}
#picShown
{
filter:brightness(100%);
}
</style>
<link rel="shortcut icon" href="images\EthansTabIcon.ico"
	type="image/x-icon" />
<title>Ultimate Pokémon Game</title>
</head>
<body>
	<div id="Pokegamepage">
		<img id="pic" class="image"
			src="images/pokemon/${SelectedPokemon.getNat()}.png; alt="${SelectedPokemon.getPokemon()}">
	</div>
	
		<div class="PokemonGuessInputGuess">Guess:</div>
		<input type="text" id="PokemonInput" name="PokemonGuessBox" value="" class="PokemonGuessInput"> 
		<button class="PokemonGuessInputSubmit" onClick="myFunction()"></button>

	<a class="navGame" href="Pokedexgame">Who's that Pokémon!</a>

	<a class="navDex" href="Practice">Pokédex</a>
	
	<script type="text/javascript">

	function myFunction(){
		<% %>
		var x = document.getElementById("PokemonInput").value; 
		if ("${SelectedPokemon.getPokemon()}" == x)
		{ 
			alert("Correct! Pokemon name is: " + "${SelectedPokemon.getPokemon()}");	
		}
		else 
		{ 
			alert("Incorrect! That pokemon is: " + "${SelectedPokemon.getPokemon()}");	
		}
		
		document.getElementById("pic").id ;
		pic.id = "#picShown";
		<% %>
	}
	</script>
</body>
</html>