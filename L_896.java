public class L_896 {
    public boolean isMonotonic(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] <= nums[end]) {
            int a = nums[0];
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] < a || nums[i] > nums[end]) {
                    return false;
                }
                a = nums[i];
            }
        }

        if (nums[start] >= nums[end]) {
            int a = nums[0];
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] > a || nums[i] < nums[end]) {
                    return false;
                }
                a = nums[i];
            }
        }

        return true;
    }
}
