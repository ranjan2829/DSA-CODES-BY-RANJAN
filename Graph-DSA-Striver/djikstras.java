import java.util.PriorityQueue;

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {//min-heap
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
        int []dist=new int[V];
        for(int i=0;i<V;i++){
            dist[i]=(int)(le9);

        }
        dist[S]=0;;
        pq.add(new Pair(0, S));
        while(pq.size()!=0){
            int dis=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();
            for(int i=0;i<adj.get(node).size();i++){
                int edge=adj.get(node).get(i).get(1);
                int adjnode=adj.get(node).get(i).get(0);
                if(dis+edge<dist(adjnode)){
                    dist[adjnode]=dis+edge;
                    pq.add(new Pair(dis[adjnode], adjnode));
                }
            }
        }
        return dist;

        
    }
}
