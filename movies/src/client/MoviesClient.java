package client;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import server.model.Movie;
import server.service.MoviesService;

public class MoviesClient {
	
	private URL url;
	private QName qName;
	private Service service;
	private MoviesService moviesService;
	
	public void conectToService() throws Exception {
		url = new URL("http://localhost:8080/movies?wsdl");
		qName = new QName("http://service.server/", "MoviesServiceImplService");
		service = Service.create(url, qName);
		moviesService = service.getPort(MoviesService.class);
		
		System.out.println(moviesService.getMovies());
		
//		for (Movie movie : movies) {
//			System.out.println("Filme: "+movie.getName());
//		}
		
		//System.out.println(moviesService.soma(2, 2));
		//moviesService.getMovies();
		//moviesService.deleteMovie(id);
		//moviesService.insertMovie(movie);
		
	}
	
	public static void main(String args[]) throws Exception {
		MoviesClient moviesClient = new MoviesClient();
		moviesClient.conectToService();
	}
}
