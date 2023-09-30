import java.util.ArrayList;

class Solution {
    public ststic void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        visited[node]=true;
        ls.add(node);
        for(Integer it: adj.get(node)){
            if(visited[it]==false){
                dfs(it,visited,adj,ls);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs=new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<V;i++){
            adjLs.add(new ArrayList<Integer>());

        }
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i))
            }
        }

    }
};