package Basic_Code;

public class LinearSearch {

	public static int linearSearch(int[] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		
		int[] arr= {1,2,5,3,23};
		int num=23;
		
		int ans=linearSearch(arr,num);
		
		if(ans==-1) {
			System.out.println("element not present");
		}else {
			System.out.println("element present at index "+ ans);
		}
	}

}
