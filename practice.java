import java.util.ArrayList;
// we are going to be learning about graphs today

/* 
Notes: 
- Graphs are a collection of nodes and edges
- Nodes are also called vertices
- Eges are connections between nodes
- They can be uni-directional or bi-directional/undirectional
- uni-directional: one way
- bi-directional: two way
- if we connect two nodes without any arrow heads, it is bi-directional

Graphs can be represented in two ways:
- directed graph: edges have direction
- undirected graph: edges do not have direction

Edges can also have weights
- weighted graph: edges have weights (like a distance between two nodes or a cost of going from one node to another, ofcourse this is all hypothetical and they can be anything)
    They cam be positive or negative
- unweighted graph: edges do not have weights

There are 4 famous ways to create a graph:
- Adjacency Matrix
- Adjacency List
- Edge List
- 2D Matrix (Implicit Graph) 

*/

public  class practice {


    // Adjacency List
/*
- It is a list of lists
we make list of edges for each node

let's try to implement it
*/

// The graph we're going to create is going to have 4 vertices and 4 edges and it's undirected and unweighted
// To store info, we'll store info about each vertex-wise, like which vertex it is connected to
// in graph terminology, each vertice we can visit is called a neighbor

// 0 -> {0,2} 0 is the source vertex and 2 is the destination vertex
// 1 -> {1,2}, {1,3}
// 2 -> {2,0}, {2,1}, {2,3}
// 3 -> {3,1}, {3,2}

// now we'll create an adjacency list for this graph
 
// we can implement adjancency list using  array of arraylist , hashpmaps 

// we'll use Array  of arraylist

// ArrayList<Edge> graph [v]
/* 
benefits of using Adjacency List: 
- No extra space is used, only space necessary for storing the edges and vertices is used
- Time is optimized, O(x) where x is the number of edges connected to a vertex 
- Adding a vertex is easy, just add a new list to the array
*/
    static class Edge {
        int source;
        int destination;
        public Edge(int source,int destination)
        {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[])
    {
        for( int i =0 ; i <graph.length; i++)
        {
            graph[i] = new ArrayList<Edge>();        
            
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));

    }


    
    public static void main(String[] args) {
        System.out.println("Hello World");

        int V =  4;  // number of vertices
        ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);

        // printing 2's neighbors
        for (int i =0 ; i<graph[2].size(); i++)
        {
             Edge e = graph[2].get(i);
            System.out.println("Source: " + e.source + " Destination: " + e.destination);

        }    
        
        }
}




