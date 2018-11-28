package com.Q1;

import java.util.TreeSet;




public class SortPersonsWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeSet<Person> ts=new TreeSet<Person>(new Mycomp());
    ts.add(new Person("Deva",65.02,164.75));
    ts.add(new Person("Vishnu",70.02,160.75));
    ts.add(new Person("Sachin",72.02,168.75));
    ts.add(new Person("Deva1",65.02,165.75));
    for(Person p:ts){
    	System.out.println(p);
    }
    
	}

	
	

}
