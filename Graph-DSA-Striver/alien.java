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
        return topo;

    }
    public String findOrder(String [] dict, int N, int K)
    {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<K;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<N;i++){
            String s1=dict[i];
            String s2=dict[i+1];
            int len=Math.min(s1.length(),s2.length());
            for(int ptr=0;ptr<len;ptr++){
                if(s1.charAt(ptr)!=s2.charAt(ptr)){
                    adj.get(s1.charAt(ptr)-'a').add(s2.charAt(ptr)-'a');
                    break;
                }
            }
            List<Integer> ans=toposort(K, adj);
            String result="";

            for(int it:ans){
                result=result+(char)(it+(int)('a'));

            }
            return result;
            

        }
        
        
        
    }
}