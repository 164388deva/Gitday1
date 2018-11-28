package com.Q3;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(22);
		al.add(32);
		al.add(42);
		al.add(52);
		al.add(62);
		al.add(72);
		al.add(82);
		
		ListIterator itr=al.listIterator();
		System.out.println("Printing array list using Listiterator");
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n Printing array list in reverse order using Listiterator");
		while(itr.hasPrevious()){
			System.out.print(itr.previous()+" ");
		}
		
	}

}
