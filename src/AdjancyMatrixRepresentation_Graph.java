import java.util.*;
public class AdjancyMatrixRepresentation_Graph {
    int [][] adjMatrix;
    public AdjancyMatrixRepresentation_Graph(int nodes){
        this.adjMatrix = new int[nodes][nodes];

    }
    public void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }
    public static void main(String[] args) {
        AdjancyMatrixRepresentation_Graph graph = new AdjancyMatrixRepresentation_Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);

        System.out.println(graph);
    }
}
