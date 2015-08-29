package server.service;

import java.util.ArrayList;

import javax.jws.WebService;

import server.dao.MoviesDAO;
import server.model.Movie;

@WebService(endpointInterface = "movies.MoviesServer")
public class MoviesServiceImpl implements MoviesService {
	
	private MoviesDAO moviesDAO;
	
	@Override
	public ArrayList<Movie> getMovies() {
		moviesDAO = new MoviesDAO();
		ArrayList<Movie> movies = moviesDAO.get();
		return movies;
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
