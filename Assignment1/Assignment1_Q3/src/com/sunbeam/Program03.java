package com.sunbeam;

import java.util.Scanner;

public class Program03 {
	public static int binarySearch(int arr[], int key) {
		int start=0;
		int end= arr.length;
		int mid = (start+end)/2;
		while (start<=end) {
			if (arr[mid]==key) {
				return mid ;
				
			}
			else if (arr[mid]>key) {
				start= mid+1;
			}
			else {
				end= mid -1;
			}
			mid= (start+end )/2;
		}
		
		return  -1;
	}
	
	
	
	public static void main(String[] args ) {
		
		
		int arr[]= {88,77,66,55,44,33,22,11};
		System.out.println("Enter key to find in array");
		int key= new Scanner(System.in).nextInt(); 
		int index = Program03.binarySearch(arr,key);
		System.out.println("Key found at index "+index);
		
	}

}
