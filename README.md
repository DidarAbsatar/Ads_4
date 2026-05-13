# Assignment 4 - Graph System

## Project Overview
In this work, I made a Graph system. A graph is just a set of points (Vertices) and lines between them (Edges). I used an Adjacency List to store everything because it is simple and doesn't use too much memory.

## My Classes
* **Vertex.java**: Just holds the ID of the node.
* **Edge.java**: Stores where the connection starts and ends.
* **Graph.java**: This is the main part. It has the list of neighbors and the BFS/DFS code.
* **Experiment.java**: I used this to run tests and see how many nanoseconds the algorithms take.

## BFS vs DFS
### BFS
This one goes "wide". It checks all closest neighbors first. I used a Queue for this. It's good if you need to find the shortest way to a node.
* Time: O(V + E)

### DFS
This one goes "deep". It follows one path until the end and then goes back. I used recursion here. It's good for seeing if a path exists at all.
* Time: O(V + E)

## Results from my Console
I ran the tests for 10, 30, and 100 nodes. Here is what I got:

| Size | BFS (ns) | DFS (ns) |
| :--- | :--- | :--- |
| 10 | 674,900 | 345,100 |
| 30 | 427,600 | 257,900 |
| 100 | 707,100 | 573,800 |

**My observation:** DFS was faster in my tests. Also, when I added more vertices, the time went up, which makes sense.


## Reflection
I learned how to work with graphs. Before this, I didn't know the difference between BFS and DFS. The hardest part was making sure the code doesn't visit the same node twice (infinite loop). I used a `boolean[] visited` array to fix this. Now I understand how maps or social networks might find connections between people.
