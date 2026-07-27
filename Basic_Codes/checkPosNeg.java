
import java.util.Scanner;

public class checkPosNeg{

    public int posNeg(int x){
        if (x >=0) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        checkPosNeg obj1 =new checkPosNeg();
        int x=sc.nextInt();
        int res = obj1.posNeg(x);
        if(res==1){
            System.out.println("is positive");
        }else{
            System.out.println("is negative");
        }
    }

}