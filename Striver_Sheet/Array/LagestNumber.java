package Striver_Sheet;

public class LagestNumber {
	public static int maxNum(int arr[]) {
		int max_n=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i] > max_n) {
				max_n=arr[i];
			}
			
		}return max_n;
	}


	public static void main(String[] args) {
		int[] arr= {2,5,1,24,3,55,3};
		int max_n=maxNum(arr);
		System.out.println(max_n);
		
	}

}
