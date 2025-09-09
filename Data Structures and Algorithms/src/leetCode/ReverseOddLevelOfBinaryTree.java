package leetCode;

import java.util.*;

 // Definition for a binary tree node.
 class TreeNode {
	 int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
    	 this.val = val;
         this.left = left;
         this.right = right;
      }
  }
 
class ReverseOddLevelOfBinaryTree {
	
    public TreeNode reverseOddLevels(TreeNode root) {
        
        List<List<Integer>> result  = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>(); //Queue is used for BFS in tree
        queue.add(root);

        //BFS starts
        while(!queue.isEmpty()){
            int  size = queue.size();
            List<Integer> node_on_that_level = new ArrayList<>();
            //adds each level elements to the list [[1],[2,3].[4,5,6]]
            for(int i=0;i<size;i++){
                TreeNode temp = queue.remove();
                node_on_that_level.add(temp.val);

                if (temp.left!=null)
                    queue.add(temp.left);
                
                if(temp.right!=null)
                    queue.add(temp.right);
                
            }
            result.add(node_on_that_level);
        }

        //swapping the elements from right and left
        for(int i=0;i<result.size();i++){
            //for odd levels, we will reverse the order of the nodes
            if(i%2==1)
            Collections.reverse(result.get(i));
        }


    //adding back the reversed elements to the tree
    queue.add(root);
    int level = 0;

    //BFS starts
    while(!queue.isEmpty()){
        int size = queue.size();
        for(int i=0;i<size;i++){
            TreeNode temp = queue.remove();
            temp.val  = result.get(level).get(i);

            if (temp.left != null)
            queue.add(temp.left);
            if(temp.right != null)
            queue.add(temp.right);
        }

        level++;
    }
    
    return root;
    }
}