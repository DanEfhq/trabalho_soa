package server.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import server.model.Movie;

@WebService
@SOAPBinding(style = Style.RPC)
public interface MoviesService {
	
	@WebMethod ArrayList<Movie> getMovies();
	
	@WebMethod Boolean insertMovie(Movie movie);
	
	@WebMethod Boolean deleteMovie(int id);
	
	@WebMethod Movie updateMovie(Movie movie);
	
}
