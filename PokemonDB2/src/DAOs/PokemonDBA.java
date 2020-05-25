package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class PokemonDBA {
	
	Scanner reader = new Scanner(System.in);	//allows users inputted data to be stored
	Connection c = null;
	Statement s = null;
	ResultSet r = null;

	//method used to secure connection
	private static Connection getDBConnection()
	{
		Connection conn = null;

		try
		{
			Class.forName("org.sqlite.JDBC");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

		try
		{
			String url = "jdbc:sqlite:pokemon2.db";
			conn = DriverManager.getConnection(url);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

		return conn;
	} 

	private static Connection getDBConnection2()
	{
		Connection conn2 = null;

		try
		{
			Class.forName("org.sqlite.JDBC");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

		try
		{
			String url = "jdbc:sqlite:PokeGeneral.sqlite";
			conn2 = DriverManager.getConnection(url);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

		return conn2;
	} 
			
	
	
	public  ArrayList<Pokemon> getAllItems() 
	{
		System.out.println("Retrieving all Pokemon records ...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "SELECT * FROM items"; //defines the SQL query selecting all records in the vehicles table
		ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>(); //creates an array of vehicles to store the database records for display

		try 
		{
			dbConnection = getDBConnection2();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query); //this will execute the SQL query
			while(result.next())
			{
				int id = result.getInt("id");
				String identifier = result.getString("identifier");
				int cost = result.getInt("cost");
				
				pokemonList.add(new  Pokemon(id,identifier,identifier, cost, cost, cost, false, identifier, identifier, cost, cost, cost));
			}
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage()); //If there is a error print message
		}
		return pokemonList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ArrayList<Pokemon2> searchPokemon(String typeI) throws SQLException
	{
		//System.out.print("Please enter the Pokemon ID you wish to search for: ");
		//	typeI = reader.next();
		System.out.println("Searching Pokemon records ...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "Select * FROM PokemonDB WHERE TypeI = \""+typeI+"\" OR TypeII = \""+typeI+"\"";
		System.out.println(query);
		ArrayList<Pokemon2> Search = new ArrayList<Pokemon2>();

		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			while(result.next())
			{
				int Per = result.getInt("Per");
				int Nat = result.getInt("Nat");
				String Pokemon = result.getString("Pokemon");
				int HP = result.getInt("HP");
				int Atk = result.getInt("Atk");
				int Def = result.getInt("Def");
				int SpA = result.getInt("SpA");
				int SpD = result.getInt("SpD");
				int Spe = result.getInt("Spe");
				int Total = result.getInt("Total");
				String TypeI = result.getString("TypeI");
				String TypeII = result.getString("TypeII");
				String Tier = result.getString("Tier");
				String AbilityI = result.getString("AbilityI");
				String AbilityII = result.getString("AbilityII");
				String HiddenAbility = result.getString("HiddenAbility");
				int LKGK = result.getInt("LK/GK");
				String EVWorth = result.getString("EVWorth");
				int EXPV = result.getInt("EXPV");
				String Color = result.getString("Color");
				int Hatch = result.getInt("Hatch");
				String Gender = result.getString("Gender");
				String EggGroupI = result.getString("EggGroupI");
				String EggGroupII = result.getString("EggGroupII");
				int Catch = result.getInt("Catch");
				int EXP = result.getInt("EXP");
				String Evolve = result.getString("Evolve");
				
				Search.add(new Pokemon2(Per,Nat,Pokemon,HP,Atk, Def,SpA,SpD,Spe,Total,TypeI,
						TypeII,Tier,AbilityI,AbilityII,HiddenAbility,LKGK,EVWorth,EXPV,Color,Hatch,Gender,
						EggGroupI,EggGroupII,Catch,EXP,Evolve));
			}
		}
		finally
		{
			if(result != null)
				result.close();
			if(statement != null)
				statement.close();
			if(dbConnection != null)
				dbConnection.close();
		}

		return Search;
	}
	
	
	public ArrayList<Pokemon2> searchPokemonNat(int nat) throws SQLException
	{
		//System.out.print("Please enter the Pokemon ID you wish to search for: ");
		//	typeI = reader.next();
		System.out.println("Searching Pokemon records ...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "Select * FROM PokemonDB WHERE nat = \""+nat+"\"";
		System.out.println(query);
		ArrayList<Pokemon2> Search = new ArrayList<Pokemon2>();

		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			while(result.next())
			{
				int Per = result.getInt("Per");
				int Nat = result.getInt("Nat");
				String Pokemon = result.getString("Pokemon");
				int HP = result.getInt("HP");
				int Atk = result.getInt("Atk");
				int Def = result.getInt("Def");
				int SpA = result.getInt("SpA");
				int SpD = result.getInt("SpD");
				int Spe = result.getInt("Spe");
				int Total = result.getInt("Total");
				String TypeI = result.getString("TypeI");
				String TypeII = result.getString("TypeII");
				String Tier = result.getString("Tier");
				String AbilityI = result.getString("AbilityI");
				String AbilityII = result.getString("AbilityII");
				String HiddenAbility = result.getString("HiddenAbility");
				int LKGK = result.getInt("LK/GK");
				String EVWorth = result.getString("EVWorth");
				int EXPV = result.getInt("EXPV");
				String Color = result.getString("Color");
				int Hatch = result.getInt("Hatch");
				String Gender = result.getString("Gender");
				String EggGroupI = result.getString("EggGroupI");
				String EggGroupII = result.getString("EggGroupII");
				int Catch = result.getInt("Catch");
				int EXP = result.getInt("EXP");
				String Evolve = result.getString("Evolve");
				
				Search.add(new Pokemon2(Per,Nat,Pokemon,HP,Atk, Def,SpA,SpD,Spe,Total,TypeI,
						TypeII,Tier,AbilityI,AbilityII,HiddenAbility,LKGK,EVWorth,EXPV,Color,Hatch,Gender,
						EggGroupI,EggGroupII,Catch,EXP,Evolve));
			}
		}
		finally
		{
			if(result != null)
				result.close();
			if(statement != null)
				statement.close();
			if(dbConnection != null)
				dbConnection.close();
		}

		return Search;
	}
	
	public ArrayList<Pokemon2> searchPokemonNat(String nat) throws SQLException
	{
		//System.out.print("Please enter the Pokemon ID you wish to search for: ");
		//	typeI = reader.next();
		System.out.println("Searching Pokemon records ...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "Select * FROM PokemonDB WHERE nat = \""+nat+"\"";
		System.out.println(query);
		ArrayList<Pokemon2> Search = new ArrayList<Pokemon2>();

		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			while(result.next())
			{
				int Per = result.getInt("Per");
				int Nat = result.getInt("Nat");
				String Pokemon = result.getString("Pokemon");
				int HP = result.getInt("HP");
				int Atk = result.getInt("Atk");
				int Def = result.getInt("Def");
				int SpA = result.getInt("SpA");
				int SpD = result.getInt("SpD");
				int Spe = result.getInt("Spe");
				int Total = result.getInt("Total");
				String TypeI = result.getString("TypeI");
				String TypeII = result.getString("TypeII");
				String Tier = result.getString("Tier");
				String AbilityI = result.getString("AbilityI");
				String AbilityII = result.getString("AbilityII");
				String HiddenAbility = result.getString("HiddenAbility");
				int LKGK = result.getInt("LK/GK");
				String EVWorth = result.getString("EVWorth");
				int EXPV = result.getInt("EXPV");
				String Color = result.getString("Color");
				int Hatch = result.getInt("Hatch");
				String Gender = result.getString("Gender");
				String EggGroupI = result.getString("EggGroupI");
				String EggGroupII = result.getString("EggGroupII");
				int Catch = result.getInt("Catch");
				int EXP = result.getInt("EXP");
				String Evolve = result.getString("Evolve");
				
				Search.add(new Pokemon2(Per,Nat,Pokemon,HP,Atk, Def,SpA,SpD,Spe,Total,TypeI,
						TypeII,Tier,AbilityI,AbilityII,HiddenAbility,LKGK,EVWorth,EXPV,Color,Hatch,Gender,
						EggGroupI,EggGroupII,Catch,EXP,Evolve));
			}
		}
		finally
		{
			if(result != null)
				result.close();
			if(statement != null)
				statement.close();
			if(dbConnection != null)
				dbConnection.close();
		}

		return Search;
	}
	
	
	public ArrayList<Pokemon2> searchPokemonName(String name) throws SQLException
	{
		//System.out.print("Please enter the Pokemon ID you wish to search for: ");
		//	typeI = reader.next();
		System.out.println("Searching Pokemon records ...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "SELECT * FROM PokemonDB where Pokemon like '%"+name+"%'";
		System.out.println(query);
		ArrayList<Pokemon2> Search = new ArrayList<Pokemon2>();

		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			while(result.next())
			{
				int Per = result.getInt("Per");
				int Nat = result.getInt("Nat");
				String Pokemon = result.getString("Pokemon");
				int HP = result.getInt("HP");
				int Atk = result.getInt("Atk");
				int Def = result.getInt("Def");
				int SpA = result.getInt("SpA");
				int SpD = result.getInt("SpD");
				int Spe = result.getInt("Spe");
				int Total = result.getInt("Total");
				String TypeI = result.getString("TypeI");
				String TypeII = result.getString("TypeII");
				String Tier = result.getString("Tier");
				String AbilityI = result.getString("AbilityI");
				String AbilityII = result.getString("AbilityII");
				String HiddenAbility = result.getString("HiddenAbility");
				int LKGK = result.getInt("LK/GK");
				String EVWorth = result.getString("EVWorth");
				int EXPV = result.getInt("EXPV");
				String Color = result.getString("Color");
				int Hatch = result.getInt("Hatch");
				String Gender = result.getString("Gender");
				String EggGroupI = result.getString("EggGroupI");
				String EggGroupII = result.getString("EggGroupII");
				int Catch = result.getInt("Catch");
				int EXP = result.getInt("EXP");
				String Evolve = result.getString("Evolve");
				
				Search.add(new Pokemon2(Per,Nat,Pokemon,HP,Atk, Def,SpA,SpD,Spe,Total,TypeI,
						TypeII,Tier,AbilityI,AbilityII,HiddenAbility,LKGK,EVWorth,EXPV,Color,Hatch,Gender,
						EggGroupI,EggGroupII,Catch,EXP,Evolve));
			}
		}
		finally
		{
			if(result != null)
				result.close();
			if(statement != null)
				statement.close();
			if(dbConnection != null)
				dbConnection.close();
		}

		return Search;
	}
	
	
	
	
	
	
	public  ArrayList<Pokemon2> getAllPokemon() 
	{
		System.out.println("Retrieving all Pokemon records ...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "SELECT * FROM PokemonDB"; //defines the SQL query selecting all records in the vehicles table
		ArrayList<Pokemon2> pokemonList = new ArrayList<Pokemon2>(); //creates an array of vehicles to store the database records for display

		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query); //this will execute the SQL query
			while(result.next())
			{
				int Per = result.getInt("Per");
				int Nat = result.getInt("Nat");
				String Pokemon = result.getString("Pokemon");
				int HP = result.getInt("HP");
				int Atk = result.getInt("Atk");
				int Def = result.getInt("Def");
				int SpA = result.getInt("SpA");
				int SpD = result.getInt("SpD");
				int Spe = result.getInt("Spe");
				int Total = result.getInt("Total");
				String TypeI = result.getString("TypeI");
				String TypeII = result.getString("TypeII");
				String Tier = result.getString("Tier");
				String AbilityI = result.getString("AbilityI");
				String AbilityII = result.getString("AbilityII");
				String HiddenAbility = result.getString("HiddenAbility");
				int LKGK = result.getInt("LK/GK");
				String EVWorth = result.getString("EVWorth");
				int EXPV = result.getInt("EXPV");
				String Color = result.getString("Color");
				int Hatch = result.getInt("Hatch");
				String Gender = result.getString("Gender");
				String EggGroupI = result.getString("EggGroupI");
				String EggGroupII = result.getString("EggGroupII");
				int Catch = result.getInt("Catch");
				int EXP = result.getInt("EXP");
				String Evolve = result.getString("Evolve");
				
				pokemonList.add(new  Pokemon2(Per,Nat,Pokemon,HP,Atk, Def,SpA,SpD,Spe,Total,TypeI,TypeII,
						Tier,AbilityI,AbilityII,HiddenAbility,LKGK,EVWorth,EXPV,Color,Hatch,Gender,EggGroupI,EggGroupII,
						Catch,EXP,Evolve));
			}
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage()); //If there is a error print message
		}
		return pokemonList;
	}
	
	public Pokemon2 RandPokemon() throws SQLException 
	{
		Random rand = null;
		int randomPokemon = ThreadLocalRandom.current().nextInt(1, 649 + 1);
	    Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "SELECT * FROM PokemonDB WHERE Nat='"+randomPokemon+"';";
		Pokemon2 PokemonRand = new Pokemon2();
		dbConnection = getDBConnection();
		statement = dbConnection.createStatement();
		System.out.println("DBQuery = " + query);
		result = statement.executeQuery(query);
		try {
		PokemonRand.Per = result.getInt("Per");
		PokemonRand.Nat = result.getInt("Nat");
		PokemonRand.Pokemon = result.getString("Pokemon");
		PokemonRand.HP = result.getInt("HP");
		PokemonRand.Atk = result.getInt("Atk");
		PokemonRand.Def = result.getInt("Def");
		PokemonRand.SpA = result.getInt("SpA");
		PokemonRand.SpD = result.getInt("SpD");
		PokemonRand.Spe = result.getInt("Spe");
		PokemonRand.Total = result.getInt("Total");
		PokemonRand.TypeI = result.getString("TypeI");
		PokemonRand.TypeII = result.getString("TypeII");
		PokemonRand.Tier = result.getString("Tier");
		PokemonRand.AbilityI = result.getString("AbilityI");
		PokemonRand.AbilityII = result.getString("AbilityII");
		PokemonRand.HiddenAbility = result.getString("HiddenAbility");
		PokemonRand.LKGK = result.getInt("LK/GK");
		PokemonRand.EVWorth = result.getString("EVWorth");
		PokemonRand.EXPV = result.getInt("EXPV");
		PokemonRand.Color = result.getString("Color");
		PokemonRand.Hatch = result.getInt("Hatch");
		PokemonRand.Gender = result.getString("Gender");
		PokemonRand.EggGroupI = result.getString("EggGroupI");
		PokemonRand.EggGroupII = result.getString("EggGroupII");
		PokemonRand.Catch = result.getInt("Catch");
		PokemonRand.EXP = result.getInt("EXP");
		PokemonRand.Evolve = result.getString("Evolve");
		
		}
	    catch (SQLException e) 
		{
			System.out.println(e.getMessage()); //If there is a error print message
		}		    
	    return PokemonRand;
	}
	

}
