package J1SP0007;

/**
 * Created by Binh
 * Date : 4/15/2023 - 10:46 PM
 * Description :
 */
public class Graph {
    private boolean AdjacencyMatrix[][];
    private int Vertex;

    public Graph(int Vertex) {
        this.Vertex = Vertex;
        // tạo ma trận gồm n đỉnh
        AdjacencyMatrix= new boolean[Vertex][Vertex];
    }

    public void addEdge(int i , int j){
        if( i >=0 && i<Vertex && j>0 && j<Vertex){
            AdjacencyMatrix[i][j] = true;
            AdjacencyMatrix[j][i] = true;
        }
    }
    public void removeEdge(int i, int j) {
        if (i >= 0 && i < Vertex && j > 0 && j < Vertex) {
            AdjacencyMatrix[i][j] = false;
            AdjacencyMatrix[j][i] = false;
        }
    }

    public boolean isEdge(int i, int j) {
        if (i >= 0 && i < Vertex && j > 0 && j < Vertex) {
            return AdjacencyMatrix[i][j] || AdjacencyMatrix[j][i];
        } else {
            return false;
        }
    }



}
