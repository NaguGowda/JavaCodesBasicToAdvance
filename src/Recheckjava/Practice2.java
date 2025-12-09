package Recheckjava;

import java.util.ArrayList;

public class Practice2 {
	public static void main(String[] args) {
//		int[] NL;   init
//		int NL[];
		
//		int[] NL = {1,2,3,4,5,7}; // declare 
		
//		int[] NL = new int[6]; //array object
//		NL[0]=12;
//		NL[2]=20;
//		NL[1]=28;
//		NL[4]=27;
//		NL[5]=25;
//		
//		NL[2] = 30; //updating in index
		
		//collection
		
		ArrayList<Integer> NL = new ArrayList<>();
		NL.add(10);
		NL.add(16);
		NL.add(19);
		NL.add(14);
		NL.add(12);
		
		// Enhanced for loop
		for (int num : NL) {
		    System.out.println(num);
		}
	}
}


//		for (i = 0; i < NL.length; i++) {
//			System.out.println(NL[i]); //printing
//			
//		}
//		System.out.println(NL); //gives address of array
//	}

//}
