package Striver_Sheet.String;

public class LongestPrefix {
	
	public static String longestPrefix(String[] arr) {
		String prefix=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			int j=0;
			while(j <prefix.length() && j < arr[i].length() && prefix.charAt(j)==arr[i].charAt(j)) {
				j++;
			}
			prefix=prefix.substring(0,j);
			if(prefix.length()==0) {
				return "";
			}
		}
		
		return prefix;
	}

	public static void main(String[] args) {
		String[] arr= {"Flight","Flower", "Flow", "Flight"};
		
		String ans=longestPrefix(arr);
		
		System.out.println("Longest prefix: "+ans);

	}

}
