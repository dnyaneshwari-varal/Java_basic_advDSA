package Striver_Sheet.Array;

public class ArrayIsSorted {
	public static boolean isArraySorted(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}return true;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		boolean ans=isArraySorted(arr);
		System.out.println();
		if(ans) {
			System.out.println("Is sorted array");
		}else {
			System.out.println("Is not sorted array");
		}
		

	}

}
