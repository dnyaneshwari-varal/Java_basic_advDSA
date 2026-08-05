package Striver_Sheet.Array;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static int removeDuplicate(int[] arr) {
		Arrays.sort(arr);
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[j] !=arr[i] ) {
				j++;
				arr[j]=arr[i];
				
			}
		}
		return j+1;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,2,3,4};
		int length=removeDuplicate(arr);
		
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
			
		}
		
	}
}
