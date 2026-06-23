import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < vertices; i++) {

            System.out.print("Enter vertex name: ");
            String vertex = sc.nextLine();

            graph.addVertex(vertex);
        }

        System.out.print("\nEnter number of edges: ");
        int edges = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < edges; i++) {

            System.out.println("\nEdge " + (i + 1));

            System.out.print("Source: ");
            String source = sc.nextLine();

            System.out.print("Destination: ");
            String destination = sc.nextLine();

            int weight;

while (true) {

    System.out.print("Weight: ");

    if (sc.hasNextInt()) {
        weight = sc.nextInt();
        sc.nextLine();
        break;
    } else {
        System.out.println("Invalid input! Enter a number.");
        sc.nextLine();
    }
}

            graph.addEdge(source, destination, weight);
        }
        graph.displayGraph();
        System.out.print("\nEnter Source Node: ");
String start = sc.nextLine();

System.out.print("Enter Destination Node: ");
String end = sc.nextLine();

if (!graph.getGraph().containsKey(start) ||
    !graph.getGraph().containsKey(end)) {

    System.out.println("Invalid source or destination node!");
    return;
}
PathFinder.findAllPaths(graph, start, end);
Dijkstra.shortestPath(graph, start, end);
    }
}