package Stack_;

import java.util.Scanner;

public class MenuDrivenStack {
	int top=-1;
	int stack[]=new int[5];
	
	 public void push(int num) {

	        if (top == stack.length - 1) {
	            System.out.println("Stack Overflow");
	            return;
	        }

	        top++;
	        stack[top] = num;
	    }

    public void searchElement(int searchEle) {
        for(int i=0;i<stack.length;i++) {
        		if(stack[i]==searchEle) {
        			System.out.println(searchEle+" Element is present");
        		}
        }
    }

    public void largestElement() {
    	int max=stack[0];
        for(int i=1;i<stack.length;i++) {
     	   		if(stack[i] > max) {
     	   			max=stack[i];
     	   		}
        }
        System.out.println(max +" is largest number");
    }

    public void smallestElement() {
    	
    		int mid=stack[0];
       for(int i=1;i<stack.length;i++) {
    	   		if(stack[i] < mid) {
    	   			mid=stack[i];
    	   		}
       }
       System.out.println(mid +" is smallest number");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        MenuDrivenStack obj = new MenuDrivenStack();
       
        obj.push(90);
        obj.push(30);
        obj.push(50);
        obj.push(40);
        obj.push(60);
        obj.push(20);
        

        while (true) {
            System.out.println("1. Search element");
            System.out.println("2. Largest element");
            System.out.println("3. Smallest element");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");

            int num = sc.nextInt();

            switch (num) {

                case 1:
                	 System.out.print("Enter element: ");
                     int search = sc.nextInt();
                     obj.searchElement(search);
                     break;

                case 2:
                    obj.largestElement();
                    break;

                case 3:
                    obj.smallestElement();
                    break;

                case 4:
                    System.out.println("Exit!");
                    sc.close();
                    return;

                default:
                    System.out.println("Enter a valid option");
            }
        }
    }
}