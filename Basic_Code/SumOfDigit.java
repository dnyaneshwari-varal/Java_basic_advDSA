package Basic_Code;

public class SumOfDigit {
	
	public static int sumOfDigit(int num) {
		int temp=num;
		int sum=0;
		while(temp>0){
			int digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int ans=sumOfDigit(num);
		System.out.println(ans);

	}

}
