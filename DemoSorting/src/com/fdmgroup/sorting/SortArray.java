package com.fdmgroup.sorting;

import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {
		
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
		
		Arrays.sort(fruits);
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
}
