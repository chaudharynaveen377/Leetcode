package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;

public class combination_sum {
   static ArrayList<ArrayList<Integer>>ans=new ArrayList<>();


        static void logic(int arr[], int i, int sum, int target, ArrayList<Integer> lt) {
            if (sum == target) { // Found a valid subset
                ans.add(new ArrayList<>(lt));
                return;
            }
            if (i >= arr.length || sum > target) { // Base condition to stop recursion
                return;
            }

            // Include the current element
            lt.add(arr[i]);
            logic(arr, i, sum + arr[i], target, lt); // Allow repetition (same index)
            lt.removeLast(); // Backtrack

            // Exclude the current element and move to the next
            logic(arr, i + 1, sum, target, lt);
        }

        public static void main(String[] args) {
            int arr[] = {2, 3, 6, 7};
            int target = 7;
            logic(arr, 0, 0, target, new ArrayList<>());
            System.out.println(ans);
        }


}
