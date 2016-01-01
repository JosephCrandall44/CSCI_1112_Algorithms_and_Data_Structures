import java.util.LinkedList;
import java.util.Queue;


public class test {
	
	public static void main (String[]args){
		//System.out.println("hello");	
		
		//System.out.println(nameToNumber().toString());
		
		//System.out.println(Airportedges().toString());
		
		//Check if adjacency matrix is connected or not
		
		boolean[] t = (BFS(Airportedges(), 7,3 ));
				t.toString();
				System.out.print(t);
				
		//if ( for(boolean element : t){
		//	 true = t[element]
		//}
	}
	
	static String[] nameToNumber(){
		
		String[] nameofAirport = new String[7];
		
		nameofAirport[0] = "Atlanta";
		nameofAirport[1] = "Austin";
		nameofAirport[2] = "Chicago";
		nameofAirport[3] = "Dalles";
		nameofAirport[4] = "Denver";
		nameofAirport[5] = "Houston";
		nameofAirport[6] = "Washington";
		return nameofAirport;
	}
	
	static int[][] Airportedges(){
		
		int[][] adjacency_matrix = new int[7][7];
		
		for(int i=0;i<7;i++){
			  for(int j=i;j<7;j++){
				  adjacency_matrix[i][j] = 0;
			  }
			 }
		
		adjacency_matrix[0][5] = 800;
		adjacency_matrix[0][6] = 600;
		
		adjacency_matrix[1][3] = 200;
		adjacency_matrix[1][5] = 160;
		
		adjacency_matrix[2][3] = 900;
		adjacency_matrix[2][4] = 1000;
		
		adjacency_matrix[3][4] = 780;
		adjacency_matrix[3][1] = 200;
		adjacency_matrix[3][2] = 900;
		
		adjacency_matrix[4][3] = 780;
		adjacency_matrix[4][2] = 1000;
		
		adjacency_matrix[5][0]= 160;
		adjacency_matrix[5][1]= 800;
		
		adjacency_matrix[6][0] = 600;
		return adjacency_matrix;	
	}	
	
	public static boolean[] BFS(int[][] adjacencyMatrix, int vertexCount, int givenVertex){
	      // Result array.
	      boolean[] mark = new boolean[vertexCount];

	      Queue<Integer> queue = new LinkedList<Integer>();
	      queue.add(givenVertex);
	      mark[givenVertex] = true;

	      while (!queue.isEmpty())
	      {
	        Integer current = queue.remove();
			//System.out.println("hello");	

	        for (int i = 0; i < vertexCount; ++i)
	    		//System.out.println("hello");	

	            if (adjacencyMatrix[current][i] != 0 && !mark[i])
	            {
	                mark[i] = true;
	                queue.add(i);
	            }
	      }

	      return mark;
	  }
}
