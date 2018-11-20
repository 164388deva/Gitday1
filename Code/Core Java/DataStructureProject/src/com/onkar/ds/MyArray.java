package com.onkar.ds;

public class MyArray {

	private int[] intList;
	private int index = -1;

	public MyArray() {
		intList = new int[10];
	}

	public void insert(int number) {
		intList[++index] = number;
	}

	public int get(int consumerIndex) {
		if (intList.length > consumerIndex) {
			return intList[consumerIndex];
		}
		else {
			System.out.println("Index supplied is invalid");
			return 0;
		}
	}

}
