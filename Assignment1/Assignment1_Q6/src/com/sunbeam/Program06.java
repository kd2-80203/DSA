package com.sunbeam;

import java.util.Scanner;

//6. to find rank of an element in a stream of integers.
//rank: rank of a given integer "x", in stream is "total no. of ele's less than or equal to x (including x).
//	
//	Input: { 10, 20, 15, 3, 4, 4, 1 }
//	Ouput: Rank of 4 is: 4


class Program06 {
	
	public static int rankOf(int arr[], int key ) {
		int count=-1;
		for(int i=0;i<arr.length;i++) {
			count++;
			if(arr[i]==key)
				break;
		}
		return  count;
	}
	
	public static void main(String[] args ) {
		int arr[]= { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter key to find rank of ");
		int key= new Scanner(System.in).nextInt();
		int rank = Program06.rankOf(arr, key);
		System.out.println(" Rank of  "+key+" is: "+rank);
		
	}

}
