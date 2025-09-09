package memoization;

import java.util.*;
/*
 * Actually create the HashMap or HashTable then cache the result...
 */

public class MemoizaitonFib {
	
	Map<Integer, Integer> memoizetable = new HashMap<>(); 
	
	public  int fib(int n) {
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		
		if(memoizetable.containsKey(n)) {
			return memoizetable.get(n);
		}
		
		int result = fib(n-1) + fib(n-2);
		
		memoizetable.put(n, result);

		
		return result;
	}

	public static void main(String[] args) {
		
		MemoizaitonFib obj = new MemoizaitonFib();
		
		for(int i=0;i<=5;i++)
		System.out.print(obj.fib(i)+" ");
		
	}
}
