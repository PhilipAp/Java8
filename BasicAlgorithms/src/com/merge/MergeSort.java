package com.merge;

public class MergeSort {
	
	
	static int inputArray[] = { 10, 5, 100, 1,10000};
	  
	 public static int[] doMergeSort(int[] values) {
	  if(values.length<=1){
	   return values;
	  }
	  int mid=(values.length)/2;
	  int[] left=new int[mid];
	  int[] right=new int[(values.length)-mid];
	  for(int leftCount=0;leftCount<mid;leftCount++){
	   left[leftCount]=values[leftCount];
	  }
	  for(int rightCount=0;rightCount<((values.length)-mid); rightCount++){
	   right[rightCount]=values[mid+rightCount];
	  }
	  return merge(doMergeSort(left),doMergeSort(right));
	 }
	  
	 public static int[] merge(int[] left, int[]right){
	  int leftCounter=0,rightCounter=0, mergedCounter=0;
	  int merged[]=new int[left.length+right.length];
	  while(leftCounter < left.length && rightCounter < right.length){
	   if(left[leftCounter]<=right[rightCounter]){
	     merged[mergedCounter]=left[leftCounter];
	    leftCounter++;
	    mergedCounter++;
	   }else{
	    merged[mergedCounter]=right[rightCounter];
	    rightCounter++;
	    mergedCounter++;
	   }
	  }
	  while(leftCounter<left.length){
	   merged[mergedCounter]=left[leftCounter];
	   leftCounter++;
	   mergedCounter++;
	  }
	  while(rightCounter<right.length){
	   merged[mergedCounter]=right[rightCounter];
	   rightCounter++;
	   mergedCounter++;
	  }
	  return merged;
	 }
	  
	 public static void printArray(int[] sortedArray) {
	  for (int i = 0; i < sortedArray.length; i++) {
	   System.out.print(" " + sortedArray[i]); 
	  }
	 }

	public static void main(String[] args) {
		 System.out.print("Array Before Sorting->");
		  printArray(inputArray);
		  int sortedArray[]=doMergeSort(inputArray);
		  System.out.print("\nArray After Sorting ->");
		  printArray(sortedArray);



	}
	
	/*The doMergeSort() method is responsible for merge sorting of a list of elements passed to it. It does the following –
	Divides the list passed to it into 2 lists – left and right.
	Recursively calls doMergeSort() on the left and right sub-lists
	It merges the left and right sub-lists by calling the merge() method
	The boundary condition for this method is 1. I.e. if the size of the list being sorted by this method is 1 then the list is returned back as it is.
	The merge() method iterates over the two sub-lists left and right passed to it and merges them in the correct sorting order.
	Mechanism of merging – Merging of the sub-lists works as follows –
	Both of the sub-lists are read with individual pointers.
	The elements at the heads of the two sub-lists are compared and the lesser one is picked and pushed into a third list , called say the merged-list.
	The pointer for the sub-list from which the element was picked is moved forward to point to the next element.
	The main() method orchestrates the sorting.
	The instance element inputArray[] holds the list to be sorted.*/

}
