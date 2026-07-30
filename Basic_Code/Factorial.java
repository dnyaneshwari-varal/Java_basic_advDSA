package Basic_Code;

public class Factorial {
	public static int findFact(int num) {
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}


	public static void main(String[] args) {
		int num=5;
		int ans=findFact(num);
		System.out.println("Factoria of "+num +" is: "+ans);

	}

}
