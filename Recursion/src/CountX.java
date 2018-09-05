import java.util.*;
public class CountX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CountX obj = new CountX();
		
		int count = obj.countX(scanner.nextLine());
		System.out.print(count);
	}
	
	public int countX(String str) {
		if(str.equals("")){
//			System.out.println("Completed");
		    return 0;
		  }
		  else if(str.charAt(0) == 'x'){
//			  System.out.println("Started");
		    return countX(str.substring(1)) + 1;
		  }
		  else{
		    return countX(str.substring(1)); 
		  }
	}
}
