public class L_41 {
    public int firstMissingPositive(int[] nums) {

        int i = 0;
        int n = nums.length;
        int answer = n;

        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                answer = j + 1;
                return answer;

            }
        }
        return n + 1;
    }

}
