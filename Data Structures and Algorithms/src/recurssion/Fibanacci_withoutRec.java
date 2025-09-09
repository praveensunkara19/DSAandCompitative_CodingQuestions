package recurssion;

public class Fibanacci_withoutRec {
	
	public static void main(String[] args) {
		
		int n =10;
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		
		
		while(n >=2) {
			int n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			n--;
		}
	}
	
}
