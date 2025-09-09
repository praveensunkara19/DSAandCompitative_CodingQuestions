package Stack;

public class DStack {
	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;
	
//	push method
	public void push(int data) {
		if(size() == capacity) 
			expand();
		
		stack[top] = data;
		top++;
	}
//	expand method to increase the size of the array dynamically
	public void expand() {
		int length = size();
		capacity *= 2;
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack  =newStack;

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
			shrink();
		}
		return data;
	}
//	Shrink method to reduce the size of the array by half, if its len is less than 1/4 of its size
	public void shrink() {
		int length = size();
		
		if (length <= (capacity/2)) {
	        capacity = capacity / 2;
		}
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;

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
		for(int n : stack) {
//		for(int i=0;i<size();i++) {
		System.out.print(n + " ");
//			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		DStack dstack = new DStack();
		System.out.println(dstack.isEmpty());
		
		dstack.push(2);
		dstack.show();
		dstack.push(5);
		dstack.show();
		dstack.push(9);
		dstack.show();
		dstack.push(8);
		dstack.show();
		dstack.push(3);
		dstack.show();
		dstack.push(12);
		dstack.show();
		dstack.push(10);
		dstack.show();
		
		System.out.println("deleting the ele:");
		
		dstack.pop();
		dstack.show();
		dstack.pop();
		dstack.show();
		dstack.pop();
		dstack.show();
		dstack.pop();
		dstack.show();
		dstack.pop();
		dstack.show();
		dstack.pop();
		dstack.show();
		
		
		
		
	}
	}