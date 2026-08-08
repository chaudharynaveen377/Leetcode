class Solution {
    Integer[][] dp = new Integer[100][2];

    int solve(int[] arr, int st, int end, int id) {
        if (st > end) return 0;
        if (st == end) return arr[st];
        if (dp[st][id] != null) return dp[st][id];

        int take = arr[st] + solve(arr, st + 2, end, id);
        int skip = solve(arr, st + 1, end, id);
        return dp[st][id] = Math.max(take, skip);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        for (int i = 0; i < n; i++) {
            dp[i][0] = dp[i][1] = null;
        }

        return Math.max(
            solve(nums, 0, n - 2, 0),
            solve(nums, 1, n - 1, 1)
        );
    }
}