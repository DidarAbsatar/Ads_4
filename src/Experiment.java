import java.util.Random;

public class Experiment {

    public void runTraversals(Graph g) {
        long startBfs = System.nanoTime();
        System.out.print("BFS Order: ");
        g.bfs(0);
        long endBfs = System.nanoTime();
        long bfsTime = endBfs - startBfs;

        System.out.println();

        long startDfs = System.nanoTime();
        System.out.print("DFS Order: ");
        g.dfs(0);
        long endDfs = System.nanoTime();
        long dfsTime = endDfs - startDfs;

        System.out.println();

        printResults(bfsTime, dfsTime);
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};
        Random random = new Random();

        for (int currentSize : sizes) {
            Graph g = new Graph(currentSize);
            for (int k = 0; k < currentSize - 1; k++) {
                g.addEdge(k, k + 1);
            }
            for (int j = 0; j < currentSize; j++) {
                g.addEdge(random.nextInt(currentSize), random.nextInt(currentSize));
            }

            System.out.println("\n--- Testing Size: " + currentSize + " ---");
            runTraversals(g);
        }
    }


    public void printResults(long bfsTime, long dfsTime) {
        System.out.println("BFS Time: " + bfsTime + " ns");
        System.out.println("DFS Time: " + dfsTime + " ns");
        System.out.println("-------------------------");
    }

}