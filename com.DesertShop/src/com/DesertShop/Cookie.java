package com.DesertShop;

public class Cookie extends DessertItem{
private int noOfCookies;
	@Override
	public double getcost(int num) {
		double amount=num*15;
		double tax=amount*0.1;
		  amount+=tax;
		return amount;
		
		
		// TODO Auto-generated method stub
		
	}

	public void addCookie(int num) {
		// TODO Auto-generated method stub
		this.noOfCookies+=num;
	}

	public void addCookieToCart(int num) {
		// TODO Auto-generated method stub
		if(num>this.noOfCookies){
			System.out.println("There is only "+this.noOfCookies+" Ice Creams");
			
		}
		else {
			this.noOfCookies-=num;
			
		}
		
	}

}
