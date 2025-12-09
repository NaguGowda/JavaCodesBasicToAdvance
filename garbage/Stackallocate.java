package com.garbage;

public class Stackallocate {
	
//	public int n;
//	
//	public Stackallocate() {
//		this.n=n;
//	}

	// method parameter 'n' is stored in the stack
	public static int calculate(int n) {
		// local varaible 'ans' is stored in the stack
		int ans = n * 10;
		return ans;
	}

	public static void main(String[] args) {
		// local variable 'n' is stored in the stack
		int n = 10;

		// n is passed as an argument so its reference is
		// stored in the stack
		calculate(n);
//		System.out.println(calculate(n));
	}
}