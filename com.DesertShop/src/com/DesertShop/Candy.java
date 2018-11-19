package com.DesertShop;

public class Candy extends DessertItem{
  private int noOfCandies;
	@Override
	public double getcost(int number) {
		return number;
		// TODO Auto-generated method stub
		
	}

	public void addCandy(int num) {
		// TODO Auto-generated method stub
		this.noOfCandies+=num;
	}

	public void addCandyToCart(int num) {
		// TODO Auto-generated method stub
		if(num>this.noOfCandies){
			System.out.println("There is only "+this.noOfCandies+" Ice Creams");
			
		}
		else {
			this.noOfCandies-=num;
			
		}
	}

}
