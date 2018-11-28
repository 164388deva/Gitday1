package com.Q1;

import java.util.Comparator;

class Mycomp implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		if(p1.getWeight() >p2.getWeight()){
	
		return 1;
		}
		else if(p1.getWeight()==p2.getWeight()){
			if(p1.getHeight() >p2.getHeight()){
				return 1;
			}
		}
		return -1;
	}
	
	
}
