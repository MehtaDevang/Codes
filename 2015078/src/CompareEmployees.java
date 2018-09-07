import java.util.*;

class Checker implements Comparator<Employee>{
	public int compare(Employee player1, Employee player2) {
		
		if(player1.salary < player2.salary) {
			return 1;
		}
		else if(player2.salary < player1.salary) {
			return -1;
		}
		else {
			return player1.name.compareTo(player2.name);
		}
	}

//	@Override
//	public int compare(Employee arg0, Employee arg1) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
}



class Employee{
	String name;
	int salary;
	
	public Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
    {
        return this.name + " " + this.salary;
    }
}


public class CompareEmployees {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Checker checker = new Checker();
		int t = scanner.nextInt();
		for(int i = 0; i < t; i++){
		    int n = scanner.nextInt();
		    ArrayList<Employee> array = new ArrayList<>();
		    for(int j = 0; j < n; j++) {
		    	String str = scanner.next();
		    	int sal = scanner.nextInt();
		    	Employee e = new Employee(str, sal);
		    	array.add(e);
		    }
		    Collections.sort(array, new Checker());
		    for(Employee e : array) {
		    	System.out.print(e.name + " : " + e.salary);
		    }
		}
	}
}
