public class L_2419 {
    public int longestSubarray(int[] nums) {

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int currentLength = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }
}
