package Striver_Sheet.String;

public class LargestOddNumber {
	
	public static String largestOddNum(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if((ch-'0')%2 != 0) {
				return   str.substring(0,i+1);
			}
		}
		return "";
	}
	public static void main(String[] args) {
		String str="0204278";
		
		String str1=largestOddNum(str);
		System.out.println("largest string is "+str1);
		
		
	}
}
