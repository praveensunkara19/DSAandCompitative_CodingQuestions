package STS4007;

import java.util.*;

public class Matrics {
//	Scanner sc = new Scanner(System.in);
//	 int r = sc.nextInt();
//	 int c = sc.nextInt();
//
//	static int noOfWays(int i, int j) {
////	if(i==r-1 && j==c-1)
//		if (i == 0 || j == 0)
//			return 1;
//		return noOfWays(i, j + 1) + noOfWays(i + 1, j);
//	}
//
//	public static void main(String[] args) {
////System.out.println(noOfWays(0,0));
//		System.out.println(noOfWays(r - 1, c - 1));
//	}

	static int path(int m, int n) {
		if (m == 1 || n == 1)
			return 1;

		return path(m - 1, n) + path(m, n - 1);
	}

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a,b,c;
        System.out.println("Enter test cases : ");
        c=sc.nextInt();
        while(c-- > 0)
        {
           System.out.println("Enter number of rows and columns : ");
         a=sc.nextInt();
         b=sc.nextInt();
         
    
        System.out.println(path(a,b));
           
        }
	}
	}
