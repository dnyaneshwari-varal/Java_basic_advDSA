package Basic_Code;

public class CountDigit {
	public static int counDigit(int num) {
		int count =0;
		int temp=num;
		while(temp>0) {
			
			temp=temp/10;
			count++;
		}
		return count;
	}
	public static void main(String []args) {
		int num=78;
		int ans=counDigit(num);
		System.out.println(ans);
	}

}
