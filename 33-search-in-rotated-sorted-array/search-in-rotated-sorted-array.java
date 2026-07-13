class Solution {
    public int search(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == target) return mid;

            // Left side is sorted
            if (arr[i] <= arr[mid]) {
                if (arr[i] <= target && target < arr[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
            // Right side is sorted
            else {
                if (arr[mid] < target && target <= arr[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }

        return -1;
    }
}
