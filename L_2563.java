import java.util.Arrays;

public class L_2563 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int left = findFirstGreaterEqual(nums, i + 1, nums.length - 1, lower - nums[i]);
            int right = findLastLessEqual(nums, i + 1, nums.length - 1, upper - nums[i]);

            if (left != -1 && right != -1 && left <= right) {
                count += right - left + 1;
            }
        }

        return count;
    }

    private int findFirstGreaterEqual(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start < nums.length ? start : -1;
    }

    private int findLastLessEqual(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end >= 0 ? end : -1;
    }
}
