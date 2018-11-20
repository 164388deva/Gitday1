package com.onkar.cust;

import com.onkar.ds.MyArray;

public class User {
	public static void main(String[] args) {
		MyArray array= new MyArray();
		
		array.insert(10);
		array.insert(20);
		array.insert(30);
		array.insert(40);
		array.insert(50);
		
		System.out.println(array.get(3));
	}

}
