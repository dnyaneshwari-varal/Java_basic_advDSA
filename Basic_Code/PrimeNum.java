package Basic_Code;

public class PrimeNum {
	
	public static int isPrimeNum(int x) {
		int count=0;
		for(int i=2;i<=x;i++) {
			if(x%i==0) {
				count++;
			}
		}return count;
	}
    public static void main(String [] args){
    	int x=10;
    	int ans=isPrimeNum(x);
    	if(ans==1) {
    		System.out.println(x +" is prime number");
    	}else {
    		System.out.println(x +" is not prime number");
    	}
    }
}
