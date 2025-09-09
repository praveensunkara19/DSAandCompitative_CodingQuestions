package Trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class LevelOrder {
	
	class Node{
		int data;
		Node right;
		Node left;
		
		Node(int data){
			this.data = data;
		}
	}
	
	static Node root;

	public void insert(int data) {
		root = insertRec(root,data);
	}
	
	public Node insertRec(Node root, int data) {
		if(root == null) {
			root = new Node(data);
		}
		else if(data < root.data) {
			root.left = insertRec(root.left,data);
		}
		else if(data>root.data) {
			root.right = insertRec(root.right,data);
		}
		return root;
	}
	
	public List<List<Integer>> levelOrder(Node root){
		
	Queue<Node> queue = new LinkedList<Node>();
	List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
	
	if(root == null) return wrapList;
	
	queue.offer(root);
	
	while(!queue.isEmpty()) {
		int levelNum = queue.size();
		List<Integer> subList = new LinkedList<Integer>();
		for(int i=0;i<levelNum;i++) {
		if(queue.peek().left != null) queue.offer(queue.peek().left);
		if(queue.peek().right != null) queue.offer(queue.peek().right);
		subList.add(queue.poll().data);
		}
		wrapList.add(subList);
	}
	return wrapList;
	}
	

	
public static void main(String[] args) {
	
	LevelOrder tree = new LevelOrder();
	
	tree.insert(4);
	tree.insert(1);
	tree.insert(8);
	tree.insert(3);
	tree.insert(7);
	
	
	System.out.println(tree.levelOrder(root));
	
		
}
}
