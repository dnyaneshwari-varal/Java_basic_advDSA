package Striver_Sheet.Array;

public class MoveZeroToEnd {
	
	public static void moveToEnd(int[] arr) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=0) {
				arr[index]=arr[i];
				index++;
			}
		}
	    // Fill remaining positions with zero
        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }
		
	}

	public static void main(String[] args) {
		int[] arr= {1,0,3,0,4,0,5,6};
		moveToEnd(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
