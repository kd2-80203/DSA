package com.sunbeam;

public class BinarySearch {
	
	public static int  binarySearch( int arr[], int size, int key) {
		int count=0;
		int start=0;
		int end=size-1;
		int mid = (start+end)/2;
		while (start<= end ) {
			if (arr[mid]==key) {
				System.out.println("key Found.......");
				count++;
				return count;
			}
			else if (arr[mid]<key) {
				start = mid+1;
				
			}
			else {
				end= mid -1;
		     }
            count++;
            mid = (start+end)/2;
		}
		
		return count;
		
	}
	
	
	public static void main(String[]args ) {
		int arr[]=  {11,22,33,44,55,66,77,88};
		int size= arr.length;
		int noOfComparisions=BinarySearch.binarySearch(arr,size,66); 
		System.out.println("No of comparisions done are "+noOfComparisions);
		
	}


}
