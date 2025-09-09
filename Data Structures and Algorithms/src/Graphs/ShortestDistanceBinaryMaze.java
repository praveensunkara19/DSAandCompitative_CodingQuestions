package Graphs;


import java.util.*;

class shortestDistanceBinaryMaze {
	static class Pair {
		int first;
		int second;

		Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	public static int shortestPath(int[][] graph, Pair src, Pair dest) {

		int n = graph.length;
		int m = graph[0].length;
		Queue<Pair> q = new LinkedList<>();
		int[][] visit = new int[n][m];
		for (int[] row : visit) {
			Arrays.fill(row, Integer.MAX_VALUE);
		}
		visit[src.first][src.second] = 0;
		q.add(new Pair(src.first, src.second));
		while (!q.isEmpty()) {
			Pair pair = q.poll();
			int i = pair.first;
			int j = pair.second;
			int[] delRow = { -1, 0, 1, 0 };
			int[] delCol = { 0, 1, 0, -1 };
			for (int k = 0; k < 4; k++) {
				int nRow = i + delRow[k];
				int nCol = j + delCol[k];
				if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && graph[nRow][nCol] == 1) {
					if (visit[i][j] + 1 < visit[nRow][nCol]) {
						visit[nRow][nCol] = visit[i][j] + 1;
						q.add(new Pair(nRow, nCol));
					}
					if (nRow == dest.first && nCol == dest.second) {
						return visit[nRow][nCol];
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[][] graph = { { 1, 1, 1, 1 },
						{ 1, 1, 0, 1 },
						{ 1, 1, 1, 1 },
						{ 1, 1, 0, 0 }, 
						{ 1, 0, 0, 0 },
						};
		Pair src = new Pair(0, 1);
		Pair dest = new Pair(2, 2);
		int dist = shortestPath(graph, src, dest);
		System.out.println(dist);
	}
}