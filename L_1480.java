public class L_1480 {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
