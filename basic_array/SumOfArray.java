package Basic_Code;

import java.util.Scanner;

public class SumOfArray {
	
	public static int sumArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	
	System.out.println("Enter number: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	
	int sum=sumArray(arr);
	System.out.println("Sum of array is: "+sum);

	}

}
