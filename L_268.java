public class L_268 {
    public int missingNumber(int[] nums) {

        int i = 0;
        int n = nums.length;

        while (i < nums.length) {
            int correct = nums[i];

            if (nums[i] != n && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }

        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return n;

    }
}
