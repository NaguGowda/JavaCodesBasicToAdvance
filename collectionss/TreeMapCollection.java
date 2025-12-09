package com.collectionss;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {
	public static void main(String[] args) {
		
		Map<String, Integer> K = new TreeMap<>();
		
		K.put("TC1", 01);
		K.put("TC3", 04);
		K.put("TC5", 9); //09  09 starts with 0 → compiler thinks “octal”.
//9 is not allowed in octal → error.
		K.put("TC2", 06);
		
		System.out.println(K);
		
		K.remove("TC5");
		System.out.println(K);
	}

}
