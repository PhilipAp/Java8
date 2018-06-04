package com.bubble;

public class BubbleSort {
	
	static int intArray[] = { 1000, 1, 100, 101, 15 };
	
	  public static void doSort() {
	    for (int outer = 0; outer < intArray.length; outer++) {
	      for (int inner = 0; inner < intArray.length - outer- 1; inner++) {
	        if (intArray[inner] > intArray[inner + 1]) {
	          int temp = intArray[inner];
	          intArray[inner] = intArray[inner + 1];
	          intArray[inner + 1] = temp;
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
	There are 2 loops. The loop with the counter outer represents the passes and continues for 0 to length – 1 times. ie. 1 less than the number of items times.
	The loop with the counter inner represents the sorted element being moved/bubbled forward. It continues from 0 to length-outer-1 times. This is because the size of the unsorted part of the array keeps reducing in exact correlation with the number of passes completed i.e number of elements sorted and put in their correct place.
	The main() method orchestrates the sorting.
	The instance element intArray[] holds the list to be sorted.*/
		
}
