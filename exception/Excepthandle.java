package com.exception;

//A Class that represents user-defined exception
class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String m) {
		super(m);
	}
}

//A Class that uses the above MyException
public class Excepthandle {
	public static void main(String args[]) {
		try {

			// Throw an object of user-defined exception
			throw new MyException("This is a custom exception");
		} catch (MyException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
