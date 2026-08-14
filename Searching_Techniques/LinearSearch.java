package Basic_Array;

import java.util.Scanner;

public class LinearSearch {
	
	public static boolean isElementPresent(int[] arr,int num) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				flag=true;
				return flag;
			}
		}
		
		return flag;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("Enter number: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter num: ");
		int num=sc.nextInt();
		
		boolean ans=isElementPresent(arr,num);
		if(ans) {
			System.out.println(num+ " Element is present");
		}else {
			System.out.println(num+ " Element is not present");
		}
	}

}
