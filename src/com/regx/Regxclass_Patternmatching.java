package com.regx;

import java.util.regex.Pattern; //*

public class Regxclass_Patternmatching {

	public static void main(String[] args) {
//		matches find the equal in characters and position of each characters
		System.out.println(Pattern.matches("geeks.*", "geeksforgeeks")); // true
		System.out.println(Pattern.matches("geeks[0-9]+", "geeks12s")); // false
	}
}