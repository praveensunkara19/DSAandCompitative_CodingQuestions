package Trees;

import java.util.LinkedList;
import java.util.Queue;



public class BinaryTree {
	
	class Node {
	    int data;
	    Node left;
	    Node right;

	    Node(int data) {
	        this.data = data;
	    }
	}

    Node root;

    // Insert a node in level-order (arbitrary binary tree)
    private void insert(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = new Node(data);
                break;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = new Node(data);
                break;
            } else {
                queue.add(current.right);
            }
        }
    }

    // In-order Traversal (left, root, right)
    private void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Pre-order Traversal (root, left, right)
    private void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Post-order Traversal (left, right, root)
    private void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting nodes in level order
        tree.insert(4);
        tree.insert(2);
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);

        System.out.println("In-order Traversal:");
        tree.inorder();
        System.out.println("\nPre-order Traversal:");
        tree.preOrder();
        System.out.println("\nPost-order Traversal:");
        tree.postOrder();
    }
}
