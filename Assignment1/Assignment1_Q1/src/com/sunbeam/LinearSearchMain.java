package com.sunbeam;

public class LinearSearchMain {
	
	
	public static int linearSearch(int arr[], int size,int key) {
		int count=0;
		for (int i=0;i<size;i++) {
			if(key==arr[i]) {
				System.out.println("Key Found ");
				count++;
		        return count;
			}
			count++;
		}
		return count; 
		
	}
	
	public static void main(String[]args ) {
		int arr[]=  {77,88,66,44,55,66,22,33};
	
		int noOfComparisions= LinearSearchMain.linearSearch(arr,8,66); 
		System.out.println("No of comparisions done are "+noOfComparisions);
		
	}

}
