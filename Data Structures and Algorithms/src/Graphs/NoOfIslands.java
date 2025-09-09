package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class NoOfIslands {

    public static void bfs(int row, int col, int[][] visit, int[][] grid) {
        visit[row][col] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));

        int n = grid.length;
        int m = grid[0].length;

        // Directions for 8 possible movements (row, col)
        int[] delRow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] delCol = {-1, 0, 1, -1, 1, -1, 0, 1};

        while (!q.isEmpty()) {
            Pair current = q.poll();
            int row1 = current.first;
            int col1 = current.second;

            for (int i = 0; i < 8; i++) {
                int nrow = row1 + delRow[i];
                int ncol = col1 + delCol[i];

                // Check bounds and conditions for visiting
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && grid[nrow][ncol] == 1 && visit[nrow][ncol] == 0) {
                    visit[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
    }

    public static int numIsLand(int[][] grid) {
        int count = 0;

        int n = grid.length;
        int m = grid[0].length;
        int[][] visit = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (visit[row][col] == 0 && grid[row][col] == 1) {
                    count++;
                    bfs(row, col, visit, grid);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 1, 0, 1}
        };

        int result = numIsLand(grid);
        System.out.println("Number of islands: " + result);
    }
}
