package strings;
public class CharRevisit {
	public void reverse() {
		String s = "happy";
		String em = "";
		
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			em=c+em;
		}
		System.out.println(em);
		
	}
	public void reverseNUmber() {
		int r,sum=0,temp;
		int n=345;
		temp = n;
		while(n>0) {
			r=n%10;
			sum= (sum*10)+r;
			n=n/10;
			
		}
		System.out.println(sum);
		if(temp == n) {
			System.out.println("palindrom");
			
		}
		else {
			System.out.println("not a palindrom");
		}
	}
    public static void main(String[] args) {
    	CharRevisit obj = new CharRevisit();
    	obj.reverse();
    	obj.reverseNUmber();
    	
    	
//        String s1 = "hari";
//        String s2 = "ritta";
//        int l1 = s1.length();
//        int l2 = s2.length();
//        
//        char[] ch1 = s1.toCharArray();
//        char[] ch2 = s2.toCharArray();
//        
//        for (int i = 0; i < l1; i++) {
//        	char ch = ch1[i];
//        for(int j=0; j<l2;j++) {
//        	if(i!=j) {
//        		System.out.println(ch2[j]+ch);
//        	}
//        }
//        		
//            
//           
//        	
//        }
    }
}
