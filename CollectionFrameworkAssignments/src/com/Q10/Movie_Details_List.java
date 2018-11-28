package com.Q10;

import java.util.ArrayList;

public class Movie_Details_List {
protected  void add_movie(Movie_Details m1,ArrayList<Movie_Details> al){
	al.add(m1);
}
protected void remove_movie(Movie_Details m1,ArrayList<Movie_Details> al) {
	al.remove(m1);
}
protected void remove_Allmovie(ArrayList<Movie_Details> al) {
	al.clear();
}

protected Movie_Details find_movie_by_name(String movie_name,ArrayList<Movie_Details> al) {
	for(Movie_Details i: al){
		if(i.getMov_Name().equals(movie_name)){
			System.out.println(i+"\n");
		}
	}
	return null;
	
}
protected Movie_Details find_movie_by_genre(String genre_name,ArrayList<Movie_Details> al) {
	for(Movie_Details i: al){
		
			if(i.getGenre().equals(genre_name)){
				System.out.println(i+"\n");
			}
		
		}
	
	return null;
	
}
}
