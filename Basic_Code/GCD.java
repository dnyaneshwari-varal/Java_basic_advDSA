package Basic_Code;

public class GCD {
	
	public static int findGCD(int a,int b) {
		int gcd=0;
		for(int i=1;i<=a  && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				
				gcd=i;
			}
		}
		return gcd;
		
	}

	public static void main(String[] args) {
		int a=12;
		int b=8;
		int gcd=findGCD(a,b);
		System.out.println("GCD is: "+gcd);

	}

}
