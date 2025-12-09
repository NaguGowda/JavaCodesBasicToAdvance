package Recheckjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,9,11,66,77,88,99,101};
//		Arrays.sort(arr); // sorting always works after initialization / declaration
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Arrays class have with to  :" + Arrays.asList(arr[i]));
//		}
//		--------------------------------------------------
		
//		int[] arr = {1,2,3,4,5,6,7,9};
//		Arrays.sort(arr); // sorting always works after initialization / declaration
//
//		int key = 6;
//		
//		System.out.println("key index of values :" + key + " found at : "+ Arrays.binarySearch(arr, key));
//------------------------------------------------------------
//		Arrays.sort(arr); // sorting always works after initialization / declaration
//
//		int key = 66;
//		
//		System.out.println(key + " value found at : " + Arrays.binarySearch(arr, 2, 12, key)); //index starts from zero = 1 as count
//------------------------------------------------------------
		int[] arr1 = {6,7,9,11,66,77};
		
		System.out.println(arr + " value matched at : " + Arrays.compare(arr, arr1)); //index starts from zero = 1 as count

		System.out.println("Integer Arrays on comparison: "+ Arrays.compareUnsigned(arr, arr1));
	          
		
		System.out.println(arr + " value matched at : " + Arrays.copyOf(arr, 10));
		
		System.out.println("Integer Array: "+ Arrays.toString(arr));
		
		System.out.println("Integer Array: "+ Arrays.toString(Arrays.copyOfRange(arr, 1, 9)));
		
		int intArr[][] = { { 10, 20, 15, 22, 35 } };

        // Get the second Arrays
        int intArr1[][] = { { 10, 15, 22 } }; //10, 20, 15, 22, 35 
		
		System.out.println("Integer Arrays on comparison: " + Arrays.deepEquals(intArr, intArr1));
		
		System.out.println("Integer Array: "+ Arrays.deepToString(intArr));
		
		System.out.println("Integer Arrays on comparison: "+ Arrays.equals(intArr, intArr1));
		
		int[] intkey = {3};
		
		Arrays.fill(intArr, intkey); 

		for (int[] j : intArr) {
			System.out.println("intArr value is : " + j);
		}
//		System.out.println("intArr value is : " + intArr[i]);
        // To fill the arrays
        System.out.println("Integer Array on filling: "+ Arrays.toString(intArr));
        
        System.out.println("Integer Array: "+ Arrays.hashCode(intArr));
//        -------------------------------
        int intA[] = { 10, 20, 15, 22, 35 };

        // To sort the array using parallelSort
        Arrays.parallelSort(intA);
        System.out.println("Integer Array: "+ Arrays.toString(intA));
        
        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
        
//        Arrays.sort(arr, 1, 2, new Sortbyroll());
		
        
        
        System.out.println("Integer Array: "
                + Arrays.spliterator(intA));
        
        System.out.println("Integer Array: "
                + Arrays.spliterator(intA, 1, 3));
        
        
        System.out.println("Integer Array: "
                + Arrays.stream(intArr));
        
        
        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
        
        
        
	}

}
