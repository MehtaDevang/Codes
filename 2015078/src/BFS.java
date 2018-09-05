import java.util.*;
public class BFS {
	Queue<Integer> list = new LinkedList<>();
	public void printBFS(int[][] graph, int start) {
		list.add(start);
		while(!list.isEmpty()) {
			int p = list.remove();
			System.out.println(p);
			for(int j = 0; j < graph[0].length; j++) {
				if(graph[p][j] == 1) {
					list.add(j);
					graph[p][j] = 0;
					graph[j][p] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int q = Integer.parseInt(scanner.nextLine());
		String[] str = scanner.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int[][] graph = new int[n+1][n+1];
		
		for(int i = 0; i < m; i++) {
			String[] temp = scanner.nextLine().trim().split(" ");
			int u = Integer.parseInt(temp[0]);
			int v = Integer.parseInt(temp[1]);
			
			graph[u][v] = 1;
			graph[v][u] = 1;
		}
		int start = Integer.parseInt(scanner.nextLine());
		BFS obj = new BFS();
		obj.printBFS(graph, start);
	}
}
