package Queues;



public class Queue {
	
	int[] queue = new int[5];
	int rare;
	int front;
	int size;
	
	
	public void enQueue(int data) {
		if(!isFull()) {
		queue[rare] = data;
		rare = (rare+1)%5;
		size++;
	}
		else {
			System.out.println("queue is full");
		}
	}
	public int deQueue() {
		
		int data = queue[front];
		
		if(!isEmpty()) {
			front = (front+1)%5;
			size--;
		}
		else {
			System.out.println("queue is empty");
		}
		return data;
	}
//	size of the queue
	public int getSize() {
		return size;
	}
//	isEmpty method
	public boolean isEmpty() {
		return getSize()<=0;
	}
//	isFull method
	public boolean isFull() {
		return getSize() == queue.length;
	}
	
	public void show() {
		System.out.print("elements: ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
		System.out.println();
		for(int n:queue) {
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		
		Queue q = new Queue();
//		q.enQueue(5);
//		q.enQueue(2);
//		q.enQueue(9);
//		q.enQueue(91);
//		q.enQueue(3);
		
		
		q.enQueue(4);
		q.enQueue(10);
		
//		q.deQueue();
//		q.deQueue();
		
		System.out.println(q.getSize());
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		
		
		q.show();
	
	}

}
