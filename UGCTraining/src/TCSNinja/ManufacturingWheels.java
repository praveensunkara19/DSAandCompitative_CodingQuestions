package TCSNinja;

import java.util.Scanner;
public class ManufacturingWheels {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		int v = sc.nextInt();
		int w = sc.nextInt();
		
			int TW = (v*4-w)/2;
			int FW = (v-TW);

		System.out.println("TW : "+TW +" "+ "FW : "+FW);
		System.out.println();
		
		
		

		
	}
}
