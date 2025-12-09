package com.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimilarRegxx {
	public static void main(String[] args) {
		String N = "Sweetie you are best sweetie Lavu";
		 // Regex pattern to match case-insensitive 'the'
        String regex = "(?i)Sweetie";
        
        Pattern L = Pattern.compile(regex);
        
		Matcher N1 = L.matcher(N);
		
		while (N1.find()) {
			System.out.println("Match Found : " +N1.group());
		}
		
        
	}

}
