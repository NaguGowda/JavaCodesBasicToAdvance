package com.oops.check;

//Abstract class
abstract class User {
	String username;

	User(String username) {
		this.username = username;
	}

	// Abstract method (only password is abstract)
	abstract void setPassword(String password);

	void showUsername() {
		System.out.println("Username: " + username);
	}
}

//Subclass 1
class Admin extends User {

	Admin(String username) {
		super(username);
	}

	@Override
	void setPassword(String password) {
		System.out.println("Admin password set to: " + password);
	}
}

//Subclass 2
class Customer extends User {

	Customer(String username) {
		super(username);
	}

	@Override
	void setPassword(String password) {
		System.out.println("Customer password set to: " + password);
	}
}

//Main class
public class Abstractcc {

	public static void main(String[] args) {
		User u1 = new Admin("admin123");
		User u2 = new Customer("johnDoe");

		u1.showUsername();
		u1.setPassword("admin@123");

		u2.showUsername();
		u2.setPassword("john@2024");
	}
}
