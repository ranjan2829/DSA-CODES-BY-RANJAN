import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public boolean isPossible(int N,int P, int[][] prerequisites)
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        int n=prerequisites.length;
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] indgree=new int[N];
        for(int i=0;i<N;i++){
            for(int it:adj.get(i)){
                indgree[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        


        
    }
    
}