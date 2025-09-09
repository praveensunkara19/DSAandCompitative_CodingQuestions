package practice;

import java.util.*;

class ShortestPathDAG {
	static class Pair {
		int first, second;
		Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	public static void topoSort(int src, ArrayList<ArrayList<Pair>> graph, Stack<Integer> st, boolean[] visit) {
		visit[src] = true;
		for (Pair val : graph.get(src)) {
			int v = val.first;
			if (!visit[v]) {
				topoSort(v, graph, st, visit);
			}
		}
		st.push(src);
	}

	public static int[] shortestDist(int n, int m, ArrayList<ArrayList<Pair>> graph, int src, int dest) {
		boolean[] visit = new boolean[n];
		Stack<Integer> st = new Stack<>();

		topoSort(src, graph, st, visit);

		int[] parent = new int[n];
		int[] dist = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);
		Arrays.fill(parent, -1);
		dist[src] = 0; // Source distance is 0

		// Process nodes in topological order
		while (!st.isEmpty()) {
			int node = st.pop();
			if (dist[node] != Integer.MAX_VALUE) { // Only process reachable nodes
				for (Pair val : graph.get(node)) {
					int v = val.first;
					int wt = val.second;
					if (dist[node] + wt < dist[v]) {
						dist[v] = dist[node] + wt;
						parent[v] = node; // Store parent for path reconstruction
					}
				}
			}
		}

		System.out.println("Parent Array: " + Arrays.toString(parent));
		System.out.println("Distance Array: " + Arrays.toString(dist));

		// Path reconstruction
		int node = dest;
		ArrayList<Integer> ans = new ArrayList<>();
		if (parent[node] == -1) {
			return new int[]{-1}; // No path exists
		}
		while (node != -1) {
			ans.add(node);
			node = parent[node];
		}
		Collections.reverse(ans);
		return ans.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] str = input.split(",");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		int index = 2;
		for (int i = 0; i < m; i++) {
			String[] edgeList = str[index].trim().split("\\s+");
			int u = Integer.parseInt(edgeList[0]);
			int v = Integer.parseInt(edgeList[1]);
			int w = Integer.parseInt(edgeList[2]);
			graph.get(u).add(new Pair(v, w));
			index++;
		}
		int src = Integer.parseInt(str[index]);
		int dest = Integer.parseInt(str[index + 1]);

		System.out.println("Graph Representation:");
		for (int i = 0; i < n; i++) {
			System.out.print(i + " -> ");
			for (Pair val : graph.get(i)) {
				System.out.print("(" + val.first + " " + val.second + ") ");
			}
			System.out.println();
		}

		System.out.println("Source: " + src);
		System.out.println("Destination: " + dest);

		int[] ans = shortestDist(n, m, graph, src, dest);
		System.out.println("Shortest Path: " + Arrays.toString(ans));
		sc.close();
	}
}
