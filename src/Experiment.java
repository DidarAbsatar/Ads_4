import java.util.Random;

public class Experiment {
    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int i = 0; i < sizes.length; i++) {
            int currentSize = sizes[i];
            Graph g = new Graph(currentSize);
            Random random = new Random();

            for (int j = 0; j < currentSize * 2; j++) {
                int from = random.nextInt(currentSize);
                int to = random.nextInt(currentSize);
                if (from != to) {
                    g.addEdge(from, to);
                }
            }

            System.out.println("\n--- TESTING GRAPH SIZE: " + currentSize + " ---");

            long startTimeBfs = System.nanoTime();
            System.out.print("BFS Order: ");
            g.bfs(0);
            long endTimeBfs = System.nanoTime();
            System.out.println("\nBFS Time: " + (endTimeBfs - startTimeBfs) + " ns");

            long startTimeDfs = System.nanoTime();
            System.out.print("DFS Order: ");
            g.dfs(0);
            long endTimeDfs = System.nanoTime();
            System.out.println("\nDFS Time: " + (endTimeDfs - startTimeDfs) + " ns");
        }
    }
}