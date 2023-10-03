import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        for(int j=0;j<V;j++){
                if(visited[j]==false){
                    if(check(j,V,adj,visited)){
                        return true;
                    }
                }
            }
        
        return false;
    }
    private boolean check(int src, int V,  ArrayList<ArrayList<Integer>> adj,boolean visited[]){
        visited[src]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src, -1));
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek.second;
            q.remove();
            for(int adjnode:adj.get(node)){
                if(visited[adjnode]==false){
                    visited[adjnode]=true;
                    q.add(new Pair(adjnode, node));
                }
                else if(parent!=adjnode){
                    return true;
                }
            }
            


        }
        return false;

    }
}

