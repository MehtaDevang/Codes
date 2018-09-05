import java.util.*;
public class LongLong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim();
		int len = str.length();
		HashMap<String, Integer> set = new HashMap<>();
		long max_len = 0;
 		for(int i = 0; i < len; i++) {
			for(int j = len; j > i; j--) {
			    String sub = str.substring(i, j);
			    
				if(!set.containsKey(sub)){
					set.put(sub, 1);
				}
				else {
					set.put(sub, set.get(sub) + 1);
				}
			}
		}
 		for(String s : set.keySet()){
 		    if(set.get(s) >=2){
 		        if(s.length() > max_len){
 		            max_len = s.length();
 		        }
 		    }
 		    
 		}
 		System.out.println(max_len);
	}
}
