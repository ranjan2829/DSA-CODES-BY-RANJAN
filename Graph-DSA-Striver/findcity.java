class Solution {
      int findCity(int n, int m, int[][] edges,int distanceThreshold)
      {
          int[][] dist=new int[n][n];
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<m;i++){
            dist[i][i]=0;


            
          }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][j]==Integer.MAX_VALUE||dist[k][j]==Integer.MAX_VALUE){
                        continue;
                    }
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]); 
                }
            }
        }
        int cnt=n;
        int city=-1;
        for(int city1=0;city1<n;city1++){
            int cn=0;
            for(int adj.city=0;adjcity<n;adjcity++){
                if(dist[city][adjcity]<=distanceThreshold){
                    cn++;
                }
            }
            if(cn<=cnt){
                cntcn;
                city=city1;
            }
        }
        return city;
      }
}