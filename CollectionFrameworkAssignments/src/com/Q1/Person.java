package com.Q1;

strictfp public class Person{
	private String name;
	private double height;
	private double weight;
	Person(String name,double weight,double height){
		this.name=name;
		this.height=height;
		this.weight=weight;
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight="
				+ weight + "]";
	}
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
}

