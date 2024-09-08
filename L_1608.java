public class L_1608 {
    public int specialArray(int[] nums) {

        for (int i = 0; i < nums.length
                + 1; i++) {
            int number = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    number++;
                }
            }
            if (number == i) {
                return number;
            }
        }
        return -1;
    }
}
