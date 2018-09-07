import java.util.*;
public class StoreGraph {
	private static int V;
	private static LinkedList<Integer> adj[];
	
	public StoreGraph(int v) {
		// TODO Auto-generated constructor stub
		V = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		StoreGraph g = new StoreGraph(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(1, 3);
		
        int source = 0;
        printBFS(g, source);
	}
	
	public static void printBFS(StoreGraph g, int source) {
		boolean visited[] = new boolean[V];
		 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[source]=true;
        queue.add(source);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            source = queue.poll();
            System.out.print(source +" ");
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[source].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
	}
}
