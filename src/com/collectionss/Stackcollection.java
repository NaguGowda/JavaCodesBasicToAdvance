package com.collectionss;

import java.util.Stack;

public class Stackcollection {
	public static void main(String[] args) {
		//Stack FILO order of the stack insert and delet operation
		Stack<String> st = new Stack<>();
		
//		Push, POp, Peek
		
//		st.add("nagu");
//		st.add("Lavu");
//		st.add("nagu Gowda");
//		st.add("Lavu nagu");
		
		st.push("nagu");
		st.push("Lavu");
		st.push("nagu Gowda");
		st.push("Lavu nagu");
		
		System.out.println("Stack values are"+ st);
		
		System.out.println(st.peek());//top of the stack value
		
		st.pop();
		
		System.out.println(st.peek()); //lavu nagu poped out so top value now is nagu gowda in th stack
		
		
	}

}
