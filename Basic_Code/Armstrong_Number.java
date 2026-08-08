package Basic_Code;

public class Armstrong_Number {
	public static int isArmstrongNum(int x) {
		int temp=x;
		int count=0;
		
		int temp1=x;
		int final1=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		while(temp1 >0) {
			int digit=temp1%10;
			int ans=1;
			for(int i=1;i<=count;i++) {
				ans=ans*digit;
			}
			final1=final1+ans;
			temp1=temp1/10;
		}
		return final1;
		
	}

	public static void main(String[] args) {
		int x=153;
		int ans=isArmstrongNum(x);
		if(x==ans) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
		
		

	}

}
