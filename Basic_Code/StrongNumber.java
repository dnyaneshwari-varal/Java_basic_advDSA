package Basic_Code;

public class StrongNumber {

	public static boolean isStrongNum(int num) {
		int n=0;
		int temp=num;
		int ans=0;
		while(temp>0) {
			n=temp%10;
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			temp=temp/10;
			ans=ans+fact;
		}
		return num==ans;
	}
	public static void main(String[] args) {
		int num=145;
		boolean ans=isStrongNum(num);
		System.out.println(ans);

	}

}
