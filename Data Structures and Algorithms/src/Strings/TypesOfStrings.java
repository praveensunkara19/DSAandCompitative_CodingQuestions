package Strings;

public class TypesOfStrings {

	public static void main(String[] args) {

		String s = "hello";
		s  = s + "world";
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("hellosb");
		sb.append("worldsb");
		System.out.println(sb);
		
		StringBuilder sbd = new StringBuilder("hellosbd");
		sbd.append("worldsbd");
		System.out.println(sbd);
		
	}

}

