package leetCode;

public class CountPrefixandSuffixPairsI {
	 public static int countPrefixSuffixPairs(String[] words) {
	        
		 int count =0;
		 for(int i=0;i<words.length;i++) {
			 for(int j=i+1;j<words.length;j++) {  //j>i
				 
				 String prefixSuffix = words[i];
				 String targetWord = words[j];
				 if(targetWord.startsWith(prefixSuffix) && targetWord.endsWith(prefixSuffix)) {
					 count++;
				 }
			 }
		 }
		 return count;
	    }
	 public static void main(String[] args) {
		 String[] words = {"a", "aba", "ababa", "aa"};
		 int  result = countPrefixSuffixPairs(words);
		 System.out.println(result);
	}
}
