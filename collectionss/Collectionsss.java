package com.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class Collectionsss {
	public static void main(String[] args) {
		
		List<Integer> L = new ArrayList<>();
		
		L.add(12);
		L.add(11);
		L.add(14);
		L.add(16);
		L.add(19);
		L.add(122);
		L.add(14);
		L.add(155);
		L.add(111);
		L.add(1);
		
		System.out.println("Min "+Collections.min(L));
		
		System.out.println("Max "+Collections.max(L));
		
		
//		Collections.sort(L);//ASC
		
		Collections.sort(L.reversed()); //DESC

		System.out.println(L );
	}

}
