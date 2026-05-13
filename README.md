Graph System — Assignment 4

A Java implementation of an undirected graph using an Adjacency List, featuring both Breadth-First Search (BFS) and Depth-First Search (DFS) traversal algorithms, with runtime benchmarking.

Project Structure

src/

├── Vertex.java       # Node representation (stores vertex ID)

├── Edge.java         # Edge representation (start → end connection)

├── Graph.java        # Core graph logic: adjacency list, BFS, DFS

└── Experiment.java   # Benchmarking: measures BFS/DFS time in nanoseconds


Data Structure

The graph uses an Adjacency List — each vertex maps to a list of its neighbors.
This approach was chosen because it is intuitive to implement and memory-efficient for sparse graphs.

Algorithms
BFS — Breadth-First Search
Explores neighbors level by level (wide before deep).
Implemented using a Queue.

Best for: finding the shortest path between two nodes
Time complexity: O(V + E)

DFS — Depth-First Search
Follows one path all the way to the end, then backtracks.
Implemented using recursion.

Best for: checking whether a path exists at all
Time complexity: O(V + E)


Both algorithms use a boolean[] visited array to prevent revisiting nodes and avoid infinite loops.


Benchmark Results

Tests were run on graphs of 10, 30, and 100 vertices. Times are in nanoseconds.

VerticesBFS (ns)DFS (ns)10674,900345,10030427,600257,900100707,100573,800

Observation: DFS consistently ran faster in these tests. Runtime generally increases with graph size, which aligns with the O(V + E) theoretical complexity.


Reflection

Before this assignment, I didn't have a clear understanding of the difference between BFS and DFS. Building the system from scratch helped me see not just how they work, but when to use each one.
The trickiest part was preventing infinite loops — solved by tracking visited nodes with a boolean[] array. Thinking through real-world use cases (like how social networks find connections between people, or how navigation apps find routes) made the concepts click.
