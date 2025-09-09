package STS4007;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class LeftView {
    // Method to get the left view of the binary tree
    static void leftView(TreeNode root, List<Integer> list, int level) {
        if (root == null) {
            return;
        }
        
        // If this is the first node of its level
        if (level == list.size()) {
            list.add(root.data);
        }
        
        // Recur for left and right subtrees
        leftView(root.left, list, level + 1);
        leftView(root.right, list, level + 1);
    }

    // Method to insert nodes in the binary tree level by level
    static TreeNode buildTreeFromInput(Scanner sc) {
    	
    	//
        System.out.println("Enter the root value: ");
        int rootVal = sc.nextInt();
        TreeNode root = new TreeNode(rootVal);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            System.out.println("Enter left child of " + current.data + " (or -1 if no left child): ");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }

            System.out.println("Enter right child of " + current.data + " (or -1 if no right child): ");
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.add(current.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Build the tree from user input
        TreeNode root = buildTreeFromInput(sc);

        // List to store the left view
        List<Integer> list = new ArrayList<>();
        
        // Calculate the left view
        leftView(root, list, 0);

        // Print the left view
        System.out.println("The left view is:");
        for (int nodeVal : list) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();

        sc.close();
    }
}
