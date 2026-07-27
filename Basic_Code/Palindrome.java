package Basic_Code;
public class Palindrome {

    public int checkPalindrome(int x){
        int temp=0;
        int out=0;
        while(x>0){
            temp=x%10;
            out=out*10+temp;
            x=x/10;
        }
        return out;

    }
    public static void main(String[] args) {
        int x=121;
        // int x_temp=x;
        Palindrome obj =new Palindrome();
        int output=obj.checkPalindrome(x);
        if(x==output){
            System.out.println(x +" Is pallindrome");
        }
        else{
            System.out.println(x +" Is not pallindrome");
        }
    }
}
