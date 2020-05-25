package DAOs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



public class PokemonDao {

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
			String url = "jdbc:sqlite:Pokemon.db";
			conn = DriverManager.getConnection(url);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

		return conn;
	} 

	public  ArrayList<Pokemon> getAllPokemon() 
	{
		System.out.println("Retrieving all Pokemon records ...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "SELECT * FROM Pokemon"; //defines the SQL query selecting all records in the vehicles table
		ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>(); //creates an array of vehicles to store the database records for display

		try 
		{
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query); //this will execute the SQL query
			while(result.next())
			{
				int pokemon_id = result.getInt("pokemon_id");
				String pokemon_name = result.getString("pokemon_name");
				String pokemon_type = result.getString("pokemon_type");
				int number_evolutions = result.getInt("number_evolutions");
				int hit_points = result.getInt("hit_points");
				int power_points = result.getInt("power_points");
				boolean legendary = result.getBoolean("legendary");
				String weaknesses = result.getString("weaknesses");
				String strengths = result.getString("Strengths");
				int Evolution_level = result.getInt("Evolution_level");
				int catch_rate = result.getInt("catch_rate");
				int hatch_time = result.getInt("hatch_time");

				pokemonList.add(new  Pokemon(pokemon_id,pokemon_name,pokemon_type,number_evolutions,hit_points, power_points,legendary,weaknesses,strengths,Evolution_level,catch_rate,hatch_time));
			}
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage()); //If there is a error print message
		}

		return pokemonList;
	}


}
