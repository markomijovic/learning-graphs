/*
    For Learning Purpose Only
*/
public class Graph
{   
    // API START - Adjacency-list graph representation
    private final int V;
    private Bag<Integer>[] adj; //adjacency list
    // empty graph with V vertices
    Graph(int V) 
    {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V]; // create empty graph with V vertices
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<Integer>();
    }
    // add an edge v-w
    void addEdge(int v, int w)
    {   
        adj[v].add(w);
        adj[w].add(v);
    }
    // vertices adjacent to v
    Iterable<Integer> adj(int v)
    { return adk[v]; }
    // number of vertices
    int V()
    { return V; }
    // number of edges
    int E()
    {

    }
    // string representation
    String toString()
    {

    }
    // API END

    // methods
    public static int degree(Graph G, int v)
    {
        int degree = 0;
        for (int w : G.adj(v)) degree++;
        return degree;
    }
    
    public static int maxDegree(Graph G)
    {
        int max = 0;
        for (int v = 0; v < G.V(); v++)
        {
            if (degree(G, v) > max) max = degree(G, v);
        }
        return max;
    }

    public static double averageDegree(Graph G)
    { return 2.0 * G.E() / G.V();}

    public static int numberOfSelfLoops(Graph G)
    {
        int count = 0;
        for (int v = 0; v < G.V(); v++)   
            for (int w : G.adj(v))
                if (v == w) count++;
        return count / 2;
    }
}