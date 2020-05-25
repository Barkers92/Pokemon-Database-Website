package Controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import DAOs.Pokemon;
import DAOs.Pokemon2;
import DAOs.PokemonDBA;
import DAOs.PokemonDao;


public class Controller {

	public static void main(String[] args) throws SQLException {
		PokemonDBA dao = new PokemonDBA(); 

		ArrayList<Pokemon2> allPokemon =null; //create empty array

		Scanner reader = new Scanner(System.in);
		
		int option = 0;
		boolean restart = true;
		
		while(restart == true)
		{

		System.out.println("PokemonDB test console");
		System.out.println("----------------------------------");
		System.out.println("1-veiw all records");
		System.out.println("2-Search records");
		System.out.println("3-insert new pokemon");
		System.out.println("4-Delete Pokemon");
		System.out.println("5-Update a pokemon");
		System.out.println("6-Exit");
		System.out.println("----------------------------------");
		System.out.println("Please enter choice >");
		option = reader.nextInt();
		
		
		
		switch(option) //switch statement for the CRUD methods
		{
		case 1:
			allPokemon = dao.getAllPokemon();
			for(Pokemon2 p : allPokemon)
			{
				System.out.println("-----------------------------------");
				System.out.println(p);
			}
			break;
		case 2:
			allPokemon = dao.searchPokemonNat(2);
			for(Pokemon2 d : allPokemon)
			{
				System.out.println("-----------------------------------");
				System.out.println(d);
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		default:
			break;
		}
	}
	}

}
