package Lists;


public class DoubledLinkedList {
    
    static Node head = null;
    static Node tail = null;
    
    
    //Insert at start
    public void insertAtStart(int data) {
    	Node newNode = new Node(data);
    	
    	if(head == null) {
    		head = tail = newNode;
    		head.prev = null;
    		tail.next = null;
    	}else {
    		head.prev = newNode;
    		newNode.next = head;
    		
    		head = newNode;
    		head.prev = null;
    	}
    }
    
    // Insertion at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            // Set the tail's next to the new node and new node's prev to the old tail
            tail.next = newNode;
            newNode.prev = tail;
            
            // Move the tail to the new node
            tail = newNode;
            tail.next = null;
        }
    }
//    insert At Any Position
 // Insert at any position
    public void insertAt(int index, int data){ 
        Node newNode = new Node(data);
        Node node = head;
        
        // If inserting at the start
        if (index == 0) {
            insertAtStart(data);  // Assuming insertAtStart is defined to handle the start case
        } 
        else {
            // Traverse to the node just before the insertion point
            for (int i = 0; i < index - 1 && node != null; i++) {
                node = node.next;
            }
            
            // If node is null, the index is out of bounds
            if (node == null || node.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            
            // Inserting between two nodes
            Node nextNode = node.next; // Save reference to the next node
            
            node.next = newNode;       // Link previous node to the new node
            newNode.prev = node;       // Link new node to the previous node
            
            if (nextNode != null) {    // If it's not the last node
                newNode.next = nextNode;   // Link new node to the next node
                nextNode.prev = newNode;   // Link next node to the new node
            } else {
                // If inserting at the end, update the tail reference
                tail = newNode;
            }
        }
    }
//delete at any position
    public void deleteAt(int index) {
    	Node node = head;
    	if(head == null) {
    		System.out.println("List is empty");
    	}
    	if(index == 0) {
    		deleteAtStart();
    	}
    	else {
    	// Traverse to the node at (index - 1) position
        for (int i = 0; i < index - 1 && node != null; i++) {
            node = node.next;
        }

        // If the index is out of bounds (node is null or the next node is null)
        if (node == null || node.next == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Node to be deleted is node.next
        Node temp = node.next;

        // Update the next pointer of the current node
        node.next = temp.next;

        // If the deleted node is not the last one, update the prev pointer of the next node
        if (temp.next != null) {
            temp.next.prev = node;
        } else {
            // If deleting the last node, update the tail
            tail = node;
        }
    	}
    }
 // Delete at start
    public void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            // Move the head to the next node
            head = head.next;

            // If the list had more than one node, set the new head's prev to null
            if (head != null) {
                head.prev = null;
            } else {
                // If the list became empty after deletion, update tail to null
               tail  = null;
            }
        }
    }
//    delete at end
    public void deleteAtEnd() {
    	if(tail == null) {
    		System.out.print("List is empty");
    	}
    	else if(head == tail) {
    		head  = tail = null;
    	}
    	else {
    		tail = tail.prev;
    		tail.next = null;
    	}
    }

    // Forward traversing
    public void forwardTraversing(Node head) {
        Node node = head;
        
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    
    // Backward traversing
    public void backTraversing(Node tail) {
        Node node = tail;
        
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.prev;
        }
        System.out.println();
    }
    
	public static void main(String args[]) {
		DoubledLinkedList list = new DoubledLinkedList();
		
		
		System.out.println("InsertAtStart");
		list.insertAtStart(0);
		list.insertAtStart(5);
		list.insertAtStart(4);
		list.forwardTraversing(head);
		
		System.out.println("insertAtEnd");
		list.insertAtEnd(12);
		list.forwardTraversing(head);
		
		list.insertAtEnd(8);
		list.insertAtEnd(10);
		
		
		System.out.println("farward Traversing");
		list.forwardTraversing(head);
		System.out.println("backward Traversing");
		list.backTraversing(tail);
		
		System.out.println("insertAtAny position");
		list.insertAt(3, 14);
		list.forwardTraversing(head);
		
		System.out.println("delete at start");
		list.deleteAtStart();
		
		list.forwardTraversing(head);
		
		System.out.println("delete at end");
		list.deleteAtEnd();
		
		list.forwardTraversing(head);
		
		System.out.println("delete at any position");
		list.deleteAt(3);
		
		list.forwardTraversing(head);
	}
}
