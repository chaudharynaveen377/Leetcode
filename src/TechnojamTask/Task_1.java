package TechnojamTask;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case
        if (numRows == 0) {
            return triangle;
        }

        // First row is always [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Generate each row
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            // First element of each row is 1
            row.add(1);

            // Each element in the middle is the sum of the two elements above it
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of each row is 1
            row.add(1);

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;  // Example input
        List<List<Integer>> result = generate(numRows);

        // Print the triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
