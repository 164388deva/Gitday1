package com.Q10;

import java.util.ArrayList;

public class Test {


public static void main(String[] args) {
	Movie_Details_List list=new Movie_Details_List();
	ArrayList<Movie_Details> al=new ArrayList<Movie_Details>();
	Movie_Details movie1=new Movie_Details("King"," Nagarjuna"," Anushka","Action");
	Movie_Details movie2=new Movie_Details("Robo"," Rajinikanth"," Aishwarya","Action");
	Movie_Details movie3=new Movie_Details("Pelli Choopulu"," Vijay","Geetha","Comedy");
	
	
	list.add_movie(movie1, al);
	list.add_movie(movie2, al);
	list.add_movie(movie3, al);
	
	
	System.out.println("after adding movies"+al);
	System.out.println("find movies by genre");
	list.find_movie_by_genre("Action", al);
	System.out.println("find movies by movie name");
	list.find_movie_by_name("Pelli Choopulu", al);
	System.out.println("after removing movies ");
	list.remove_movie(movie1, al);
	System.out.println(al);
	System.out.println("after all removing movies ");
	list.remove_Allmovie(al);
	System.out.println(al);
}
}
