package com.collectionss;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkesdHashSet {

	public static void main(String[] args) {

//		Set<Integer> KK = new HashSet<>();
//		Set<Integer> KK = new TreeSet<>();
		
		Set<Integer> KK = new LinkedHashSet<>();
		KK.add(20);
		KK.add(10);
		KK.add(50);
		KK.add(60);
		KK.add(80);
		KK.add(24);

		System.out.println("Values are :" + KK);

//			values print one by one   Values are :[20, 10, 50, 60, 80, 24]

		KK.add(50);
		System.out.println(KK);// Set accepts unique values

		KK.remove(20);
		System.out.println("20 removed : " + KK);

		System.out.println(KK.remove(24));// True
		System.out.println(KK.remove(24));// False bcose already removed from set

		KK.contains(24);
		System.out.println(KK);
		System.out.println(KK.contains(24));// False bcose already removed from set

		KK.contains(80);
		System.out.println(KK);
		System.out.println(KK.contains(80));

		System.out.println(KK.isEmpty());

		System.out.println("The size of the set is : " + KK.size());

		KK.clear();

		System.out.println(KK); // []
	}
}
