//Edward Barclay
//12092603
package Servlets;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOs.Pokemon;
import DAOs.Pokemon2;
import DAOs.PokemonDBA;
import DAOs.PokemonDao;

public class ServletPokedexPractice extends HttpServlet 
{
	private static final long serialVersionUID=1L; //this is a universal version identifier to ensure the class corresponds correctly to a serialised object
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		//create a new Dao for both search and all pokemon 
		PokemonDBA dao = new PokemonDBA();
		PokemonDBA dao2 = new PokemonDBA();
		//create array lists containing the search results
		ArrayList<Pokemon2> AllPokemon;
		ArrayList<Pokemon2>SearchPokemonNat;
		try {
			//string that contains the value passed by myBtn
			String nat = req.getParameter("myBtn");
			//string containing the search that displays all pokemon which is overridden when the user chooses a type on the page. 
			String All = "Grass\" OR TypeI = \"Fire\" OR TypeI = \"Water\" OR TypeI = \"Bug\" OR TypeI = \"Normal\"  OR TypeI = \"Poison\" OR TypeI = \"Electric\"  OR TypeI = \"Ground\"  OR TypeI = \"Fighting\"  OR TypeI = \"Psychic\" OR TypeI = \"Rock\" OR TypeI = \"Ghost\" OR TypeI = \"Ice\" OR TypeI = \"Dragon\" OR TypeI = \"Dark\" OR TypeI = \"Steel\" OR TypeI = \"Flying";    
			//populates the array with the DB results passed through the searchPokemon function in the dao
			AllPokemon = dao.searchPokemon(All);
			//shows that id of the pokemon being searched for in the console for debugging.
			System.out.println("nat =" + nat);
			//populates the array with the DB results passed through the searchPokemonNat function in the dao
			SearchPokemonNat = dao2.searchPokemonNat(2);
			//creats request dispatchers for the Practice.jsp file
			RequestDispatcher view = req.getRequestDispatcher("Practice.jsp");
			RequestDispatcher search = req.getRequestDispatcher("Practice.jsp");
			//sets the information from the arrays in the request dispatcher 
			req.setAttribute("AllPokemon", AllPokemon);
			req.setAttribute("SearchPokemonNat", SearchPokemonNat);
			//forwards the search results to the page specified in the request dispatchers
			search.forward(req,resp);
			view.forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		//prints line to console veiw for debugging
		System.out.println("do post accesed");
		//set of strings used to store values forwarded from the forms in the Practice.jsp
		String action = req.getParameter("ACTION");
		String Form = req.getParameter("form1");
		String Type = req.getParameter("TypeIID");
		String Id = req.getParameter("POKEID");
		String Name = req.getParameter("PokeName");

		//if statments to handle each form in the Practice.jsp
		if(Type != null) //this will change the type of pokemon shown depending on the selection made by the user if a value is detected
		{
			try {
				System.out.println("allPokemon Started");
				PokemonDBA dao = new PokemonDBA();
				ArrayList<Pokemon2> AllPokemon;
				AllPokemon = dao.searchPokemon(Type);
				RequestDispatcher view = req.getRequestDispatcher("Practice.jsp");
				req.setAttribute("AllPokemon", AllPokemon);
				view.forward(req, resp);
				System.out.println("Allpokemon finished");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(Id != null) //if the user clicks the veiw details button this will detect the value of the button and forward that value to the next page to initiate a search
		{
			try {
				System.out.println("Search Started");
				PokemonDBA dao2 = new PokemonDBA();
				ArrayList<Pokemon2>SearchPokemonNat;
				SearchPokemonNat = dao2.searchPokemonNat(Id);
				RequestDispatcher search = req.getRequestDispatcher("PokeFile.jsp");
				req.setAttribute("SearchPokemonNat", SearchPokemonNat);
				search.forward(req,resp);
				System.out.println("Search finished");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(Name != null) //if the user has entered a string value into the search bar and presses the button handles the search for any pokemon containing said string
		{
			try {
				System.out.println("allPokemon Started");
				PokemonDBA dao = new PokemonDBA();
				ArrayList<Pokemon2> AllPokemon;
				AllPokemon = dao.searchPokemonName(Name);
				RequestDispatcher view = req.getRequestDispatcher("Practice.jsp");
				req.setAttribute("AllPokemon", AllPokemon);
				view.forward(req, resp);
				System.out.println("Allpokemon finished");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else//if no values are detected and a form is submitted then the page will refresh to its default setting
		{
			PokemonDBA dao = new PokemonDBA();
			PokemonDBA dao2 = new PokemonDBA();
			ArrayList<Pokemon2> AllPokemon;
			ArrayList<Pokemon2>SearchPokemonNat;
			try {
				String nat = req.getParameter("myBtn");
				String All = "Grass\" OR TypeI = \"Fire\" OR TypeI = \"Water\" OR TypeI = \"Bug\" OR TypeI = \"Normal\"  OR TypeI = \"Poison\" OR TypeI = \"Electric\"  OR TypeI = \"Ground\"  OR TypeI = \"Fighting\"  OR TypeI = \"Psychic\" OR TypeI = \"Rock\" OR TypeI = \"Ghost\" OR TypeI = \"Ice\" OR TypeI = \"Dragon\" OR TypeI = \"Dark\" OR TypeI = \"Steel\" OR TypeI = \"Flying";    
				AllPokemon = dao.searchPokemon(All);
				System.out.println("nat =" + nat);
				SearchPokemonNat = dao2.searchPokemonNat(2);
				RequestDispatcher view = req.getRequestDispatcher("Practice.jsp");
				RequestDispatcher search = req.getRequestDispatcher("Practice.jsp");
				req.setAttribute("AllPokemon", AllPokemon);
				req.setAttribute("SearchPokemonNat", SearchPokemonNat);
				search.forward(req,resp);
				view.forward(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	