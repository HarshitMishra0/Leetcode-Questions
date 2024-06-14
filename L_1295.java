public class L_1295 {
    public int findNumbers(int[] nums) {

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int count = 0;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            if (count != 0 && count % 2 == 0) {
                counter = counter + 1;
            }
        }
        return counter;

    }

}
