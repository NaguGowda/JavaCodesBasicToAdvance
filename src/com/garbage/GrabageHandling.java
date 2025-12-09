package com.garbage;

import java.util.ArrayList;
import java.util.List;

public class GrabageHandling {

	public static void main(String[] args) {

		List<byte[]> list = new ArrayList<>();

		while (true) {
			// Each iteration creates a 1 MB object
			list.add(new byte[1024 * 1024]);
		}
	}
}

//The program keeps creating 1 MB byte arrays and stores all of them in the list. Since the list holds 
//references to every array, the garbage collector cannot free the memory. As the list grows, heap memory fills 
//up and eventually causes an OutOfMemoryError.