package numbers;

public class Factorial {
	
	public void loop() {
		int n = 5;
		int fact = 1;
		for(int i=1;i<=5;i++) {
			fact = fact*i;
		}
		System.out.println("if loop"+fact);
		
	}
	public int fact(int n) {

		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public void whileloop() {
		int n=5;
		
		int fact =1;
		int i =1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println("while loop"+fact);
	}

	public static void main(String []args) {
		
		
		Factorial obj = new Factorial();
		obj.loop();
		System.out.println("recursion"+obj.fact(5));
		obj.whileloop();
		
	}
}
