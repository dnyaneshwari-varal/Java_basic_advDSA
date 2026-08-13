package Basic_Code;

public class ReveseString {
	
	public static String reverseString(String str) {
		char[] revArr=new char[str.length()];
		int index=0;
		for(int i=str.length()-1;i>=0;i--) {
			revArr[index]=str.charAt(i);
			index++;
		}
		return new String(revArr);
		
	}

	public static void main(String[] args) {
		String str="HELLO how are you";
		
		String ans=reverseString(str);
		System.out.println("Revese string of: "+str +" is "+ans);
	}

}
