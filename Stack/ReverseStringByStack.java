package Stack_;

public class ReverseStringByStack {
	int top=-1;
	String revS="";
	char stack[]=new char[5];
	public  String reverseStringByStack(String str) {
		
		for(int i=0;i<str.length();i++) {
			push(str.charAt(i));
		}
		for(int i=top;i>=0;i--) {
			pop();
		}
		return revS;
		
	}
	public void push(char ch) {
		
		if(top==stack.length-1) {
			expand();
			
		}
		top++;
		stack[top]=ch;
		return;
		
	}
	public void expand() {
		
			char newStack[]=new char[stack.length*2];
			for(int i=0;i<stack.length;i++) {
				newStack[i]=stack[i];
			}
			stack=newStack;
			
		
	}
	
	public void pop() {
		revS=revS+stack[top];
		
		top--;
		return;
	}

	public static void main(String[] args) {
		String str="Dnyaneshwari varal";
		ReverseStringByStack obj=new ReverseStringByStack();
		String ans=obj.reverseStringByStack(str);
		System.out.println(ans);

	}

}
