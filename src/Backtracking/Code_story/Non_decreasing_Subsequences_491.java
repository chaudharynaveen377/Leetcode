package Backtracking.Code_story;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Non_decreasing_Subsequences_491 {
    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        if (tempList.size() > 1 && !result.contains(new ArrayList<>(tempList))) {
            result.add(new ArrayList<>(tempList));
        }

        for (int i = start; i < nums.length; i++) {
            if (tempList.isEmpty() || nums[i] >= tempList.getLast()) {
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, i + 1);
                tempList.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,5,6,5};
        System.out.println(findSubsequences(nums));
    }
}
