package arrays;

//** Question:
// Input: [apple,ball,cat,dog],2,dog
// Output: 1

// Input: [aaa,bbb,ccc,ddd,eee],1,eee
// Output: 2

//here tring backward direction
//ytlink: https://www.youtube.com/watch?v=cmmBtqCYjaw

public class CircularArrayList {

	public static void main(String[] args) {
		String[] inputArray = {"aaa","bbb","ccc","ddd","eee","fff"};
		System.out.println(solution(inputArray,2,"fff"));
	}
		
		private static int solution(String[] inputArray, int startPosition, String target) {
			int len = inputArray.length;
			int forwardCount = 0;
			int backwardCount = 0;
			boolean found  = false;
			int pos = startPosition;
			if(inputArray[startPosition] == target) {
				return 0;
			}
			while(!found) {
				pos++;
				if(pos >= len) {
					pos = 0;
				}
				if(inputArray[pos] != target) {
					forwardCount++;
				}
				else {
					forwardCount++;
					found = true;
				}
			}
			found = false;
			pos = startPosition;
			while(!found) {
				pos --;
				if(pos <0) {
					pos = len-1;
				}
				if(inputArray[pos] != target) {
					backwardCount++;
				}
				else {
					backwardCount++;
					found = true;
				}
			}
			return forwardCount>backwardCount ? backwardCount : forwardCount;
		}

}
	