import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        List<Integer> topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo.add(node);
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(indegree[it]);
                }
                
            }

        }

    }
    public String findOrder(String [] dict, int N, int K)
    {
        
        
        
    }
}