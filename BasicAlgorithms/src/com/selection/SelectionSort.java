package com.selection;

public abstract class SelectionSort {
	
	static int intArray[] = { 10, 5, 100, 1, 10000 };
	  public static void doSort() {
	    for (int outer = 0; outer < intArray.length; outer++) {
	      int minPosition=outer;
	      for(int inner=outer;inner < intArray.length;inner++){
	        if(intArray[inner] < intArray[minPosition]){
	          minPosition=inner;
	        }
	      }
	      int temp=intArray[minPosition];
	      intArray[minPosition]=intArray[outer];
	      intArray[outer]=temp;
	    }
	  }
	  public static void printArray() {
	    for (int i = 0; i < intArray.length; i++) {
	      System.out.print(" " + intArray[i]);
	    }
	  }

	public static void main(String[] args) {
		 System.out.print("Array Before Sorting ->");
		    printArray();
		    doSort();
		    System.out.print("\nArray After Sorting ->");
		    printArray();
		  }
	/*
	The doSort() method in the above java program holds the sorting logic.
	There are 2 loops. The loop with the counter outer represents the passes and continues for 0 to total-item-count - 1 times. ie. 1 less than the number of items times.
	The loop with the counter inner represents the search for the smallest item in the unsorted sub-list which starts from the top of the unsorted sublist index i.e the current value of outer and ends at the end of the list.
	The main() method orchestrates the sorting.
	The instance element intArray[] holds the list to be sorted.
	Big Oh Complexity of Selection Sort Algorithm
	There are 2 nested loops in the algorithm. The outer loop is for iterations and the inner nested loop is for finding the minimum element from among the unsorted elements.

	Since the inner loop is nested inside outer loop, the complexity of both the loops together will be O(n2). The complexity of selection sort algorithm is thus O(n2).
	(Note – This is a simplified explanation of selection sort complexity. I will be comparing the time complexities of sorting algorithms in a separate article where I will provide detailed mathematical reasoning for the same.)
		*/
	}


