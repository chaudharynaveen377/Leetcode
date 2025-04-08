package Graph.Code_Story;

import java.util.*;

public class DetectCycleUndirectedGraph {

    public static boolean isCycle(Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();

        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) { // Start DFS if the node is not visited
                if (dfs(vertex, -1, visited, graph)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int current, int parent, Set<Integer> visited, Map<Integer, List<Integer>> graph) {
        visited.add(current);

        List<Integer> neighbors = graph.get(current);
        if (neighbors != null) {
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    if (dfs(neighbor, current, visited, graph)) {
                        return true;
                    }
                } else if (neighbor != parent) { // Back edge found
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] vertices = {0, 1, 2, 3, 4};
        ArrayList<List<Integer>> adjacencyLists = new ArrayList<>();
        adjacencyLists.add(List.of(1));
        adjacencyLists.add(Arrays.asList(0, 2));
        adjacencyLists.add(Arrays.asList(1, 3));
        adjacencyLists.add(Arrays.asList(2, 4));
        adjacencyLists.add(Arrays.asList(3 ));

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < vertices.length; i++) {
            graph.put(vertices[i], adjacencyLists.get(i));
        }

        System.out.println(graph);

        if (isCycle(graph)) {
            System.out.println("Cycle detected in the graph.");
        } else {
            System.out.println("No cycle detected in the graph.");
        }
    }
}
