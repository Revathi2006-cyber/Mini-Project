# Shortest Path Finder using Dijkstra Algorithm in Java

## Overview

This project is a console-based Java application that finds the shortest path between two nodes in a weighted graph using Dijkstra's Algorithm. Users can dynamically create vertices and edges, choose source and destination nodes, and view the shortest path along with the total distance.

## Features

* Dynamic graph creation using user input
* Weighted edge support
* Dijkstra's shortest path algorithm
* Priority Queue optimization
* Shortest path reconstruction
* Total distance calculation
* Source and destination validation
* Invalid input handling
* No-path detection

## Technologies Used

* Java
* Java Collections Framework
* PriorityQueue
* HashMap
* ArrayList
* Object-Oriented Programming (OOP)

## Project Structure

```text
ShortestPathFinder/
│
├── src/
│   ├── Main.java
│   ├── Graph.java
│   ├── Edge.java
│   ├── Node.java
│   └── Dijkstra.java
│
└── README.md
```

## Algorithm

The project uses Dijkstra's Algorithm to compute the shortest path from a source node to a destination node in a weighted graph with non-negative edge weights.

### Steps

1. Initialize all distances as infinity.
2. Set source distance to 0.
3. Use a Priority Queue to select the node with the minimum distance.
4. Update neighboring node distances if a shorter path is found.
5. Store previous nodes for path reconstruction.
6. Display the shortest path and total distance.

## Sample Input

```text
Enter number of vertices: 4

Enter vertex name: A
Enter vertex name: B
Enter vertex name: C
Enter vertex name: D

Enter number of edges: 4

Edge 1
Source: A
Destination: B
Weight: 4

Edge 2
Source: A
Destination: C
Weight: 2

Edge 3
Source: C
Destination: D
Weight: 1

Edge 4
Source: B
Destination: D
Weight: 5

Enter Source Node: A
Enter Destination Node: D
```

## Sample Output

```text
Shortest Path:
A -> C -> D

Total Distance: 3
```

## How to Run

### Compile

```bash
javac *.java
```

### Execute

```bash
java Main
```

## Future Enhancements

* Graph visualization using Java Swing
* Read graph data from files
* Save graph data to files
* Directed graph support
* GUI-based shortest path finder

## Learning Outcomes

Through this project, I gained hands-on experience with:

* Graph data structures
* Dijkstra's Algorithm
* Priority Queues
* Java Collections Framework
* Object-Oriented Design
* User Input Validation
* Problem Solving and Algorithm Design

## Author

Revathi Veeraboyani
