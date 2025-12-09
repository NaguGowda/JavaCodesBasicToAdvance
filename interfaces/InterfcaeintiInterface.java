package com.interfaces;

interface OuterInterface {

	void show();

	interface InnerInterface {
		void msg();
	}
}

class InterfcaeintiInterface implements OuterInterface.InnerInterface {

	public void msg() {

		System.out.println("Message from Nested Interface Inside an Interface!");
	}

	public static void main(String[] args) {

		OuterInterface.InnerInterface obj = new InterfcaeintiInterface();
		obj.msg();
	}
}