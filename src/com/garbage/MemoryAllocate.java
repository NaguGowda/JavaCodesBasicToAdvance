package com.garbage;

import java.util.*;
class Student {

	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class MemoryAllocate {
	public static void main(String[] args) {
		// Here the student object will be stored in the
		// heap memory and the references will be stored in
		// the stack memory
		Student s = new Student("bob", 20); // new keyword initiated the heap memory and stack stores as reference s .
		System.out.println("grabage allocated in address of "+s);
	}
}