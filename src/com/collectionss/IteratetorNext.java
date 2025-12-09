package com.collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//printing in diferent ways

public class IteratetorNext {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(30);
		list.add(31);
		list.add(32);
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		list.add(38);
		list.add(39);
		list.add(40);
		
//		System.out.println(list);
		
//		for (int i = 0; i < list.size(); i++) {
//		System.out.println("values of the list is : "+list.get(i)); //if we use just i it prints only a 0, 1, 2............
//	}
	
//	for (int ele : list) {
//		System.out.println(ele);
//	}
		
		Iterator<Integer> iter=list.iterator();
		
		while(iter.hasNext()) {
			System.out.println("next value is : " +iter.next());
		}
	}

}
