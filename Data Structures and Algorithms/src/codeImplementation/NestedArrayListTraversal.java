package codeImplementation;

import java.util.*;

class NestedArrayListTraversal {
	
    public static void main(String[] args) {
    	
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        List<List<Integer>> arrTo = new ArrayList<>();
        
        int index = 0;
        int level = 0;

        while (index < arr.length) {
            int nodesAtLevel = (int) Math.pow(2, level); // Number of nodes at this level
            List<Integer> inArr = new ArrayList<>();

            for (int i = 0; i < nodesAtLevel && index < arr.length; i++) {
                inArr.add(arr[index++]);
            }

            arrTo.add(inArr);
            level++;
        }

        // Print the binary tree-like structure
        for (List<Integer> levelNodes : arrTo) {
            System.out.println(levelNodes);
        }
    }
}
