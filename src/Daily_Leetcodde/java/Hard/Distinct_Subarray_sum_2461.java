package Daily_Leetcodde.java.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;

class Distinct_Subarray_sum_2461 {
    public static long maximumSubarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        long sum = 0;
        long ans = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        while (j < nums.length) {
            sum += nums[j];
            freqMap.put(nums[j], freqMap.getOrDefault(nums[j], 0) + 1);
            while (j - i + 1 > k) {
                sum -= nums[i];
                freqMap.put(nums[i], freqMap.get(nums[i]) - 1);
                if (freqMap.get(nums[i]) == 0) {
                    freqMap.remove(nums[i]);
                }
                i++;
            }

            if (j - i + 1 == k && freqMap.size() == k) {
                ans = Math.max(ans, sum);
            }

            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(1,1);
        mp.put(1,2);
        mp.put(1,3);
        System.out.println(mp.size());
    }
}

//Distinct_Subarray_sum_2461