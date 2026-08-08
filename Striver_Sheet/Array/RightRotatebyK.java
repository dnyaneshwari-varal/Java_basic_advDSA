package Striver_Sheet.Array;

public class RightRotatebyK {
	
	public static void reverse(int[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int k=2;
		k = k % arr.length;
		System.out.print("Original ");
		System.out.println();

		for(int i=0;i<arr.length;i++) {
						System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		
		System.out.println("rotated to right by K="+k);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
			
		}

	}

}
