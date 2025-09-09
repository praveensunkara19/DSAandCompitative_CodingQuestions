package Stack;

public class Stack {
	int[] stack = new int[5];
	int top = 0;
	
//	push method
	public void push(int data) {
		if(top == stack.length) {
			System.out.println("Stack is full");
		}
		else {
			stack[top] = data;
			top++;
		}
	}
	
//	pop method
	public int pop() {
		int data = 0;
		if(isEmpty() == true) {
			System.out.println("Stack is empty");
		}
		else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}
	
//	peek method
	public int peek() {
		int data =0;
		if(isEmpty() == true) {
			System.out.println("stack is empty");
		}
		else {
		 data = stack[top-1];
			
	}
		return data;
	}
	
//	size method
	public int size() {
		return top;
	}
	
//	isEmpty method
	public boolean isEmpty() {
		
		return top<=0;
	}
	
//	show method
	public void show() {
		for(int n:stack)
		System.out.print(n+ " ");
	}
	public static void main(String[] args) {

		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		
		stack.push(7);
		stack.push(9);
		stack.push(2);
		
		stack.show();
		
		System.out.println();
		System.out.println("poped element: "+stack.pop());

		stack.show();
		
		System.out.println();
		System.out.println("peek element: "+stack.peek());
		
		stack.show();
		
		System.out.println();
		System.out.println("size:"+ stack.size());
		
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.pop();
		
		stack.show();
		System.out.println();
		System.out.println("Stack size "+ stack.size());
		
		stack.peek();
	}

}
