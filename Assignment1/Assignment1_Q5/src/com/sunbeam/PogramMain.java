package com.sunbeam;

public class PogramMain {
	
	public static int nonRepeatingEle(int arr[]) {
		int ele=-1;
		for(int i=0 ;i<arr.length;i++) {
			ele=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
			if(i!=j){
				if(ele==arr[j]) {
					ele=0;
				}
			   }	
			}
			if(ele!=0) {
				return ele;
			}
			
			
		}
		
		
		return ele;
	}
	
	
	public static void main(String[] args) {
//		find the first non-repeating element:
//			Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
//			Ouput: 3
		
		int arr[]= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int element = PogramMain.nonRepeatingEle(arr);
		
		if (element==0)
			System.out.println("All elemrnts are repeating");
		
		System.out.println("first non repeating Element is "+ element);

	
	}

}
