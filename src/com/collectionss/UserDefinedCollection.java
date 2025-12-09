package com.collectionss;

import java.util.Objects;

public class UserDefinedCollection implements Comparable<CheckStudentmanualSet>{
	String name;
	int RollNo;

	public UserDefinedCollection(String name, int RollNo) {
		this.name = name;
		this.RollNo = RollNo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student{" + "name " + name + "\n" + "RollNo " + RollNo + "}";
	}

	@Override
	public boolean equals(Object O) {
		if (this == O)
			return true;
		if (O == null || getClass() != O.getClass())
			return false;
		UserDefinedCollection student = (UserDefinedCollection) O;
		return RollNo == student.RollNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(RollNo);
	}

	@Override
	public int compareTo(CheckStudentmanualSet that) {
		return this.RollNo - that.RollNo;
	}
}
