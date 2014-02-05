package com.imarticus.moviedetails;

public class MovieDetails {

	public String mov_Name;
	public String lead_Actor;
	public String lead_Actress;
	public String genre;
	public MovieDetails(String mov_Name, String lead_Actor,
			String lead_Actress, String genre) {
		
		this.mov_Name = mov_Name;
		this.lead_Actor = lead_Actor;
		this.lead_Actress = lead_Actress;
		this.genre = genre;
	}
	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_Actor() {
		return lead_Actor;
	}
	public void setLead_Actor(String lead_Actor) {
		this.lead_Actor = lead_Actor;
	}
	public String getLead_Actress() {
		return lead_Actress;
	}
	public void setLead_Actress(String lead_Actress) {
		this.lead_Actress = lead_Actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "MovieDetails [mov_Name=" + mov_Name + ", lead_Actor="
				+ lead_Actor + ", lead_Actress=" + lead_Actress + ", genre="
				+ genre + "]";
	}
	
	
	
}
