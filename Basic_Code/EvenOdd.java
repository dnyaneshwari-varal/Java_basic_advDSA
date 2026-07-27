package Basic_Code;
import java.util.*;
public class EvenOdd{
    public int evenOdd(int x){
        if(x%2==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        EvenOdd obj=new EvenOdd();

        int x=sc.nextInt();
        int res=obj.evenOdd(x);

        if(res==1){
            System.out.println(x +"is odd");
        }
        else{
            System.out.println(x +"is even");
        }
            
    }
}