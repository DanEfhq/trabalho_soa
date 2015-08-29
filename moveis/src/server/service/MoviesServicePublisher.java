package server.service;

import javax.xml.ws.Endpoint;

public class MoviesServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1/movies", new MoviesServiceImpl());
	}

}
