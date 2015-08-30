package server.service;

import java.util.ArrayList;

import javax.jws.WebService;

import server.dao.MoviesDAO;
import server.model.Movie;

@WebService(endpointInterface = "server.service.MoviesService")
public class MoviesServiceImpl implements MoviesService {
	
	public MoviesServiceImpl() {
		super();
	}

	private MoviesDAO moviesDAO;
	
	@Override
	public String getMovies() {
		moviesDAO = new MoviesDAO();
		ArrayList<Movie> movies = moviesDAO.get();
		String formatedMovies = "";
		for (Movie movie : movies) {
			formatedMovies = formatedMovies + " -- Filme: " + movie.getName();
		}
		return formatedMovies;
	}

	@Override
	public Boolean insertMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteMovie(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

}
