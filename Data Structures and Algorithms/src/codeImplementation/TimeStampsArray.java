package codeImplementation;

import java.util.*;

class TimeStampsArray {
    public static int[] timeStamps(ArrayList<List<Integer>> arrlist) {
        // Sort the input list based on the priority (first element)
        arrlist.sort((a, b) -> a.get(0) - b.get(0)); //accending order basing on 0th element

        // Extract the timestamps in sorted order
        int n = arrlist.size();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arrlist.get(i).get(1);
        }

        return result;
    }

    public static void main(String[] args) {
        // Define the input array list
        ArrayList<List<Integer>> arrlist = new ArrayList<>();
        arrlist.add(Arrays.asList(2, 120));
        arrlist.add(Arrays.asList(3, 150));
        arrlist.add(Arrays.asList(1, 130));
        arrlist.add(Arrays.asList(4, 170));

        // Get the sorted timestamps
        int[] results = timeStamps(arrlist);

        // Print the results
         System.out.println("Sorted Timestamps: " + Arrays.toString(results));
//        System.out.print(results);
    }
}
