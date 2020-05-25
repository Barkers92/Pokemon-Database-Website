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

public class ServletPokefile extends HttpServlet 
{
	private static final long serialVersionUID=1L; //this is a universal version identifier to ensure the class corresponds correctly to a serialised object
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{


			PokemonDBA dao = new PokemonDBA();
			String find = req.getParameter("myBtn");
			String nat = "2";
			ArrayList<Pokemon2> SearchPokemon;
			try {
				SearchPokemon = dao.searchPokemonNat(nat);
				RequestDispatcher view = req.getRequestDispatcher("PokeFile.jsp");
				req.setAttribute("SearchPokemon", SearchPokemon);
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
		String Id = req.getParameter("POKEID");
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
}
	