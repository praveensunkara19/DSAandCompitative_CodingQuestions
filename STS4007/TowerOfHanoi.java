package STS4007;

public class TowerOfHanoi {
	
	static void hanoi(int n, char Src, char Aux, char Dest) {
		if(n==0)
			return;
		hanoi(n-1,Src,Dest,Aux);
		System.out.println(Src + "--->" + Dest);
		hanoi(n-1, Aux, Src, Dest);
	}

	public static void main(String[] args) {
//		TowerOfHanoi obj = new 
		hanoi(3,'A','B','C');
	}

}
