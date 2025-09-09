package Graphs;

import java.util.*;

public class WordLadder {
	static class Pair{
		String first;
		int second;
		Pair(String first,int second){
			this.first = first;
			this.second = second;
		}
	}
	
	public static int wordLadder(String startWord,String endWord,String[] wordList) {
		
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(startWord,1));
		
		Set<String> set = new HashSet<>();
		for(String s:wordList) {
			set.add(s);
		}
		set.remove(startWord);
		while(!q.isEmpty()) {
			Pair node = q.poll();
			String word = node.first;
			int step = node.second;
			
			if(word.equals(endWord)) return step;
			
			//replacing the each place in the word with every alphabet
			for(int i=0;i<word.length();i++) {
				char[] oldWord = word.toCharArray();
				for(char ch='a';ch<='z';ch++) {
					oldWord[i] = ch;
					String newWord = new String(oldWord);
					
					if(set.contains(newWord)) {
						set.remove(newWord);
						q.add(new Pair(newWord,step+1));
					}
				}
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {

		String startWord = "hot";
		String endWord = "cog";
		String[] wordList = {"hot","dot","dog","lot","log","cog"};
		
		int res  = wordLadder(startWord,endWord,wordList);
		System.out.println(res);
	}

}
