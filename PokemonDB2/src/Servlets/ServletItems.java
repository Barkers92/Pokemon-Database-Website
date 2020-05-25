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

public class ServletItems extends HttpServlet 
{
	private static final long serialVersionUID=1L; //this is a universal version identifier to ensure the class corresponds correctly to a serialised object
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PokemonDBA dao = new PokemonDBA();
		PokemonDBA dao2 = new PokemonDBA();
		ArrayList<Pokemon> AllItems;
		ArrayList<Pokemon2>SearchPokemonNat;
		try {
			AllItems = dao.getAllItems();
			SearchPokemonNat = dao2.searchPokemonNat(2);
			RequestDispatcher view = req.getRequestDispatcher("Practice.jsp");
			RequestDispatcher search = req.getRequestDispatcher("Practice.jsp");
			req.setAttribute("AllItems", AllItems);
			req.setAttribute("SearchPokemonNat", SearchPokemonNat);
			search.forward(req,resp);
			view.forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean stringContainsNumber(String s)
	{
		Pattern p = Pattern.compile( "[0-9]");
		Matcher m = p.matcher( s );
		
		return m.find();
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("do post delete accesed");
		
		String action = req.getParameter("ACTION");
		String Form = req.getParameter("form1");
		String Type = req.getParameter("TypeIID");
		String Id = req.getParameter("POKEID");
		String Name = req.getParameter("PokeName");
		System.out.println("do post delete accesed");
		
		if(Type != null)
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
		else if(Id != null)
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
		else if(Name != null)
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
		else
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
	