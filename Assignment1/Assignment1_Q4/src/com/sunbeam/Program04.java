package com.sunbeam;

import java.util.Scanner;

//4. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is not found, return -1.
public class Program04 {
	
	public static int nthOccurance(int arr[], int n,int key) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				
				count++;
				if(count==n) {
					return i;
				}
		}
		
	}
		return -1;
	}
	
	
	public static void main(String[] args ) {
		
		int arr[]= {33,11,44,66,11,33,66,33};
		System.out.println("Enter no of occurance to search for ");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Enter key to search for ");
		int key=new Scanner(System.in).nextInt();
		int index= Program04.nthOccurance(arr,n,key);
		System.out.println(" "+n+" occurance of the key "+key+" is at index "+index);
		
	}

}
