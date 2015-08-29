package client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import server.service.MoviesService;

public class MoviesClient {
	
	private URL url;
	private QName qName;
	private Service service;
	private MoviesService moviesService;
	
	public void conectToService() throws Exception {
		url = new URL("http://127.0.0.1/movies?wsdl");
		qName = new QName("http://movies", "MoviesServiceImplService");
		service = Service.create(url, qName);
		moviesService = service.getPort(MoviesService.class);
		
		moviesService.getMovies();
	}
	
	public static void main(String args[]) throws Exception {
		MoviesClient moviesClient = new MoviesClient();
		moviesClient.conectToService();
	}
}
