public class L_2562 {
    public long findTheArrayConcVal(int[] nums) {
        long answer = 0;
        int j = nums.length - 1;

        for (int i = 0; i < nums.length / 2; i++) {
            if (i != j) {
                String yes = "" + nums[i] + nums[j];
                answer = answer + Integer.parseInt(yes);
                j--;
            }
        }

        if (nums.length % 2 != 0) {
            String yes = "" + nums[j];
            answer = answer + Integer.parseInt(yes);
        }
        return answer;
    }
}
