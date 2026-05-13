# Assignment 4: Graph Traversal and Representation System

## A. Project Overview
This project explores graph data structures and traversal algorithms. A graph is a mathematical structure used to model pairwise relations between objects.

*   **Vertices (Nodes):** Represent individual entities (e.g., points on a map).
*   **Edges (Links):** Represent the connections or paths between these entities.
*   **BFS (Breadth-First Search):** An algorithm that explores neighbors layer-by-layer.
*   **DFS (Depth-First Search):** An algorithm that explores as deep as possible along a branch.

---

## B. Class Descriptions
*   **Vertex.java:** A simple class representing a node with a unique `id`.
*   **Edge.java:** Represents a directed link from a `source` to a `destination`.
*   **Graph.java:** Uses an **Adjacency List** to store the graph. Contains BFS and DFS logic.
*   **Experiment.java:** Handles testing on different graph sizes (10, 30, and 100 vertices).

---

## C. Algorithm Descriptions

### 1. Breadth-First Search (BFS)
*   **Process:** Starts at the root, uses a **Queue**, and visits neighbors layer-by-layer.
*   **Use Cases:** Finding the shortest path in unweighted graphs.
*   **Complexity:** O(V + E).

### 2. Depth-First Search (DFS)
*   **Process:** Starts at the root, uses **Recursion**, and visits nodes as deep as possible.
*   **Use Cases:** Solving mazes, detecting cycles.
*   **Complexity:** O(V + E).

---

## D. Experimental Results

| Graph Size | BFS Time (ns) | DFS Time (ns) |
| :--- | :--- | :--- |
| 10 Vertices | 674,900 | 345,100 |
| 30 Vertices | 427,600 | 257,900 |
| 100 Vertices | 707,100 | 573,800 |

---



## F. Reflection
In this assignment, I learned how to implement graph structures using adjacency lists. I observed that BFS is very structured as it moves layer by layer, while DFS dives deep into the graph branches.

The main challenge was managing the "visited" array to prevent infinite loops. Understanding the difference between using a Queue (for BFS) and Recursion (for DFS) was the most important part of this work.




