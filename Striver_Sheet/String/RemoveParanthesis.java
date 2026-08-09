package Striver_Sheet.String;

public class RemoveParanthesis {
	
	public static String removePar(String str) {
		String ans="";
		int count=0;
		
		for(int i=0;i<str.length();i++ ){
			char ch=str.charAt(i);
			
			if(ch=='(') {

				if(count > 0) {
					ans=ans+ch;
					
				}
				count++;
				
			}
			else {
				count--;
				if(count > 0) {
					ans=ans+ch;
				}
			}
			
		}
		
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		String str="(()())(())";
		String ans=removePar(str);
		System.out.println(ans);
		
	}

}
