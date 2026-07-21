import java.util.*;

public class BFSShortestPath {

    static List<Integer> fewestFlights(Map<Integer, List<Integer>> graph,
                                       int source,
                                       int destination) {

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> parent = new HashMap<>();

        queue.offer(source);
        visited.add(source);
        parent.put(source, null);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            if (current == destination)
                break;

            for (int next : graph.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(next)) {

                    visited.add(next);
                    parent.put(next, current);
                    queue.offer(next);
                }
            }
        }

        if (!visited.contains(destination))
            return Collections.emptyList();

        LinkedList<Integer> path = new LinkedList<>();

        Integer node = destination;

        while (node != null) {
            path.addFirst(node);
            node = parent.get(node);
        }

        return path;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4));
        graph.put(3, Arrays.asList(1, 5));
        graph.put(4, Arrays.asList(2));
        graph.put(5, Arrays.asList(3));

        System.out.println(fewestFlights(graph, 1, 5));
    }
}