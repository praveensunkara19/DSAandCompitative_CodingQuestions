package Graphs;
import java.util.*;

public class MergeAccounts extends Disjoint {
    MergeAccounts(int n) {
        super(n);
    }
    
    public static List<List<String>> accountsMerge(List<List<String>> accounts){
    	int n = accounts.size();
    	Disjoint ds = new Disjoint(n);
    	HashMap<String,Integer> mapMailNode = new HashMap<>();
    	//maping mails to node
    	for(int i=0;i<n;i++) {
    		for(int j=1;j<accounts.get(i).size();j++) {
    			String mail = accounts.get(i).get(j);
    			if(!mapMailNode.containsKey(mail)) {
    				mapMailNode.put(mail, i);
    			}
    			else {
    				ds.unionBySize(i, mapMailNode.get(mail));
    			}
    		}
    	}
    	
    	//merget the mails
    	ArrayList<String> mergedList[] = new ArrayList[n];
    	for(int i=0;i<n;i++) mergedList[i] = new ArrayList<>();
    	for(Map.Entry<String,Integer> val : mapMailNode.entrySet()) {
    		String mail = val.getKey();
    		int node = ds.findUlParent(val.getValue());
    		mergedList[node].add(mail);
    	}
    	
    	//sorting the arrlist
    	List<List<String>> ans = new ArrayList<>();
    	for(int i=0;i<n;i++) {
    		if(mergedList[i].size()==0) continue;
    		Collections.sort(mergedList[i]);
    		ArrayList<String> temp = new ArrayList<>();
    		temp.add(accounts.get(i).get(0));
    		for(String it:mergedList[i]) {
    			temp.add(it);
    		}
    		ans.add(temp);
    		
    	}
    	return ans;
    }

    public static void main(String[] args) {
        List<List<String>> accounts = Arrays.asList(
            Arrays.asList("John", "j1@mail.com", "j2@mail.com","j3@mail.com"),
            Arrays.asList("John", "j4@mail.com"),
            Arrays.asList("Raj","r1@mail.com","r2@mail.com"),
            Arrays.asList("John", "j1@mail.com","j5@mail.com"),
            Arrays.asList("Raj","r2@mail.com","r3@mail.com"),
            Arrays.asList("Mary", "m1@mail.com")
        );

//        System.out.println(accounts);
        
        List<List<String>> ans = accountsMerge(accounts);
        System.out.print(ans);
    }
}
