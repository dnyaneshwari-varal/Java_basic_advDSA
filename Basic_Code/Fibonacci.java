package Basic_Code;
//1 1 2 3 5 8
public class Fibonacci {
	public static void findFib(int num) {
		int n1=0;
		int n2=1;
		System.out.print(n1 +" "+n2);
		for(int i=3;i<=num;i++) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3+ " ");
			
		}
	}
	public static void main(String[] args) {
		int num=10;
		findFib(num);
	}
}
