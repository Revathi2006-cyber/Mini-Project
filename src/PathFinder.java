import java.util.*;

public class PathFinder {

    public static void findAllPaths(
            Graph graph,
            String start,
            String end) {

        List<String> path = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        System.out.println("\nAll Possible Paths:\n");

        dfs(graph, start, end, visited, path);
    }

    private static void dfs(
            Graph graph,
            String current,
            String destination,
            Set<String> visited,
            List<String> path) {

        visited.add(current);
        path.add(current);

        if (current.equals(destination)) {

            for (int i = 0; i < path.size(); i++) {

                System.out.print(path.get(i));

                if (i < path.size() - 1)
                    System.out.print(" -> ");
            }

            System.out.println();
        }
        else {

            for (Edge edge :
                    graph.getGraph().get(current)) {

                if (!visited.contains(edge.destination)) {

                    dfs(
                            graph,
                            edge.destination,
                            destination,
                            visited,
                            path);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }
}