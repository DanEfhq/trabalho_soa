package server.service;

import javax.xml.ws.Endpoint;

public class MoviesServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/movies", new MoviesServiceImpl());
	}

}
