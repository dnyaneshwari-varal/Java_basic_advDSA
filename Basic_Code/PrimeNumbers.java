package Basic_Code;

import java.util.Scanner;

public class PrimeNumbers {
	public static boolean primeNum(int p) {
		int count=0;
//		for (int i = 2; i * i <= p; i++) 
		for(int i=1;i<=p;i++) {
			if(p%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	
		
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(primeNum(i)) {
				System.out.print(i +" ");
			}
		}
		
	}
		
}

