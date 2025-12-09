package com.collectionss;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CheckStudentmanualSet {
	public static void main(String[] args) {
		
		Set<UserDefinedCollection> SS = new HashSet<>();
//		
		SS.add(new UserDefinedCollection("Nagu",01));
		SS.add(new UserDefinedCollection("Lavu",02));
		SS.add(new UserDefinedCollection("Swathi",03));
//		
//		
		SS.add(new UserDefinedCollection("Nataraja",01));
//		
		System.out.println(SS);
//		
		
//		UserDefinedCollection SS1 = new UserDefinedCollection("Nagu",01);
//		UserDefinedCollection SS2 = new UserDefinedCollection("Lavu",01);
//		
//		System.out.println(SS1.equals(SS2)); // Key unique and values are can be same  -->True
		

		UserDefinedCollection SS1 = new UserDefinedCollection("Nagu",01);
		UserDefinedCollection SS2 = new UserDefinedCollection("Nagu",02);
		
		System.out.println(SS1.equals(SS2)); // Key same and values are different -->False
//		Collections.sort(SS);
		System.out.println();
	}

	public int RollNo;

//	@Override
//	public int compareTo(CheckStudentmanualSet that) {
//		return this.R;
//	}

}
