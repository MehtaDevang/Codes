import java.util.*;
public class FirstUpperCase {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		FirstUpperCase obj = new FirstUpperCase();
		
		String str = scanner.nextLine();
		
		int index = obj.findIndex(str, 0);
		System.out.println(index);
	}
	
	public int findIndex(String str, int index) {
		
		if(str.equals("")){
			return -1;
		}
		
		else if(Character.isUpperCase(str.charAt(0))){
			return index;
		}
		else {
			return findIndex(str.substring(1),index+1);
		}
	}
}
