package STS4007;
/*
 *  1- base condition
		current positon == lenght  of the string-1 stop the process
	2- loop from current to the length of the string
		swap the element(x,y)
		call the recursion function by increament the current position by 1
		swap the element(x,y)
 */
import java.util.*;

public class PermutationSortedOrder {
	public static void swap(char[] c, int i, int x) {
		char t = c[x];
		c[x] = c[i];
		c[i] = t;
	}
	
	public static void permutation(char[] c, int i) {
		if(i==c.length-1) {
			System.out.println(c);
			return;
		}
		for(int x=i; x<c.length; x++) {
			swap(c,x,i);
			permutation(c,i+1);
			swap(c,x,i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		char[] c= st.toCharArray();
		Arrays.sort(c);
		permutation(c,0);
	}

}
