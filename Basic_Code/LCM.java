package Basic_Code;

public class LCM {
	
	public static int findLCM(int a,int b) {
		int lcm=a;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				return lcm;
			}
			lcm++;
		}
		
	}

	public static void main(String[] args) {
		int a=6;
		int b=4;
		int lcm=findLCM(a,b);
		System.out.println(lcm);

	}

}
