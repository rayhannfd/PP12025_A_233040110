package Pertemuan12;

public class Graph {
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        for (int i = 0; i < maxVerts; i++) {
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1; // undirected graph
    }

    public void adjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}