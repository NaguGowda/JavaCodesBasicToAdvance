package com.regx;

import java.util.regex.Pattern;

public class RegxMatches {
//	[xyz]: Matches x, y, or z
//	[^xyz]: Matches any character except x, y, or z
//	[a-zA-Z]: Matches any character in the specified range
//	[a-f[m-t]]: Union of ranges a–f and m–t
//	[a-z && [^m-p]]: Intersection of a–z excluding m–p
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z]", "g"));      // true
        System.out.println(Pattern.matches("[a-zA-Z]", "G")); // True
        System.out.println(Pattern.matches("[a-zA-Z]", "gG")); // false
   
//        X?: X appears 0 or 1 time
//        		X+: X appears 1 or more times
//        		X*: X appears 0 or more times
//        		X{n}: X appears exactly n times
//        		X{n,}: X appears n or more times
//        		X{n,m}: X appears between n and m times
        
        System.out.println(Pattern.matches("[b-z]?", "a"));         // false
        System.out.println(Pattern.matches("[a-zA-Z]+", "GfgTest")); // true
        System.out.println(Pattern.matches("[^a-z]?", "g"));         // false
        System.out.println(Pattern.matches("[geks]*", "geeksgeeks")); // true
        
//        . : Any character
//        \d : Digit [0-9]
//        \D : Non-digit
//        \s : Whitespace
//        \S : Non-whitespace
//        \w : Word character [a-zA-Z0-9_]
//        \W : Non-word character
//        \b : Word boundary
//        \B : Non-word boundary
        
        System.out.println(Pattern.matches("\\d+", "1234")); // true
        System.out.println(Pattern.matches("\\D+", "1234")); // false
        System.out.println(Pattern.matches("\\D+", "Gfg"));  // true
        System.out.println(Pattern.matches("\\S+", "gfg"));  // true

	}
	

}
