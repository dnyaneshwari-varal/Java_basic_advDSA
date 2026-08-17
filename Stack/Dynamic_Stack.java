package Stack_;

public class Dynamic_Stack {

	int stack[]=new int[5];
	int top=-1;
	
	public void push(int a) {

	    if(top == stack.length - 1) {
	        expand();              // Increase array size
	    }
			

		top++;
		stack[top]=a;
		
	}
 
	public void expand() {
		int newStack[]=new int[stack.length*2];
		
		for(int i=0;i<stack.length;i++) {
			newStack[i]=stack[i];
		}
		
		stack=newStack;
	}
	
	public void display() {
		
		if(top == -1){
	        System.out.println("Stack is Empty");
	        return;
	    }
		for(int i=top; i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Removed: " + stack[top]);
			stack[top]=0;
	        top--;
	        
		}
	}
	
	public void isEmpty() {
		if(top==-1) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println("Stack is not Empty");
		}
	}
	
	public void isFull() {
		 if(top == stack.length - 1) {
		        System.out.println("Stack is Full");
		    } else {
		        System.out.println("Stack is Not Full");
		    }
	}
	
	public void peek() {
		if(top==-1) {
			System.out.println("Stack is Empty");
		}else {
		System.out.println("Peek element is: "+stack[top]);
		}
	}
	
	public static void main(String[] args) {
		
		Dynamic_Stack obj = new Dynamic_Stack();
		obj.display();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.push(60);
		
		obj.display();

		obj.isEmpty();
		
		obj.isFull();
		
		obj.pop();
		obj.display();
		obj.push(60);
		obj.display();
		obj.pop();
		obj.peek();
		obj.display();
		
	
		
	}
}
