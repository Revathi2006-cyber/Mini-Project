import java.util.*;

public class Dijkstra {

    public static void shortestPath(
            Graph graph,
            String start,
            String end) {

        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();

        for(String vertex : graph.getGraph().keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }

        distances.put(start, 0);

        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                        Comparator.comparingInt(n -> n.distance));

        pq.add(new Node(start, 0));

        while(!pq.isEmpty()) {

            Node current = pq.poll();

            for(Edge edge :
                    graph.getGraph().get(current.vertex)) {

                int newDistance =
                        distances.get(current.vertex)
                                + edge.weight;

                if(newDistance <
                        distances.get(edge.destination)) {

                    distances.put(
                            edge.destination,
                            newDistance);

                    previous.put(
                            edge.destination,
                            current.vertex);

                    pq.add(
                            new Node(
                                    edge.destination,
                                    newDistance));
                }
            }
        }
        if (!distances.containsKey(end) ||
    distances.get(end) == Integer.MAX_VALUE) {

    System.out.println("No path exists between "
            + start + " and " + end);
    return;
}

        List<String> path = new ArrayList<>();

        String current = end;

        while(current != null) {
            path.add(current);
            current = previous.get(current);
        }

        Collections.reverse(path);

        System.out.println("\nShortest Path:");

        for(int i = 0; i < path.size(); i++) {

            System.out.print(path.get(i));

            if(i < path.size() - 1)
                System.out.print(" -> ");
        }

        System.out.println(
                "\nTotal Distance: "
                        + distances.get(end));
    }
}