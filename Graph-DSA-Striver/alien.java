import java.util.ArrayList;
import java.util.LinkedList;

class Solution

{
    private List<Integer> toposort(int V, List<List<Integer>> adj){
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(Integer it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(indegree[i]);
                
            }
        }

    }
    public String findOrder(String [] dict, int N, int K)
    {
        
        
        
    }
}