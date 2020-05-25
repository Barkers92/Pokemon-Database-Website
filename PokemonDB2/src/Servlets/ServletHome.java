//Edward Barclay
//12092603
package Servlets;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOs.Pokemon;
import DAOs.Pokemon2;
import DAOs.PokemonDBA;
import DAOs.PokemonDao;

public class ServletHome extends HttpServlet 
{
private static final long serialVersionUID=1L; //this is a universal version identifier to ensure the class corresponds correctly to a serialised object
@Override 
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
	PokemonDBA dao = new PokemonDBA();
	
	ArrayList<Pokemon2> AllPokemon;
	try {
		String All = "Grass\" OR TypeI = \"Fire\" OR TypeI = \"Water\" OR TypeI = \"Bug\" OR TypeI = \"Normal\"  OR TypeI = \"Poison\" OR TypeI = \"Electric\"  OR TypeI = \"Ground\"  OR TypeI = \"Fighting\"  OR TypeI = \"Psychic\" OR TypeI = \"Rock\" OR TypeI = \"Ghost\" OR TypeI = \"Ice\" OR TypeI = \"Dragon\" OR TypeI = \"Dark\" OR TypeI = \"Steel\" OR TypeI = \"Flying";    
		AllPokemon = dao.searchPokemon(All);
		RequestDispatcher view = req.getRequestDispatcher("Practice.jsp");
		req.setAttribute("AllPokemon", AllPokemon);
		view.forward(req, resp);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
System.out.println("do post delete accesed");


		String Type = req.getParameter("TypeIID");
		
		PokemonDBA dao = new PokemonDBA();
		ArrayList<Pokemon2> AllPokemon;
		try {
			AllPokemon = dao.searchPokemon(Type);
			RequestDispatcher view = req.getRequestDispatcher("Practice.jsp");
			req.setAttribute("AllPokemon", AllPokemon);
			view.forward(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
	