<%@ page contentType="text/html"%>
<%@ page import="java.sql.*"%>
<%@ page import="org.sqlite.*"%>

<html>
<head>
<meta charset="UTF-8">
<meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>
<meta <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v"%>>
<%-- Tag Library --%>
<title>Ultimate Pok�mon Database</title>
<style>
.PAbilities {
	position: absolute;
	left: 70%;
	top: 20%;
	font-size: 24;
}

.PCatch {
	position: absolute;
	left: 50%;
	top: 20%;
	font-size: 24;
}

.PStats {
	position: absolute;
	left: 30%;
	top: 20%;
	font-size: 24;
}

p {
	align: center;
}

.pokeIdCard {
	display: inline-block;
	border-style: solid;
	text-align: center;
	font-size: 24;
	width: 24%;
}

.PokePlain {
	position: absolute;
	background-image: url("images/background2.jpg");
	background-position: static;
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
	width: 56.5%;
	top: 20%;
	right: 21.75%;
}

body {
	background-image: url("PBackgroundTemp.jpg");
	background-position: static;
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
}

.TitleDiv {
	position: absolute;
	text-align: center;
	right: 21.75%;
	top: 2%;
	width: 56.5%;
	font-size: 100px;
}

.SearchBarDiv {
	position: absolute;
	text-align: center;
	right: 21.75%;
	top: 17%;
	width: 56.5%;
}

.PokePic {
	width: 100px;
	height: 100px;
}

.SearchBarDiv {
	background-color: #FFF973;
	display: inline;
}

#typeSearch {
	float: left;
}

#nameSearch {
	float: right;
}
#TitleDiv
{
position:absolute;
padding-left:12%;
}
#goUp
{
position:fixed;
width:10%;
height:10%;
padding-left:80%;
padding-top:43%;
display: none;
}
</style>
<link rel="shortcut icon" href="images\EthansTabIcon.ico"
	type="image/x-icon" />
<form method="POST" action="./PokeFile" target="_blank" id="form2">
</form>
</head>
<body>
	<div id="TitleDiv"><picture id="poke_Title"> <img 
					src="images/pokemondb.png" alt="Title"
					> </picture></div>
	<div class="SearchBarDiv">
		<div id="typeSearch">
			<form method="POST" action="./Practice" id="form1">
				<table id="SearchTable">
					<tr>
						<th>Filters</th>
						<th>Type <select Name="TypeIID">
								<option
									value='Grass" OR TypeI="Fire" OR TypeI="Water" OR
								TypeI="Bug" OR TypeI="Normal" OR TypeI="Poison" OR
								TypeI="Electric" OR TypeI="Ground" OR TypeI="Fighting" OR
								TypeI="Psychic" OR TypeI="Rock" OR TypeI="Ghost" OR TypeI="Ice"
								OR TypeI="Dragon" OR TypeI="Dark" OR TypeI="Steel" OR
								TypeI="Flying'>Select
									Type</option>
								<option
									value='Grass" OR TypeI="Fire" OR TypeI="Water" OR
								TypeI="Bug" OR TypeI="Normal" OR TypeI="Poison" OR
								TypeI="Electric" OR TypeI="Ground" OR TypeI="Fighting" OR
								TypeI="Psychic" OR TypeI="Rock" OR TypeI="Ghost" OR TypeI="Ice"
								OR TypeI="Dragon" OR TypeI="Dark" OR TypeI="Steel" OR
								TypeI="Flying'>All</option>
								<option value="Grass">Grass</option>
								<option value="Fire">Fire</option>
								<option value="Water">Water</option>
								<option value="Bug">Bug</option>
								<option value="Normal">Normal</option>
								<option value="Poison">Poison</option>
								<option value="Electric">Electric</option>
								<option value="Ground">Ground</option>
								<option value="Fighting">Fighting</option>
								<option value="Psychic">Psychic</option>
								<option value="Rock">Rock</option>
								<option value="Ghost">Ghost</option>
								<option value="Ice">Ice</option>
								<option value="Dragon">Dragon</option>
								<option value="Dark">Dark</option>
								<option value="Steel">Steel</option>
								<option value=Flying>Flying</option>
						</select>
							<button type="submit" size="20">Apply Filter</button>
						</th>
					</tr>
				</table>
			</form>
		</div>
		<div id="nameSearch">
			<table>
				<th>
					<form method="POST" action="./Practice" id="form3">
						Pokemon Name: <input type="text" name="PokeName">
						<button type="submit" size="20">Search</button>
					</form>
				</th>
			</table>
		</div>
	</div>
	<div class="PokePlain">
		<v:forEach items="${AllPokemon}" var="v">
			<div class="pokeIdCard">
				<picture id="poke_id" class="pic"> <img class="PokePic"
					src="images\pokemon/${v.getNat()}.png" alt="Pokemon"
					style="width: auto;" display:fixed: > </picture>
				<br /> ${v.getPokemon()}<br /> HP = ${v.getHP()}<br /> Type 1 =
				${v.getTypeI()}<br /> Type 2 = ${v.getTypeII()}<br />
				${v.getNat()} <br />
				<button type="submit" name="POKEID" form="form2"
					value="${v.getNat()}" class="LoadPage">View Details</button>
			</div>
		</v:forEach>
	</div>
		<div id="UpArrow" >
		<picture > 
		<img id="goUp" src="images/UpArrow2.png" alt="UpArrow" onclick="myFunction()">
					 </picture>
					 </div>
		
	
</body>
<script>

window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    document.getElementById("goUp").style.display = "block";
  } else {
    document.getElementById("goUp").style.display = "none";
  }
}

function myFunction() {
	document.body.scrollTop = 0; 
	}

</script>
</html>