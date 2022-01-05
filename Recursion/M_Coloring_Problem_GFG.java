import java.util.*;

// Input - Testcase - GFG
// N = 4
// M = 3
// E = 5
// Edges[] = {(0,1),(1,2),(2,3),(3,0),(0,2)}

class M_Coloring_Problem_GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int V = scan.nextInt();
            int C = scan.nextInt();
            int E = scan.nextInt();

            List<Integer>[] G = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                G[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                G[u].add(v);
                G[v].add(u);
            }
            int[] color = new int[V];

            System.out.println(graphColoring(G, color, 0, C) ? 1 : 0);
        }
    }
    //Function to determine if graph can be coloured with at most M colours such
    //that no two adjacent vertices of graph are coloured with same colour.
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int C) 
    {
        int len = G.length;
        if(helper(G,color,0,len,C)){
            return true;
        }
        return false;
    }
    public static boolean helper(List<Integer>[] G,int[] color,int node,int len,int c){
        if(node==len){
            return true;
        }
        for(int i=1;i<=c;i++){
            if(isSafe(G,color,node,len,i)){
                color[node]=i;
                if(helper(G,color,node+1,len,c)){
                    return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(List<Integer>[] G,int[] color,int node,int len,int c){
        for(int i:G[node]){
            if(color[i]==c){
                return false;
            }
        }
        return true;
    }
}