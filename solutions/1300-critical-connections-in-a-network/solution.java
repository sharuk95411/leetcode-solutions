class Solution {
     int time=0;
    public List<List<Integer>> criticalConnections(int V, List<List<Integer>> connections) {
         List<Integer>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) graph[i] = new ArrayList<>();
        
        for(List<Integer> oneConnection :connections) {
            graph[oneConnection.get(0)].add(oneConnection.get(1));
            graph[oneConnection.get(1)].add(oneConnection.get(0));
        }
        
        List<List<Integer>>list= new ArrayList<>();
          int disc[]= new int[V];
        int low[]= new int[V];
        int parent[]= new int[V];
        
    
        Arrays.fill(disc,-1);
        Arrays.fill(low,-1);
        Arrays.fill(parent,-1);
        
        for(int i=0;i<V;i++)
        {
            if(disc[i]==-1)
            dfs(i,disc,low,graph,parent,list);
            
        }
        return list;
        
    }
    public void dfs(int u,int disc[],int low[],List<Integer>[] adj, int parent[],List<List<Integer>>list )
     
     {
         
         
         disc[u]= low[u]= time;
         time++;
         
         for(int v:adj[u])
         {
             
             //System.out.println(v);
             if(disc[v]==-1)
             {
                 
		     	parent[v] = u;
                 dfs(v,disc,low,adj,parent,list);
                 low[u]= Math.min(low[u],low[v] );
             }
				
			if( low[v]>disc[u])	
            {
               // System.out.println("OK");
               List<Integer>l= new ArrayList<>();
                l.add(u);
                l.add(v);
                list.add(l);
                
            }
          	
			
			else if(v!=parent[u])	//Ignore child to parent edge
			low[u] = Math.min(low[u],disc[v]);
         }
         
     }
    
}
