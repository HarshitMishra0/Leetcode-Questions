public class L_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int a = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * a;
            a = a * nums[i];
        }
        return answer;
    }
}
