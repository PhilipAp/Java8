package com.insertion;

public class InsertionSort {
	
	 static int intArray[] = { 1000, 1, 100, 101, 15 };
	 public static void doSort() {
	  for (int outer = 1; outer < intArray.length; outer++) {
	   for(int inner=outer;inner > 0; inner--){
	    if(intArray[inner] < intArray[inner-1]){
	     int temp=intArray[inner];
	     intArray[inner]=intArray[inner-1];
	     intArray[inner-1]=temp;
	     continue;
	    }//if condition ends
	   }//inner loop ends
	  }//outer loop ends
	 }
	 
	 public static void printArray() {
		  for (int i = 0; i < intArray.length; i++) {
		   System.out.print(" " + intArray[i]);
		  }
		 }

	public static void main(String[] args) {
		
		System.out.print("Array Before Sorting->");
		  printArray();
		  doSort();
		  System.out.print("\nArray After Sorting ->");
		  printArray();
		 }		
		
	/*The doSort() method in the above java program holds the sorting logic.
	There are 2 loops. The loop with the counter outer represents the passes and continues for 0 to length - 1 times. i.e. 1 less than the number of items times.
	The loop with the counter inner represents the progressive picking of the head element from the unsorted sub-list. Note that the loop for inner iterates in reverse. It starts its iterations with the unsorted item and keeps on moving the items greater than this unsorted item to the right by progressively swapping the items greater than itself.While doing all this the inner loop keeps decrementing its counter in order to iterate in reverse.
	The continue keyword in the inner loop prevents unnecessary iterations for inner loop once the correct place for the item being inserted is found.
	The main() method orchestrates the sorting.
	The instance element intArray[] holds the list to be sorted.*/

	}

