package OtherProblems;

public class LcmGcd {
	public static int gcd(int a,int b) {
		if(a==0) return b;
		return gcd(b/a,a);
	}
	public static long lcm(int a,int b) {
		return (long)a*b/gcd(a,b);
	}
	
	public static void main(String[] args) {
		int a = 50;
		int b = 25;
		
		System.out.println("gcd: "+gcd(a,b));
		System.out.println("lcm: "+lcm(a,b));
		
	}

}
