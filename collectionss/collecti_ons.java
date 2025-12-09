package com.collectionss;

import java.util.ArrayList;

public class collecti_ons {
	public static void main(String[] args) {

		// Create an ArrayList to store elements
		ArrayList<String> al = new ArrayList<>();

		// Add elements to the list
		al.add("Apple");
		al.add("Banana");
		al.add("Apple"); // Duplicates are allowed

		System.out.println("" + al);
	}
}