package Strings;

public class reversingString1 {

	public static void main(String[] args) {
		
		String str = reversingwords1("hello world");
		System.out.println(str);
		System.out.println(reversingword2("praveen sunkara"));
	}
	
	static String reversingwords1(String s) {
		String[] st = s.split(" ");
		String rev = " ";
		for(int i=st.length;i>=0;i--) {
			rev = st + rev + " ";		
		}
		
		
		return rev.toString().trim();
}
	static String reversingword2(String s) {
		String[] words = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		return sb.toString().trim();		
	}
	}
