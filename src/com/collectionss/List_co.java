package com.collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_co {

	// ✔ Parent property that child can inherit
	public static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println(list);
		list.add(4);
		list.add(5);
		System.out.println("new values added: " + list);

		list.add(2, 6);
		list.add(4, 7);
		list.add(0, 8);

		System.out.println("new values are replaced: " + list);
		
//		list.remove(Integer.valueOf(1)); remove indexed value
		
//		list.clear(); clear teh whole  list

		list.set(0, 20);
		list.set(1, 30); //sets new values in the index, value
		System.out.println(list);

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("values of the list is : "+list.get(i)); //if we use just i it prints only a 0, 1, 2............
//		}
		
		for (int ele : list) {
			System.out.println(ele);
		}
		boolean a = list.contains(30);
		System.out.println(a);
		
	}
}
