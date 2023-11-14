import java.util.ArrayList;

class Pair{
    int node;
    int distance;
    public Pair(int distance, int node){
        this.distance=distance;
        this.node=node;
    }
}
class triology{
    int u;
    int v;
    int w;
    triology(int u,int v, int w){
        this.u=u;
        this.v=v;
        this.w=w;
    }
}
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<edges.length;i++){
            int  u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));

        }


	    
	}
}