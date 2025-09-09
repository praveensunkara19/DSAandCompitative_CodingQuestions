package Trees;

import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
	}
}

public class BST {
	
	Node root;
	
	private void insert(int data) {
		root = insertRec(root,data);
	}
	
	private Node insertRec(Node root, int data) {
		
		if(root ==null) {
			root = new Node(data);
		}
		else if(data < root.data) {
			root.left = insertRec(root.left, data);
		}
		else if(data > root.data) {
			root.right = insertRec(root.right,data);
		}
		
		return root;
	}
	
//	inorder
	private void inorder() {
		inorderRec(root);
	}
	private void inorderRec(Node root) {
		
		if(root != null) {
			inorderRec(root.left);
			System.out.print(root.data+ " ");
			inorderRec(root.right);
		}
	}
	
//	preorder(root,left,right)
	
	private void preOrder() {
		preOrderRec(root);
	}
	
	private void preOrderRec(Node root) {
		if(root!=null) {
			System.out.print(root.data+ " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	
//	postorder(left,right,root)
	
	private void postOrder() {
		postOrderRec(root);
	}

	
	private void postOrderRec(Node root) {
		if(root!=null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	
	
 public static void main(String[] args) {

	 BST tree = new BST();
	 tree.insert(4);
	 tree.insert(2);
	 tree.insert(5);
	 tree.insert(3);
	 tree.insert(8);
	 tree.insert(1);
	 
	 tree.inorder();
	 System.out.println();
	 tree.preOrder();
	 System.out.println();
	 tree.postOrder();
 }


 }

