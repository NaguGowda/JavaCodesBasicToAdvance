package com.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regxmatcher {
	public static void main(String[] args) {
		System.out.println("matcher function in Regx using \n");

		Pattern L = Pattern.compile("sweetie");
		Matcher N = L.matcher("NaguLavu SweetieNagu Lavuweetie");

		while (N.find()) {
			System.out.println(String.format("pattern found from %d to %d", N.start(), N.end() - 1));
		}
		System.out.println("from " + N);
		System.out.println("from " + L);
	}

}
