package Lists;

//class Node {
//
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class SingleLinkedList {

//insertion of the elements
    static Node head;

    public  void inser(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } 
        else {
        	
            Node node = head;
            while (node.next != null) { // Fixed condition to find the last node
                node = node.next;
            }
            node.next = newNode; // Insert the new node at the end
        }
    }

public void insertion(int data) {
	
	    Node newNode = new Node(data);
	
	    if (head == null) {
	        head = newNode;
	    } 
	    else {
	    	
	        Node node = head;
	        while (node.next != null) { // Fixed condition to find the last node
	            node = node.next;
	        }
	        node.next = newNode; // Insert the new node at the end
	    }
	}

	//	inserting at the start
    public  void insertAtStart(int data) {

        Node newNode = new Node(data);
        if(head == null) {
        	newNode = head;
        }
        else {
        newNode.next = head;
        head = newNode;
        }
    }
    
    
//    inserting at any position
    public  void insertAt(int n, int data) {
    	
    	Node newNode = new Node(data);
    	
    	Node node = head;
    	
    	if(n == 0) {
    		insertAtStart(data);
    	}
    	else {
    	for(int i=0;i<n-1;i++) {
    		node = node.next;
    	}
    	newNode.next = node.next;
    	node.next = newNode;
    }

}
    
//    deleting the node
    public  void deleteAt(int index) {
    	Node node = head;
    	Node n1 = null;
    	if(index == 0) {
    		head = head.next;
    	}
    	else {
    		for(int i=0;i<index-1;i++) {
    			node = node.next;
    		}
    		n1 = node.next;
    		node.next = n1.next;
    		n1 = null;  //eligible for garbage collection
    	}
    }
    
//	traversing of the linkedList
    public void traverse(Node head) {
        // Start from the head of the linked list
        Node node = head;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.inser(0);
        linkedList.inser(2);
        linkedList.inser(6);
        linkedList.inser(3);

     System.out.print("after inserting: ");
     linkedList.traverse(head);
     
     System.out.println("after insertAtStart");
        linkedList.insertAtStart(9);
        linkedList.traverse(head);

        
        System.out.println("after insertionAt:");
        linkedList.insertAt(0, 4);
        linkedList.traverse(head);

        
        System.out.println("after deleteAt:");
        linkedList.deleteAt(2);
        linkedList.deleteAt(0);

        linkedList.traverse(head);
    }

}
