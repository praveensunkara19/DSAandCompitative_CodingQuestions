package Generics;

import java.util.*;

class Pair<T, U> {
	T first;
	U second;

	Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		return "(" + first + "," + second + ")";
	}
}

class PairInPair {
	public static void main(String[] args) {
		List<Pair<Integer, Pair<Integer, Integer>>> arr = new ArrayList<>();

		arr.add(new Pair<>(3, new Pair<>(4, 5)));
		System.out.println(arr);

		Pair<Integer, Pair<Integer, Integer>> a = arr.get(0);
		Pair<Integer, Integer> b = a.second;
		System.out.println(a.first);
		System.out.println(b.first + "," + b.second);

	}
}