import java.util.*;
public class ListInsertion {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			list.add(r.nextInt(30));
		}
		System.out.println(list);
		list.add(2,  10);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		for(int o : list) {
			System.out.println(o);
		}
		list.remove(2);
		System.out.println(list);

	}
}
