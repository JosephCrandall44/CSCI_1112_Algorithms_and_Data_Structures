import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		// initializing the graph with 9 vertices
		Graph crocodileRoutes = new Graph(9);
		// adding labels to vertices
		crocodileRoutes.setLabel(0, "Sydney");
		crocodileRoutes.setLabel(1, "Canberra");
		crocodileRoutes.setLabel(2, "Brisbane");
		crocodileRoutes.setLabel(3, "Melbourne");
		
		// add remaining labels here ... 

		// adding edges
		// adding edge from Sydney to Canberra
		crocodileRoutes.addEdge(0, 1);
		// adding an edge from Canberra to Sydney
		crocodileRoutes.addEdge(1, 0);

		// from Canberra to Brisbane
		crocodileRoutes.addEdge(1, 2);

		// from Brisbane to Sydney
		crocodileRoutes.addEdge(2, 0);

		// and so on ...

	}

	public static void depthFirstPrint(Graph g, int v) {
		// initialize a stack
		LinkedList<Integer> stack = new LinkedList<Integer>();
		boolean[] marked = new boolean[g.size()];
		// mark first vertex as visited
		marked[v] = true;
		// add to stack
		stack.push(v);
		while (!(stack.isEmpty())) {
			// get the top element in stack
			int currentVertex = stack.pop();
			System.out.println(g.getLabel(currentVertex));
			// get the neighbors of the current vertex
			int[] connections = g.neighbors(currentVertex);
			for (int i = 0; i < connections.length; i++) {
				// add all unmarked neighbors to stack
				int nextNeighbor = connections[i];
				if (!marked[nextNeighbor]) {
					marked[nextNeighbor] = true;
					stack.push(nextNeighbor);
				}
			}
		}
	}

}

