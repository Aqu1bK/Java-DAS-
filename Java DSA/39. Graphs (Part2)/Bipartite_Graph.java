import java.util.ArrayList;
import java.util.*;

public class Bipartite_Graph {
    public static class Edge {  // Made Edge class static
        int src;
        int nbr;

        public Edge(int s, int d) {
            this.src = s;
            this.nbr = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }

    public static boolean isBipartite(ArrayList<Edge> [] graph) {
        int col[] = new int [graph.length];
        for(int i=0; i<col.length; i++) {
            col[i] = -1; //no color
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++) {
            if(col[i] == -1) {
                q.add(i);
                col[i] = 0; //yellow
                while(!q.isEmpty()) {  // Fixed condition
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j); //e.nbr
                        if(col[e.nbr] == -1) {  // Changed e.dest to e.nbr
                            int nextCol = col[curr] == 0 ? 1 : 0;  // Fixed typo
                            col[e.nbr] = nextCol;  // Changed e.dest to e.nbr
                            q.add(e.nbr);  // Changed e.dest to e.nbr
                        } else if(col[e.nbr] == col[curr]) {  // Changed e.dest to e.nbr
                            return false; //NOT bipartite
                        }
                    }
                }
            }
        }
        return true;  // Added missing return statement
    }
    
    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}