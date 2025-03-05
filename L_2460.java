public class L_2460 {
    public int[] applyOperations(int[] nums) {

        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
            i++;
        }
        int a = 0;
        int ans[] = new int[nums.length];

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[a] = nums[i];
                a++;
            }
        }

        while (a < nums.length) {
            ans[a] = 0;
            a++;
        }

        return ans;
    }
}
