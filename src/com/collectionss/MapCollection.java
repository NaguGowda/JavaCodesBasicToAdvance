package com.collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCollection {
	public static void main(String[] args) {
		
		Map<String, Integer> K = new HashMap<>();
		
		K.put("TC1", 01);
		K.put("TC2", 02);
		K.put("TC3", 03);
		K.put("TC4", 04);
		
		K.put("TC3", 05);//TC3 Key any one will choose
		
//		if(!K.containsKey("TC3")) {
//			K.put("TC3", 05);
//		}
		
//		K.putIfAbsent("TC3", 03); 
		
		for(Map.Entry<String, Integer> Check : K.entrySet()) {
//			System.out.println(Check);
			
//			System.out.println(Check.getKey() + " "+ Check.getValue());
//			System.out.println(Check.getValue());
		}
			
//		System.out.println(K);
		
//		foreach
//		for(String S: K.keySet()){
//			System.out.println(S);
//		}
//		
//		for(int I : K.values()) {
//			System.out.println(I);
//		}
//		
//		K.containsKey("TC3");
//		System.out.println(K.containsKey("TC3"));
//		
		System.out.println(K.isEmpty());
		
	}
}
