/*
    For Learning Purpose Only
*/
public class Digraph
{   
    // API START - Adjacency-list graph representation
    private final int V;
    private Bag<Integer>[] adj; //adjacency list
    // empty graph with V vertices
    Digraph(int V) 
    {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V]; // create empty graph with V vertices
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<Integer>();
    }
    // add an edge v-w
    void addEdge(int v, int w)
    {   adj[v].add(w);  }
    // vertices adjacent to v
    Iterable<Integer> adj(int v)
    { return adj[v]; }
}