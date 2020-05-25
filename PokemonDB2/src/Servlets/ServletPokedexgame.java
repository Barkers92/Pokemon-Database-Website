package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOs.Pokemon2;
import DAOs.PokemonDBA;

public class ServletPokedexgame extends HttpServlet 
{
	private static final long serialVersionUID=1L; //this is a universal version identifier to ensure the class corresponds correctly to a serialised object
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{	
		PokemonDBA dao = new PokemonDBA();
		Pokemon2 SelectedPokemon;
		try {
			SelectedPokemon = dao.RandPokemon();
			RequestDispatcher view = req.getRequestDispatcher("Pokedexgame.jsp");
			req.setAttribute("SelectedPokemon", SelectedPokemon);
			view.forward(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{		
		String action = req.getParameter("ACTION");
		String Form = req.getParameter("form1");
		String Type = req.getParameter("TypeIID");
		String Id = req.getParameter("SelectedPokemon.Nat");
		
		
		
		
		PokemonDBA dao = new PokemonDBA();
		Pokemon2 SelectedPokemon;
		try {
			SelectedPokemon = dao.RandPokemon();
			RequestDispatcher view = req.getRequestDispatcher("Pokedexgame.jsp");
			req.setAttribute("SelectedPokemon", SelectedPokemon);
			System.out.println("post");
			view.forward(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

