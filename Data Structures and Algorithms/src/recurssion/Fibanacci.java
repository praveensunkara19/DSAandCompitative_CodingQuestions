package recurssion;


public class Fibanacci {
	
	public static int fib(int n) {
		

		if(n<=0) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static void main(String[] args) {
		int N = 10;
		for(int i=0;i<N;i++) {
		System.out.print(fib(i));
		}
	}

}
