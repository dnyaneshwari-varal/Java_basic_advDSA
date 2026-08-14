package Stack_;

public class Stack_Operations {
	int stack[]=new int[5];
	int top=-1;
	
	public void push(int a) {
		if(top==stack.length-1) {
			System.out.println("Stack is overflow");
			
		}else {
			top++;
			stack[top]=a;
		}
	}
 
	public void display() {
		for(int i=top; i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Removed: " + stack[top]);
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
		
		Stack_Operations obj=new Stack_Operations();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
//		obj.push(50);
		
		obj.display();
		
		obj.pop();
		
		obj.display();
		obj.isEmpty();
		obj.isFull();
		
		obj.peek();
		
	}

}
