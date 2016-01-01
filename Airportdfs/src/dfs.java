// dfs.java
// demonstrates depth-first search
// to run this program: C>java DFSApp
////////////////////////////////////////////////////////////////
class StackX
   {
   private final int SIZE = 20;
   private int[] st;
   private int top;
// ------------------------------------------------------------
   public StackX()           // constructor
      {
      st = new int[SIZE];    // make array
      top = -1;
      }
// ------------------------------------------------------------
   public void push(int j)   // put item on stack
      { st[++top] = j; }
// ------------------------------------------------------------
   public int pop()          // take item off stack
      { return st[top--]; }
// ------------------------------------------------------------
   public int peek()         // peek at top of stack
      { return st[top]; }
// ------------------------------------------------------------
   public boolean isEmpty()  // true if nothing on stack
      { return (top == -1); }
// ------------------------------------------------------------
   }  // end class StackX
////////////////////////////////////////////////////////////////
class Vertex
   {
   public char label;        // label (e.g. 'A')
   public boolean wasVisited;
// ------------------------------------------------------------
   public Vertex(char lab)   // constructor
      {
      label = lab;
      wasVisited = false;
      }
// ------------------------------------------------------------
   }  // end class Vertex
////////////////////////////////////////////////////////////////
class Graph
   {
   private final int MAX_VERTS = 20;
   private Vertex vertexList[]; // list of vertices
   private int adjMat[][];      // adjacency matrix
   private int nVerts;          // current number of vertices
   private StackX theStack;
// ------------------------------------------------------------
   public Graph()               // constructor
      {
      vertexList = new Vertex[MAX_VERTS];
                                          // adjacency matrix
      adjMat = new int[MAX_VERTS][MAX_VERTS];
      nVerts = 0;
      for(int y=0; y<MAX_VERTS; y++)      // set adjacency
         for(int x=0; x<MAX_VERTS; x++)   //    matrix to 0
            adjMat[x][y] = 0;
      theStack = new StackX();
      }  // end constructor
// ------------------------------------------------------------
   public void addVertex(char lab)
      {
      vertexList[nVerts++] = new Vertex(lab);
      }
// ------------------------------------------------------------
   public void addEdge(int start, int end)
      {
      adjMat[start][end] = 1;
      adjMat[end][start] = 1;
      }
// ------------------------------------------------------------
   public void displayVertex(int v)
      {
      System.out.print(vertexList[v].label);
      }
// ------------------------------------------------------------
   public void dfs(int vertex)  // depth-first search
      {                                 // begin at vertex 0
      vertexList[vertex].wasVisited = true;  // mark it
      displayVertex(vertex);                 // display it
      theStack.push(vertex);                 // push it

      while(!theStack.isEmpty() )      // until stack empty,
         {
         // get an unvisited vertex adjacent to stack top
         int v = getAdjUnvisitedVertex( theStack.peek() );
         if(v == -1)                    // if no such vertex,
            theStack.pop();
         else                           // if it exists,
            {
            vertexList[v].wasVisited = true;  // mark it
            displayVertex(v);                 // display it
            theStack.push(v);                 // push it
            }
         }  // end while
      
      
      
     
    //count number of vertex visited and print if graph is connected or not
      System.out.println(""); 						//extra line for formatting
      int count = 0;								//count number of vertex visited
      for(int k=0; k<nVerts; k++){          
    	  if(vertexList[k].wasVisited == true){
    		 count ++;
    		
    	  } 
      }
      
      if (count != nVerts){
    	  System.out.println("The Graph is not Connected");
    	  
    	  for(int k=0; k<nVerts; k++){          
        	  if(vertexList[k].wasVisited == false){
        		  dfs(k);
        		  
        	  } 
      }
    	  
      if (count == nVerts){
    	  System.out.println("The Graph is Connected"); //print if the graph is connected or not
    	  
      }
     
    	  
    	
      // stack is empty, so we're done
      for(int j=0; j<nVerts; j++)          // reset flags
         vertexList[j].wasVisited = false;
      }  // end dfs	
      }
// ------------------------------------------------------------
   // returns an unvisited vertex adj to v
   public int getAdjUnvisitedVertex(int v)
      {
      for(int j=0; j<nVerts; j++)
         if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
            return j;
      return -1;
      }  // end getAdjUnvisitedVertex()
// ------------------------------------------------------------
   }  // end class Graph
////////////////////////////////////////////////////////////////
class DFSApp
   {
   public static void main(String[] args)
      {
      Graph theGraph = new Graph();
      theGraph.addVertex('A');    // 0  (start for dfs)  nameofAirport[0] = "Atlanta";
      theGraph.addVertex('B');    // 1 nameofAirport[1] = "Austin";
      theGraph.addVertex('C');    // 2 nameofAirport[2] = "Chicago";
      theGraph.addVertex('D');    // 3 nameofAirport[3] = "Dalles";
      theGraph.addVertex('E');    // 4 nameofAirport[4] = "Denver";
      theGraph.addVertex('F');    // 5 nameofAirport[5] = "Houston";
      theGraph.addVertex('G');    // 6 nameofAirport[6] = "Washington";
      
      

      theGraph.addEdge(0, 5);     
      theGraph.addEdge(0, 6);
      theGraph.addEdge(1, 3);
      theGraph.addEdge(1, 5);
      //theGraph.addEdge(2, 3);
      //theGraph.addEdge(2, 4);
      //theGraph.addEdge(3, 4);
      //theGraph.addEdge(3, 1);
      //theGraph.addEdge(3, 2);
      //theGraph.addEdge(4, 3);
      //theGraph.addEdge(4, 2);
      //theGraph.addEdge(5, 0);
      //theGraph.addEdge(5, 1);     
      //theGraph.addEdge(6, 0);     
      
      
      
      /*adjacency_matrix[0][5] = 800;
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
       */

      System.out.print("Visits: ");
      theGraph.dfs(0);             // depth-first search
      System.out.println();
      }  // end main()
   }  // end class DFSApp
////////////////////////////////////////////////////////////////
