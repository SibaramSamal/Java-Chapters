package arrays;

/*
 * Aim: Introduction to array
	-> syntax
	-> memory allocation
	-> store and retrive elements
*/

public class ArrayIntro {
	
	//Ways to create arrays
	static int[] arr = {54,5,6,563,65};	//static initialization
	static int[] arr2 = new int[10];	//dynamically 6 sized integer array will be created.
	static int[] arr3 = new int[] {5,6,3,2,1,5}; //initialization and declaration at same time.
	public static void main(String[] args) throws NumberFormatException {
		arr2[5] = 15;
		arr2[6] = 1;
		// Printing elements of arr
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		// Printing elements of arr2
		// default value will be assigned to the indexes where no values are assigned
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		for(int i=0 ; i<arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
	}
}
