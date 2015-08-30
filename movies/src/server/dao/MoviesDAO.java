package server.dao;

import java.util.ArrayList;
import java.util.Date;

import server.model.Movie;

public class MoviesDAO {
	
	public ArrayList<Movie> get(){
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		Movie avengers = new Movie();
		Movie avengers2 = new Movie();
		Movie theAmazingSpiderMan = new Movie();
		
		avengers.setName("Avengers");
		avengers.setAnoLancamento(new Date());
		avengers.setDiretor("Danilo");
		avengers.setElenco("The best");
		avengers.setGenero("Action");
		
		avengers2.setName("Avengers - Age of Ultron");
		avengers2.setAnoLancamento(new Date());
		avengers2.setDiretor("Leonardo");
		avengers2.setElenco("The best");
		avengers2.setGenero("Action");
		
		theAmazingSpiderMan.setName("The Amazing Spiderman");
		theAmazingSpiderMan.setAnoLancamento(new Date());
		theAmazingSpiderMan.setDiretor("Danilo");
		theAmazingSpiderMan.setElenco("The best");
		theAmazingSpiderMan.setGenero("Action");
		
		movies.add(avengers);
		movies.add(avengers2);
		movies.add(theAmazingSpiderMan);
		
		return movies;
	}

}
