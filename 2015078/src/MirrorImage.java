import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class MirrorImage {
	public static void main(String[] args) throws Exception{
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		String[] str = scanner.readLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		int upto = (int)Math.ceil(Math.log(n)/ Math.log(2)) + 1;
		int node = (int)Math.pow(2, upto);
		int[] arr = new int[10000];
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> index = new HashMap<>();
		arr[0] = 1;
		index.put(1, 0);
		int max = 0;
		for(int i = 0; i < n-1; i++) {
			String[] temp = scanner.readLine().trim().split(" ");
			int parent = Integer.parseInt(temp[0]);
			int child = Integer.parseInt(temp[1]);
			String c = temp[2];
			if(c.equals("L")) {
				int in = index.get(parent);
				int pos = (2 * in) + 1;
				index.put(child, pos);
				arr[pos] = child;
				max = pos;
			}
			else {
				int in = index.get(parent);
				int pos = (2 * in) + 2;
				index.put(child, pos);
				arr[pos] = child;
				max = pos;
			}
		}
		for(Map.Entry<Integer,Integer> entry : index.entrySet()) {
			System.out.println(entry.getKey() + " ----> " + entry.getValue());
		}
		int d = 0;
//		int index1 = 1;
//		int index2 = 1;
		for(int i = 0; i < max + 1; ) {
			int nodes = (int)Math.pow(2, d);
			if(nodes == 1) {
				map.put(0, 0);
			}
			else {
				int j = (int)Math.pow(2, d) - 1;
				int s = 0;
				int start = j;
				while(s < nodes/2) {
					map.put(j, start + nodes - 1 - s);
					map.put(start + nodes - 1 - s, j);
					s++;
					j++;
				}
			}
			d++;
			i = i + nodes;
		}
		System.out.println("YES");
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " ----> " + entry.getValue());
		}
		for(int i = 0; i < q; i++) {
			int value = Integer.parseInt(scanner.readLine());
			int in = index.get(value);
//			System.out.println(in);
			int res = map.get(in);
			if(arr[res] != 0)
				System.out.println(arr[res]);
			else{
				System.out.println("-1");
			}
		}
		
	}
}
