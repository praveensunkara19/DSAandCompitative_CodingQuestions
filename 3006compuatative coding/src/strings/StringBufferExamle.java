package strings;


public class StringBufferExamle{
	
	public static void main(String[] srgs) {
		
			StringBuffer sb = new StringBuffer("hello");
			sb.append("java");
			System.out.println(sb);
			
			sb.insert(2, "python"); //insertmethod
			System.out.println(sb);
			
			sb.replace(5, 12, "c++");
			System.out.println(sb);
			
		
	}
	
}