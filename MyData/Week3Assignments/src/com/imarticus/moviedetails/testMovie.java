package com.imarticus.moviedetails;

public class testMovie {
public static void main(String[] args) {
	
	MovieDetails movie1= new MovieDetails("Raw","H","P","R");
	MovieDetails movie2= new MovieDetails("Rawan","H","P","R");
	MovieDetailList list=new MovieDetailList();
	list.addMovie(movie1);
	list.addMovie(movie2);
	//list.showAll();
	if(list.searchMovieName("Raw"))
	{
		System.out.println("True");
	}
	else
		System.out.println("false");
	
	list.removeMovie("Raw");
	list.showAll();
}
}
