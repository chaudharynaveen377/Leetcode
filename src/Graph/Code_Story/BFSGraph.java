package Graph.Code_Story;

import java.util.*;

public class BFSGraph {

    // Method to perform BFS on the graph
    public static List<Integer> bfsTraversal(Map<Integer, ArrayList<Integer>> graph, int startNode) {
        List<Integer> traversalOrder = new ArrayList<>(); // To store the BFS traversal order
        Set<Integer> visited = new HashSet<>(); // To keep track of visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        // Start with the given start node
        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            traversalOrder.add(currentNode);

            // Traverse all adjacent nodes of the current node
            for (int neighbor : graph.getOrDefault(currentNode, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return traversalOrder;
    }

    public static void main(String[] args) {
        // Create a sample graph as a map
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        // Adding edges to the graph
        graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        graph.put(2, new ArrayList<>(Arrays.asList(4, 5)));
        graph.put(3, new ArrayList<>(Arrays.asList(6)));
        graph.put(4, new ArrayList<>(Arrays.asList()));
        graph.put(5, new ArrayList<>(Arrays.asList(6)));
        graph.put(6, new ArrayList<>(Arrays.asList()));

        // Perform BFS starting from node 1
        int startNode = 1;
        List<Integer> result = bfsTraversal(graph, startNode);

        // Print the BFS traversal order
        System.out.println("BFS Traversal Order: " + result);
    }
}
