package Basic_Code;

public class PerfectNumber {
	
	public static boolean isPerfectNum(int num){
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		
		return sum==num;
		
	}

	public static void main(String[] args) {
		int a=6;
		
		boolean ans=isPerfectNum(a);
		
		System.out.println(ans);

	}

}
