package Arrays;

import java.util.*;

public class ComapringElementsArrList {
	static class Pair implements Comparable<Pair>{
		int first, second;

		Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
		public int compareTo(Pair other) {
			return this.first-other.first;
		}

		public String toString() {
			return "(" + first + "," + second + ")";
		}
	}

	public static void main(String[] args) {
		ArrayList<Pair> arrL = new ArrayList<>();
		arrL.add(new Pair(2, 1));
		arrL.add(new Pair(9, 3));
		arrL.add(new Pair(0, 4));

		Collections.sort(arrL, Comparator.comparingInt(i -> i.first)); //no need to define or intialize explicitly
		System.out.println(arrL);
		System.out.println(Arrays.toString(arrL.toArray()));
	}
}