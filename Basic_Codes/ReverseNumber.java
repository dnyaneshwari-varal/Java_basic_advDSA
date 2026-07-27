public class ReverseNumber {
    public int reverseNum(int num){
        int temp=0;
        int out=0;
        while(num>0){
            temp=num%10;
            out=out*10+temp;

            num=num/10;
        }
        return out;
    }
    public static void main(String[] args) {
        int num=12345;
        ReverseNumber obj=new ReverseNumber();
        int out=obj.reverseNum(num);
        System.out.println("Reverse num is: "+out);
    }
}
