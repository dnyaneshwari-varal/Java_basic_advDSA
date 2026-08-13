package Basic_Code;

public class StringPalindrome {

	public static boolean isStringPalindrome(String str) {
		
		int left=0;
		int right=str.length()-1;
		while(left <right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		String str="madama";
		boolean ans=isStringPalindrome(str);
		
		if(ans) {
			System.out.println(str +" is palindrome.");
		}else {
			System.out.println(str +" is not palindrome.");
		}

	}

}
