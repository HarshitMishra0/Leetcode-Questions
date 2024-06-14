public class L_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * (nums.length)];

        for (int i = 0; i < nums.length + 1; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else if (i >= nums.length) {
                for (int n = 0; n < nums.length; n++) {
                    ans[i + n] = nums[n];
                }
            }
        }

        return ans;
    }
}
