package com.Q10;

public class Movie_Details {
private String mov_Name;
private String lead_Actor;
private String lead_Actress;
private String genre;
public Movie_Details(String mov_Name, String lead_Actor, String lead_Actress,
		String genre) {
	super();
	this.mov_Name = mov_Name;
	this.lead_Actor = lead_Actor;
	this.lead_Actress = lead_Actress;
	this.genre = genre;
}
public String getMov_Name() {
	return mov_Name;
}
@Override
public String toString() {
	return "Movie_Details [mov_Name=" + mov_Name + "\n lead_Actor=" + lead_Actor
			+ "\n lead_Actress=" + lead_Actress + "\n genre=" + genre + "]\n";
}
public String getLead_Actor() {
	return lead_Actor;
}
public String getLead_Actress() {
	return lead_Actress;
}
public String getGenre() {
	return genre;
}


}
