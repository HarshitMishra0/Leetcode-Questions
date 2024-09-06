import java.util.Arrays;

public class L_154 {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
