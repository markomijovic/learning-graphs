public class CC 
{
    private boolean marked[];
    private int[] id; // connected component id
    private int count;
    
    public CC(Graph G)
    {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        for (int v = 0; v < G.V(); v++)
        {
            if (!marked[v])
            {
                dfs(G, v);
                count++;
            }
        }
    }

    public int count()
    {   return count;   }

    public int id(int v)
    {   return id[v];   }

    public void dfs(Graph G, int v)
    {
        marked[v] = true;
        id[v] = count; // recursively sets each id[v] to the same connected component
        for (int w : G.adj(v))
            if (!marked[w])
                dfs(G, w);
    }
}
