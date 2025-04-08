package Aarray.Easy;

import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle {
   static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // First and last elements of every row are 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Calculate using previous row values
                    int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> lt=generate(n);
        System.out.println(lt);
    }
}
