import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(prerequisites.get(i).get(0)).add(prerequisites.get(i).get(0));
        }
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(indegree[i]);
            }
        }
        int[] topo=mew int[n];
        int ind=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo[ind++]=node;
            for(int i:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(indegree[it]);
                }
            }
        }
        if(ind==n) return topo;
        int[] arr={};
        return arr;

    }
}

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());

        }
        for(int i=0;i<numCourses;i++){
            adj.get(prerequisites.get(i).get(0)).add(prerequisites.get(i).get(1);
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(indegree[i]);
            }
        }
        int[] topo=new int[numCourses];
        int idx=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo[idx++]=node;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(indegree[it]);
                }
            }


        }
        if(idx==numCourses){
            return true;
        }
        return false;

        
    }
}



