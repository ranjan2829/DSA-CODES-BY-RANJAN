

public class BFS {
    public ArrayList<Integer> bfstraversal(int v ,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs= new ArrayList<>();
        boolean visited[] = new boolean(v);
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);

            for(Integer it:adj.get(node)){
                f(visited[it]==false){
                    visited[it]=true;
                    q.add(it);
                }
            }

        }
        return bfs;
    }
    

    
}
