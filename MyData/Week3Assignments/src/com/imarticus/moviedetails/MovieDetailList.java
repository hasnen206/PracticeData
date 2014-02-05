package com.imarticus.moviedetails;

import java.util.ArrayList;

public class MovieDetailList {

	ArrayList<MovieDetails> list=new ArrayList();
	
	public void addMovie(MovieDetails newmovie )
	{
		list.add(newmovie);
		
	}
	
	public void removeMovie(String removemovie)
	{for(MovieDetails details:list)
	{
		if(details.getMov_Name().equals(removemovie))
		{
			list.remove(details);
		}
		return;
	}
		
	}
	
	public void removeAllMovies()
	{
		list.removeAll(list);
	}
	
	public boolean searchMovieName(String mov_Name)
	{	for(MovieDetails details:list)
	{
		if(details.getMov_Name().equals(mov_Name))
		{
			return true;
		}
	}
	return false;
	}
	
	public boolean searchMovieGenre(String genre)
	{
		for(MovieDetails details:list)
		{
			if(details.getGenre().equals(genre))
			{
				return true;
			}
		}
		return false;
	}
	
	public void showAll()
	{
		for(MovieDetails movie:list)
			System.out.println(movie);
	}
	
}
