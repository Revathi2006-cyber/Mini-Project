import java.util.*;

public class Graph {

    private Map<String, List<Edge>> graph = new HashMap<>();

    public void addVertex(String vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String source, String destination, int weight) {
        graph.get(source).add(new Edge(destination, weight));
        graph.get(destination).add(new Edge(source, weight));
    }

    public Map<String, List<Edge>> getGraph() {
        return graph;
    }
    public void displayGraph() {

    System.out.println("\nGraph Structure:");

    for (String vertex : graph.keySet()) {

        System.out.print(vertex + " --> ");

        for (Edge edge : graph.get(vertex)) {

            System.out.print(
                edge.destination +
                "(" + edge.weight + ") "
            );
        }

        System.out.println();
    }
}
}