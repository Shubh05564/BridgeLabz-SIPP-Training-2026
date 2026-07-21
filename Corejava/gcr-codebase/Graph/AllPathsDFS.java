import java.util.*;

public class AllPathsDFS {

    static void allRoutes(Map<Integer, List<Integer>> graph,
                          int current,
                          int target,
                          List<Integer> path,
                          Set<Integer> visited,
                          List<List<Integer>> allPaths) {

        path.add(current);
        visited.add(current);

        if (current == target) {

            allPaths.add(new ArrayList<>(path));

        } else {

            for (int next : graph.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(next)) {

                    allRoutes(graph, next, target, path, visited, allPaths);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(4));
        graph.put(4, Arrays.asList());

        List<List<Integer>> result = new ArrayList<>();

        allRoutes(graph, 1, 4,
                new ArrayList<>(),
                new HashSet<>(),
                result);

        System.out.println(result);
    }
}