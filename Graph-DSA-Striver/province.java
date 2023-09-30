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
        // code here
    }
};