package Recheckjava;

import java.util.Iterator;

public class MultiDimArrya {
	public static void main(String[] args) {

		int[][][] arr = new int[4][4][4];

		int n = arr.length;
		int m = arr[0].length;
		int o = arr[0][0].length;

		int it = 1;

//		int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 12, 33, 44 } } };
//		System.out.println(arr)   prints the address of the array

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				for (int j2 = 0; j2 < arr[i][j].length; j2++) {
//					System.out.print(arr[i][j][j2] + "");
//				}
//				System.out.println();
//
//			}
//			System.out.println("-------------");
//
//		}

//		or
		// Assigning the values to array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < o; k++) {
					arr[i][j][k] = it;
					it++;
				}
			}
		}

		// Printing the Array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < o; k++)
					System.out.print(arr[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}

	}
}
