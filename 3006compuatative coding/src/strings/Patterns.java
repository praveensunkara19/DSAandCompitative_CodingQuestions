package strings;

public class Patterns {
	

	public void star0() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void star1() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star2() {
		
		for(int i =0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star3() {
		for(int i=0; i<5; i++) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star4() {
		for(int i=0; i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public void star5() {
		for(int i=0; i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Patterns p = new Patterns();
		System.out.println("s1:");
		p.star0();
		
		System.out.println("s2:");
		p.star1();

		System.out.println("s3:");
		p.star2();

		System.out.println("s4:");
		p.star3();

		System.out.println("s5:");
		p.star4();

		System.out.println("s6:");
		p.star5();

	}

}
