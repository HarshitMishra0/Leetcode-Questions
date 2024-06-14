public class L_287 {
    public int findDuplicate(int[] nums) {
        int answer = 0;

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    answer = nums[i];
                    return answer;

                }
            } else {
                i++;
            }

        }

        return answer;

    }
}
