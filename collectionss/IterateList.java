package com.collectionss;

public class IterateList extends List_co {

	public static void main(String[] args) {
//		❌ Mistake 1: You created a new object instead of using inheritance
		// ✔ Access parent property directly because it is static and inherited
		System.out.println("Accessing parent list: " + list);

		// ✔ Modify inherited list
		list.add(999);

		System.out.println("After adding new value: " + list);
	}
}

//
//❌ list is a local variable of main
//❌ It cannot be inherited
//❌ It cannot be accessed by child class
//❌ It cannot be accessed by another class
