import java.lang.reflect.Array;
import java.util.*;  // This now includes both Queue and LinkedList

public class Connected_Components {
       static class Edge {  // Fixed: Changed from 'static void Edge' to 'static class Edge'
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {  // Fixed: Corrected typo 'Egde' to 'Edge'
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){  // Method signature is now correct
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));  // Fixed: This was previously trying to add to graph[5]

    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                bfsUtil(graph, vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]) { // Fixed: Renamed from dfs to bfs since this is actually BFS implementation
        Queue<Integer> q = new LinkedList<>();
        q.add(0); //source = 0

        while(!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]) { //visit curr
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            dfsUtil(graph, i, vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        //visit 
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {  // Fixed: Should check if destination is visited, not current node
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    //0(V+E)
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
        if(src == dest) {
            return true;
        }
        
        vis[src] = true;  // Mark current node as visited

        for(int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            //e.dest = neighbour
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {  // Fixed: Added missing 'dest' parameter
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        int V = 7;
        @SuppressWarnings("unchecked")  // Suppress the generic array warning
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    } 
}