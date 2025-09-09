package algorithms;

import java.util.*;

public class Arrays {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n+1]; 
		for(int i = 1; i<=n;i++) {
			arr[i] = i;
			System.out.print(arr[i]);
		
		}
		for(int j = 0; j<arr.length;j++) {
			if(arr[j]%2==0) {
				int arrEven[] = new int[j+1];
				arrEven[j] = arr[j];
				System.out.println("\nEven numbers:"+arrEven[j]);
			}
			else {
				int arrOdd[] = new int[j+1];
				arrOdd[j] = arr[j]; 
				System.out.println("Even numbers:"+ arrOdd[j]);
			}
		}
		}

	}


