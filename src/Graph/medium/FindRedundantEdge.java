package Graph.medium;

import java.util.*;

public class FindRedundantEdge {
    // Function to detect if the graph contains a cycle
    public static boolean hasCycle(HashMap<Integer, List<Integer>> adjList) {
        HashSet<Integer> visited = new HashSet<>();
        for (int node : adjList.keySet()) {
            if (!visited.contains(node)) {
                if (dfs(node, -1, visited, adjList)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle found
    }

    // DFS helper function to detect cycles
    private static boolean dfs(int node, int parent, HashSet<Integer> visited, HashMap<Integer, List<Integer>> adjList) {
        visited.add(node);
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, node, visited, adjList)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true; // Cycle detected
            }
        }
        return false;
    }

    // Function to find edges whose removal breaks all cycles
    public static List<int[]> findRedundantEdges(int[][] edges) {
        List<int[]> result = new ArrayList<>();

        // Build the full adjacency list
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        for (int[] edge : edges) {
            adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            adjList.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }

        // Iterate through each edge and check if its removal breaks all cycles
        for (int[] edge : edges) {
            // Remove the edge
            adjList.get(edge[0]).remove((Integer) edge[1]);
            adjList.get(edge[1]).remove((Integer) edge[0]);

            // Check if the graph still contains a cycle
            if (!hasCycle(adjList)) {
                result.add(edge); // Edge is redundant
            }

            // Add the edge back
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 4}, {3, 4}, {1, 3}, {1, 2}, {4, 5}};
        List<int[]> redundantEdges = findRedundantEdges(edges);

        // Print the result
        System.out.println("Edges whose removal breaks all cycles:");
        for (int[] edge : redundantEdges) {
            System.out.println(Arrays.toString(edge));
        }
        System.out.println(Arrays.toString(redundantEdges.get(redundantEdges.size()-1)));
    }
}