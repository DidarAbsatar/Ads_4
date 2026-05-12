import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public ArrayList<ArrayList<Integer>> adjacencyList;
    public int numberOfVertices;

    public Graph(int count) {
        this.numberOfVertices = count;
        this.adjacencyList = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            this.adjacencyList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int from, int to) {
        this.adjacencyList.get(from).add(to);
    }

    public void bfs(int startNode) {
        boolean[] visited = new boolean[numberOfVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startNode] = true;
        queue.add(startNode);

        while (queue.isEmpty() == false) {
            int current = queue.poll();
            System.out.print(current + " ");

            ArrayList<Integer> neighbors = adjacencyList.get(current);
            for (int i = 0; i < neighbors.size(); i++) {
                int neighbor = neighbors.get(i);
                if (visited[neighbor] == false) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs(int startNode) {
        boolean[] visited = new boolean[numberOfVertices];
        dfsRecursive(startNode, visited);
    }

    private void dfsRecursive(int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");

        ArrayList<Integer> neighbors = adjacencyList.get(current);
        for (int i = 0; i < neighbors.size(); i++) {
            int neighbor = neighbors.get(i);
            if (visited[neighbor] == false) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public void printGraph() {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            System.out.println(adjacencyList.get(i));
        }
    }
}