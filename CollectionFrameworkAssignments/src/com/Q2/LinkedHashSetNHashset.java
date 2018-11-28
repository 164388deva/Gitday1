package com.Q2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class LinkedHashSetNHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> Hs=new HashSet<Integer>();
		Hs.add(12);
		Hs.add(202);
		Hs.add(17);
		Hs.add(19);
		Hs.add(20);
		Hs.add(191);

		System.out.println("Input for Linked HasSet and Hashset given 17,202,17,191");
		System.out.println("Output of HashSet ");
		for(Integer p:Hs){
			System.out.println(p);
		}
LinkedHashSet<Integer> LH=new LinkedHashSet<Integer>();
LH.add(12);
LH.add(202);
LH.add(17);
LH.add(19);
LH.add(20);
LH.add(191);
LH.add(202);



System.out.println("Output of LinkedHashSet");
for(Integer p:LH){
	System.out.println(p);
}

System.out.println("\n");

	}

	}


